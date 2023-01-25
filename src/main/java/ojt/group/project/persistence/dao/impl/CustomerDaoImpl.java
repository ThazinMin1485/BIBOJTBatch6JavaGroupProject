package ojt.group.project.persistence.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import ojt.group.project.crud.web.form.BookingBusticketForm;
import ojt.group.project.crud.web.form.LoginForm;
import ojt.group.project.persistence.dao.CustomerDao;
import ojt.group.project.persistence.entity.Bus;
import ojt.group.project.persistence.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao{
    @Autowired
    private HibernateTemplate hiberneteTemplate;
    
    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public void addCustomer(Customer cus) {
        sessionFactory.getCurrentSession().save(cus);
    }
    
    @Override
    public List<Customer> getAllCus() {
        return hiberneteTemplate.loadAll(Customer.class);
    }
    
    @Override
    //Login
      public void login(LoginForm loginForm) {
          sessionFactory.getCurrentSession().save(loginForm);
      }
    
    @SuppressWarnings("rawtypes")
    public Customer findByEmail(String email) {

        String userQuery = "SELECT e FROM BusTicketBooking e WHERE e.email = :email";
        Query query = this.sessionFactory.getCurrentSession().createQuery(userQuery);
        query.setParameter("email", email);
        Customer cus = (Customer) query.uniqueResult();
        return cus;
    }
    
    public void bookingbusticket(BookingBusticketForm bookingbusticketForm) {
        sessionFactory.getCurrentSession().save(bookingbusticketForm);
    }
    
    @Override
    public void addBus(Bus bus) {
        sessionFactory.getCurrentSession().save(bus);
    }
    
    @Override
    public List<Bus> getAllBus(){
        return hiberneteTemplate.loadAll(Bus.class);
    }
}


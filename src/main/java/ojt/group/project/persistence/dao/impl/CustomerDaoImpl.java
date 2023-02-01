package ojt.group.project.persistence.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import ojt.group.project.persistence.dao.CustomerDao;
import ojt.group.project.persistence.entity.Customer;
import ojt.group.project.web.form.LoginForm;

/**
 * <h2> CustomerDaoImpl Class</h2>
 * <p>
 * Process for Displaying CustomerDaoImpl
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@Repository
public class CustomerDaoImpl implements CustomerDao{
    /**
     * <h2> hiberneteTemplate</h2>
     * <p>
     * hiberneteTemplate
     * </p>
     */
    @Autowired
    private HibernateTemplate hiberneteTemplate;
    
    /**
     * <h2> sessionFactory</h2>
     * <p>
     * sessionFactory
     * </p>
     */
    @Autowired
    private SessionFactory sessionFactory;
    
    /**
     * <h2> addCustomer </h2>
     * <p>
     * 
     * </p>
     * 
     * @param cus
     */
    @Override
    public void addCustomer(Customer cus) {
        sessionFactory.getCurrentSession().save(cus);
    }
    
    /**
     * <h2> getAllCus </h2>
     * <p>
     * 
     * </p>
     * 
     * @return
     */
    @Override
    public List<Customer> getAllCus() {
        return hiberneteTemplate.loadAll(Customer.class);
    }
    
    /**
     * <h2> login </h2>
     * <p>
     * 
     * </p>
     * 
     * @param loginForm
     */
    @Override
    //Login
      public void login(LoginForm loginForm) {
          sessionFactory.getCurrentSession().save(loginForm);
      }
    
    /**
     * <h2> findByEmail </h2>
     * <p>
     * 
     * </p>
     * 
     * @param email
     * @return
     */
    @SuppressWarnings("rawtypes")
    public Customer findByEmail(String email) {

        String userQuery = "SELECT e FROM BusTicketBooking e WHERE e.email = :email";
        Query query = this.sessionFactory.getCurrentSession().createQuery(userQuery);
        query.setParameter("email", email);
        Customer cus = (Customer) query.uniqueResult();
        return cus;
    }
    
    @SuppressWarnings("rawtypes")
	public Customer dbGetCustomerByEmail(String email) { 	
    	String cusQuery = "SELECT c FROM Customer c WHERE c.email = :email";
    	  Query query = this.sessionFactory.getCurrentSession().createQuery(cusQuery);
    	  query.setParameter("email", email);
    	  Customer cus = (Customer) query.uniqueResult();
    	  return cus;
    }
}


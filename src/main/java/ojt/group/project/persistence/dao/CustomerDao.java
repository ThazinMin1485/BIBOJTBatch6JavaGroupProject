package ojt.group.project.persistence.dao;

import java.util.List;

import ojt.group.project.crud.web.form.BookingBusticketForm;
import ojt.group.project.crud.web.form.LoginForm;
import ojt.group.project.persistence.entity.Bus;
import ojt.group.project.persistence.entity.Customer;
public interface CustomerDao {
 // add customer
    public void addCustomer(Customer cus);

    // get all customer
    public List<Customer> getAllCus();
    
    // get customer by email
    public Customer findByEmail(String email);
    
    //Login
    public void login(LoginForm loginForm);
    
    //Booking Bus Ticket
    public void bookingbusticket(BookingBusticketForm bookingbusticketForm);
    
    //add bus
    public void addBus(Bus bus);
    
    //get all Bus
    public List<Bus> getAllBus();
}

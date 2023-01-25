package ojt.group.project.bl.service;

import java.util.List;

import ojt.group.project.bl.dto.BusDto;
import ojt.group.project.bl.dto.CustomerDto;
import ojt.group.project.crud.web.form.BookingBusticketForm;
import ojt.group.project.crud.web.form.BusForm;
import ojt.group.project.crud.web.form.LoginForm;
import ojt.group.project.crud.web.form.RegisterForm;

public interface CustomerService {
 // add customer
    public void addCus(RegisterForm regForm);

    // get all customer
    public List<CustomerDto> getAllCus();
    
    // get customer by email
    public CustomerDto findByEmail(String email);
    
  //Login
    public void login(LoginForm loginForm);
    
    //booking Bus Ticket
    public void bookingbusticket(BookingBusticketForm bookingbusticketForm);
    
    //add bus
    public void addBus(BusForm busForm);
    
    //get all bus
    public List<BusDto> getAllBus();
}

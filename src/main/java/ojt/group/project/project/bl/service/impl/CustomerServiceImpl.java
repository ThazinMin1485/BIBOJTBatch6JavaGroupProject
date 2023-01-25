package ojt.group.project.project.bl.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ojt.group.project.bl.dto.BusDto;
import ojt.group.project.bl.dto.CustomerDto;
import ojt.group.project.bl.service.CustomerService;
import ojt.group.project.crud.web.form.BookingBusticketForm;
import ojt.group.project.crud.web.form.BusForm;
import ojt.group.project.crud.web.form.LoginForm;
import ojt.group.project.crud.web.form.RegisterForm;
import ojt.group.project.persistence.dao.CustomerDao;
import ojt.group.project.persistence.entity.Bus;
import ojt.group.project.persistence.entity.Customer;
import ojt.group.project.persistence.entity.Login;

@Transactional
@Service
public class CustomerServiceImpl  implements CustomerService{
    @Autowired
    private CustomerDao customerDao;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private MessageSource messageSource;
    
 // add employee
    @Override
    public void addCus(RegisterForm regForm) {
        Customer cus=new Customer();
        cus.setUserName(regForm.getUserName());
        cus.setGender(regForm.getGender());
        cus.setAge(regForm.getAge());
        cus.setNrc(regForm.getNrc());
        cus.setAddress(regForm.getAddress());
        cus.setPhno(regForm.getPhno());
        cus.setEmail(regForm.getEmail());
        cus.setPassword(passwordEncoder.encode(regForm.getPassword()));
        customerDao.addCustomer(cus);
    }
    
    @Override
    public List<CustomerDto> getAllCus() {
 List<Customer> allCus = customerDao.getAllCus();
        
        List<CustomerDto> customer = new ArrayList<CustomerDto>();
        for (Customer cus : allCus) {
            CustomerDto cusDto = new CustomerDto(cus);
            cusDto.setId(cus.getCustomerid());
            cusDto.setUserName(cus.getUserName());
            cusDto.setGender(cus.getGender());
            cusDto.setAge(cus.getAge());
            cusDto.setNrc(cus.getNrc());
            cusDto.setAddress(cus.getAddress());
            cusDto.setPhno(cus.getPhno());
            cusDto.setEmail(cus.getEmail());
            customer.add(cusDto);
        }
        return customer;
    }
    
 // get customer by email

    public CustomerDto findByEmail(String email) {
        Customer cus = customerDao.findByEmail(email);

        if (cus == null) {
            return null;
        }
        CustomerDto customerdto = new CustomerDto(cus);
        return customerdto;
    }
    
    //Login
    public void login(LoginForm loginForm) {
     Login login=new Login();
     login.setEmail(loginForm.getEmail());
     login.setPassword(passwordEncoder.encode(loginForm.getPassword()));
 }
    
    //booking bus ticket
    public void bookingbusticket(BookingBusticketForm bookingbusticketForm) {
        BookingBusticketForm bookingbusticket=new BookingBusticketForm();
        bookingbusticket.setFrom(bookingbusticketForm.getFrom()); 
        bookingbusticket.setTo(bookingbusticketForm.getTo());
        bookingbusticket.setDeparture_date(bookingbusticketForm.getDeparture_date());
        bookingbusticket.setAge(bookingbusticketForm.getAge()); 
    }
    
    //add bus
    @Override
    public void addBus(BusForm busForm) {
        Bus bus=new Bus();
        bus.setBusno(busForm.getBusno());
        bus.setBusstatus(busForm.getBusstatus());
        bus.setDriverid(busForm.getDriverid());
    }
    public List<BusDto> getAllBus(){
 List<Bus> allBus = customerDao.getAllBus();
        
        List<BusDto> bus = new ArrayList<BusDto>();
        for (Bus b : allBus) {
            BusDto bDto = new BusDto(b);
            bDto.setBusid(b.getBusId());
            bDto.setBusno(b.getBusno());
            bDto.setBusstatus(b.getBusstatus());
        }
        return bus;
    }
        
    }

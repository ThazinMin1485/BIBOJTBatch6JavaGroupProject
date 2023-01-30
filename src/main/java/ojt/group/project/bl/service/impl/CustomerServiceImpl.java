package ojt.group.project.bl.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ojt.group.project.bl.dto.CustomerDto;
import ojt.group.project.bl.service.CustomerService;
import ojt.group.project.crud.web.form.LoginForm;
import ojt.group.project.crud.web.form.RegisterForm;
import ojt.group.project.persistence.dao.CustomerDao;
import ojt.group.project.persistence.entity.Customer;
import ojt.group.project.persistence.entity.Login;

/**
 * <h2> CustomerServiceImpl Class</h2>
 * <p>
 * Process for Displaying CustomerServiceImpl
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@Transactional
@Service
public class CustomerServiceImpl  implements CustomerService{
    /**
     * <h2> customerDao</h2>
     * <p>
     * customerDao
     * </p>
     */
    @Autowired
    private CustomerDao customerDao;
    

    /**
     * <h2> passwordEncoder</h2>
     * <p>
     * passwordEncoder
     * </p>
     */
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    
    /**
     * <h2> addCus </h2>
     * <p>
     * 
     * </p>
     * 
     * @param regForm
     */
    @Override
    public void addCus(RegisterForm regForm) {
        Customer cus=new Customer();
        cus.setUserName(regForm.getUserName());
        cus.setGender(regForm.getGender());
        cus.setAge(regForm.getAge());
        cus.setNrc(regForm.getNrc());
        cus.setAddress(regForm.getAddress());
        cus.setPh_no(regForm.getPh_no());
        cus.setEmail(regForm.getEmail());
        cus.setPassword(passwordEncoder.encode(regForm.getPassword()));
        cus.setCreatedat(new Date());
        customerDao.addCustomer(cus);
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
            cusDto.setPh_no(cus.getPh_no());
            cusDto.setEmail(cus.getEmail());
            customer.add(cusDto);
        }
        return customer;
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
    public CustomerDto findByEmail(String email) {
        Customer cus = customerDao.findByEmail(email);

        if (cus == null) {
            return null;
        }
        CustomerDto customerdto = new CustomerDto(cus);
        return customerdto;
    }

    /**
     * <h2> login </h2>
     * <p>
     * 
     * </p>
     * 
     * @param loginForm
     */
    public void login(LoginForm loginForm) {
     Login login=new Login();
     login.setEmail(loginForm.getEmail());
     login.setPassword(passwordEncoder.encode(loginForm.getPassword()));
 }
     
    }

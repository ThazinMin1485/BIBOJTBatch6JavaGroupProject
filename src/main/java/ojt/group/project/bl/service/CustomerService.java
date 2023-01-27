package ojt.group.project.bl.service;

import java.util.List;

import ojt.group.project.bl.dto.CustomerDto;
import ojt.group.project.crud.web.form.LoginForm;
import ojt.group.project.crud.web.form.RegisterForm;

/**
 * <h2> CustomerService Class</h2>
 * <p>
 * Process for Displaying CustomerService
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
public interface CustomerService {
    // add customer
    public void addCus(RegisterForm regForm);

    // get all customer
    public List<CustomerDto> getAllCus();
    
    // get customer by email
    public CustomerDto findByEmail(String email);
    
    //Login
    public void login(LoginForm loginForm);
 
}

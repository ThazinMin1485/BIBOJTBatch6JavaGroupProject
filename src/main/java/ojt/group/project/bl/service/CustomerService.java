package ojt.group.project.bl.service;

import java.util.List;

import ojt.group.project.bl.dto.CustomerDto;
import ojt.group.project.persistence.entity.Customer;
import ojt.group.project.web.form.LoginForm;
import ojt.group.project.web.form.RegisterForm;

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
    
	/**
	 * <h2> doGetCustomerByEmail</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param email
	 * @return
	 * @return Customer
	 */
	public Customer doGetCustomerByEmail(String email);
 
}

package ojt.group.project.persistence.dao;

import java.util.List;

import ojt.group.project.persistence.entity.Customer;
import ojt.group.project.web.form.LoginForm;

/**
 * <h2>CustomerDao Class</h2>
 * <p>
 * Process for Displaying CustomerDao
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
public interface CustomerDao {
	// add customer
	public void addCustomer(Customer cus);

	// get all customer
	public List<Customer> getAllCus();

	// get customer by email
	public Customer findByEmail(String email);

	// Login
	public void login(LoginForm loginForm);

	public Customer dbGetCustomerByEmail(String email);

	public Customer getCustomerById(int id);

	public void updateCustomer(Customer cus);

	public void deleteCustomer(int id);
}

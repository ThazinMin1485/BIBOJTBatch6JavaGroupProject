package ojt.group.project.web.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ojt.group.project.bl.dto.CustomerDto;
import ojt.group.project.bl.service.CustomerService;
import ojt.group.project.persistence.entity.Customer;
import ojt.group.project.web.form.CreateCusForm;
import ojt.group.project.web.form.LoginForm;
import ojt.group.project.web.form.RegisterForm;

/**
 * <h2> CustomerController Class</h2>
 * <p>
 * Process for Displaying CustomerController
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@Controller
public class CustomerController {
    
    
    /**
     * <h2> customerService</h2>
     * <p>
     * customerService
     * </p>
     */
    @Autowired
    private CustomerService customerService;
    
    /**
     * <h2> showLogin</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return ModelAndView
     */
    @RequestMapping(value = { "/login" }, method = RequestMethod.GET)
    public ModelAndView showLogin() {
        
       ModelAndView view =new ModelAndView();
       LoginForm login =new LoginForm();
       view.addObject("login",login);
        return view;
    }
 
    /**
     * <h2> login</h2>
     * <p>
     * 
     * </p>
     *
     * @param login
     * @param result
     * @return
     * @return String
     */
    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String login(@Valid @ModelAttribute("login") LoginForm login, BindingResult result) {
    	Customer customer = this.customerService.doGetCustomerByEmail(login.getEmail());
           if(result.hasErrors()) {
               return "login";
           }else {
        	   if(login.getEmail()=="admin2023@gmail.com" || customer.getType()==1) {
        		   customerService.login(login);
                   return "redirect:/bus";
        	   }else {
        		   return "redirect:/reservation";
        	   }
           }
        }
    
    /**
     * <h2> showRegister</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return ModelAndView
     */
    @RequestMapping(value = { "/addCustomer" }, method = RequestMethod.GET)
    public ModelAndView showRegister() {
       ModelAndView view =new ModelAndView();
       CreateCusForm customer =new CreateCusForm();
       view.addObject("customer",customer);
        return view;
    }
    

    /**
     * <h2> insertCustomer</h2>
     * <p>
     * 
     * </p>
     *
     * @param reg
     * @param result
     * @return
     * @return String
     */
    @RequestMapping(value = { "/insertCustomer" }, method = RequestMethod.POST)
    public String insertCustomer(@Valid @ModelAttribute("registerForm") RegisterForm reg, BindingResult result) {
        if (result.hasErrors()) {
            return "register";
        }
        else {
            customerService.addCus(reg);
            return "redirect:/login";
        }
    }
    
    /**
     * <h2> lodeCustomer</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return ModelAndView
     */
    @GetMapping("/customerReport")
    public ModelAndView lodeCustomer() {
        ModelAndView report = new ModelAndView("customerReport");
        List<CustomerDto> cus = customerService.getAllCus();
        report.addObject("customer", cus);

        return report;
    }
}

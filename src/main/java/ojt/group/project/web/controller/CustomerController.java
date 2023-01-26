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
import ojt.group.project.crud.web.form.CreateCusForm;
import ojt.group.project.crud.web.form.LoginForm;
import ojt.group.project.crud.web.form.RegisterForm;

@Controller
public class CustomerController {
    
    
    @Autowired
    private CustomerService customerService;
    
    @RequestMapping(value = { "/login" }, method = RequestMethod.GET)
    public ModelAndView showLogin() {
        
       ModelAndView view =new ModelAndView();
       LoginForm login =new LoginForm();
       view.addObject("login",login);
        return view;
    }
 
    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String login(@Valid @ModelAttribute("login") LoginForm login, BindingResult result) {
           if(result.hasErrors()) {
               System.out.println("Error");
               return "login";
           }else {
               customerService.login(login);
              return "redirect:/bookingbusticket";
           }
        }
    
    @RequestMapping(value = { "/addCustomer" }, method = RequestMethod.GET)
    public ModelAndView showRegister() {
       ModelAndView view =new ModelAndView();
       CreateCusForm customer =new CreateCusForm();
       view.addObject("customer",customer);
        return view;
    }
    

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
    
    @GetMapping("/customerReport")
    public ModelAndView lodeCustomer() {
        ModelAndView report = new ModelAndView("customerReport");
        List<CustomerDto> cus = customerService.getAllCus();
        report.addObject("customer", cus);

        return report;
    }
}

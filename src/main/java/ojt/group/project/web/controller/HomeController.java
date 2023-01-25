package ojt.group.project.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ojt.group.project.crud.web.form.BookingBusticketForm;
import ojt.group.project.crud.web.form.BusForm;
import ojt.group.project.crud.web.form.ContactUsForm;
import ojt.group.project.crud.web.form.LoginForm;
import ojt.group.project.crud.web.form.RegisterForm;

@Controller
public class HomeController {
    
    @RequestMapping(value= {"/"})
    public String viewHome() {
        return "home";
    }
    
    @RequestMapping("/login")
    public ModelAndView viewLogin() {
        ModelAndView view =new ModelAndView("login");
        LoginForm loginForm =new LoginForm();
        view.addObject("login", loginForm);
        return view;
    }


    @RequestMapping("/register")
    public ModelAndView viewRegister() {
        ModelAndView view=new ModelAndView("register");
        RegisterForm registerForm =new RegisterForm();
        view.addObject("registerForm",registerForm);
        return view;
    }
    @RequestMapping("/contactus")
    public ModelAndView viewContactUs() {
        ModelAndView view=new ModelAndView("contactus");
        ContactUsForm contactUsForm =new ContactUsForm();
        view.addObject("contactus",contactUsForm);
        return view;
    }
    
    @RequestMapping("/bookingbusticket")
    public ModelAndView viewBookingBusTicket() {
        ModelAndView view=new ModelAndView("bookingbusticket");
        BookingBusticketForm bookingbusticketForm =new BookingBusticketForm();
        view.addObject("bookingbusticket",bookingbusticketForm);
        return view;
    }
    
    @RequestMapping("/bus")
    public ModelAndView viewBus() {
        ModelAndView view=new ModelAndView("bus");
        BusForm busForm =new BusForm();
        view.addObject("bus",busForm);
        return view;
    }
   
}

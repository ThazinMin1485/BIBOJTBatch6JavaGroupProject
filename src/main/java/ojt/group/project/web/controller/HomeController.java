package ojt.group.project.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ojt.group.project.web.form.ContactUsForm;
import ojt.group.project.web.form.LoginForm;
import ojt.group.project.web.form.RegisterForm;

/**
 * <h2> HomeController Class</h2>
 * <p>
 * Process for Displaying HomeController
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@Controller
public class HomeController {
    
    /**
     * <h2> viewHome</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return String
     */
    @RequestMapping(value= {"/"})
    public ModelAndView viewHome() {
    	ModelAndView view =new ModelAndView("login");
        LoginForm loginForm =new LoginForm();
        view.addObject("login", loginForm);
        return view;
    }
    
    /**
     * <h2> viewLogin</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return ModelAndView
     */
    @RequestMapping("/login")
    public ModelAndView viewLogin() {
        ModelAndView view =new ModelAndView("login");
        LoginForm loginForm =new LoginForm();
        view.addObject("login", loginForm);
        return view;
    }


    /**
     * <h2> viewRegister</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return ModelAndView
     */
    @RequestMapping("/register")
    public ModelAndView viewRegister() {
        ModelAndView view=new ModelAndView("register");
        RegisterForm registerForm =new RegisterForm();
        view.addObject("registerForm",registerForm);
        return view;
    }
    /**
     * <h2> viewContactUs</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return ModelAndView
     */
    @RequestMapping("/contactus")
    public ModelAndView viewContactUs() {
        ModelAndView view=new ModelAndView("contactus");
        ContactUsForm contactUsForm =new ContactUsForm();
        view.addObject("contactus",contactUsForm);
        return view;
    }
}

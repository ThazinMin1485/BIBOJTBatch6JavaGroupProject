package ojt.group.project.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ojt.group.project.web.form.ContactUsForm;
import ojt.group.project.web.form.LoginForm;
import ojt.group.project.web.form.RegisterForm;

/**
 * <h2>HomeController Class</h2>
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
	 * <h2>viewHome</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @return
	 * @return String
	 */
	@RequestMapping(value = { "/" })
	public String viewHome() {
		return "login";
	}

	/**
	 * <h2>viewLogin</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @return
	 * @return ModelAndView
	 */
	@RequestMapping("/login")
	public String viewLogin() {
		return "login";
	}

//	@RequestMapping(value = { "/logout" }, method = RequestMethod.GET)
//	public String viewLogOut(HttpServletRequest req, HttpServletResponse res) {
//		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//		if (auth != null) {
//			new SecurityContextLogoutHandler().logout(req, res, auth);
//		}
//		return "login";
//	}

	
	/**
	 * <h2>viewRegister</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @return
	 * @return ModelAndView
	 */
	@RequestMapping("/register")
	public ModelAndView viewRegister() {
		ModelAndView view = new ModelAndView("register");
		RegisterForm registerForm = new RegisterForm();
		view.addObject("registerForm", registerForm);
		return view;
	}

	/**
	 * <h2>viewContactUs</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @return
	 * @return ModelAndView
	 */
	@RequestMapping("/contactus")
	public ModelAndView viewContactUs() {
		ModelAndView view = new ModelAndView("contactus");
		ContactUsForm contactUsForm = new ContactUsForm();
		view.addObject("contactus", contactUsForm);
		return view;
	}
}

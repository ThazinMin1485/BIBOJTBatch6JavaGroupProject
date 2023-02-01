package ojt.group.project.web.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ojt.group.project.bl.dto.BusDto;
import ojt.group.project.bl.service.BusService;
import ojt.group.project.persistence.entity.Bus;
import ojt.group.project.web.form.BusForm;

/**
 * <h2> BusController Class</h2>
 * <p>
 * Process for Displaying BusController
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@Controller
public class BusController {
	
	/**
	 * <h2> busService</h2>
	 * <p>
	 * busService
	 * </p>
	 */
	@Autowired
    private BusService busService;
	
	/**
	 * <h2> viewBookingBusTicket</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @return
	 * @return ModelAndView
	 */
	@RequestMapping("/bus")
    public ModelAndView viewBookingBusTicket() {
        ModelAndView view=new ModelAndView("bus");
        BusForm busForm =new BusForm();
        view.addObject("busForm",busForm);
        return view;
    }
	
    /**
     * <h2> insertCustomer</h2>
     * <p>
     * 
     * </p>
     *
     * @param bus
     * @param result
     * @return
     * @return ModelAndView
     */
    @RequestMapping(value = "/insertbus", method = RequestMethod.POST)
    public ModelAndView insertCustomer(@Valid @ModelAttribute("busForm") BusForm bus, BindingResult result) {
    	 ModelAndView view=new ModelAndView("bus");
        if (result.hasErrors()) {
            return view;
        }
        else {
            busService.addBus(bus);
            view.setViewName("redirect:/busReport");
        }
		return view;
    }
    
    /**
     * <h2> showBusList</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return ModelAndView
     */
    @RequestMapping(value = "/busReport")
    public ModelAndView showBusList() {
    	ModelAndView view =new ModelAndView("busReport");
    	List<BusDto> list =this.busService.getAllBus();
    	return view.addObject("list", list);
    }

    
    @GetMapping("/editBus/{busid}")
    public String lodeEditBus(@PathVariable(value = "busid") int busid, Model m) {
        Bus bus = busService.getById(busid);

        System.out.println(bus);
        m.addAttribute("updateBus", bus);
        m.addAttribute("title", "Edit Bus");

        return "editBus";
    }
    
    /**
     * <h2> updateBus</h2>
     * <p>
     * 
     * </p>
     *
     * @param bus
     * @return
     * @return String
     */
    @PostMapping("/editBus/updateBus")
    public String updateBus(@ModelAttribute("updateBus") Bus bus) {
        busService.updateBus(bus);

        return "redirect:/busReport";
    }
    
    /**
     * <h2> deleteBus</h2>
     * <p>
     * 
     * </p>
     *
     * @param busid
     * @return
     * @return String
     */
    @GetMapping("/deleteBus/{busid}")
    public String deleteBus(@PathVariable int busid) {
        busService.deleteBus(busid);

        return "redirect:/busReport";
    }
}

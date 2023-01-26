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
import ojt.group.project.crud.web.form.BusForm;
import ojt.group.project.persistence.entity.Bus;

@Controller
public class BusController {
	
	@Autowired
    private BusService busService;
	
	@RequestMapping("/bus")
    public ModelAndView viewBookingBusTicket() {
        ModelAndView view=new ModelAndView("bus");
        BusForm busForm =new BusForm();
        view.addObject("busForm",busForm);
        return view;
    }
	
    @RequestMapping(value = "/insertbus", method = RequestMethod.POST)
    public ModelAndView insertCustomer(@Valid @ModelAttribute("busForm") BusForm bus, BindingResult result) {
    	 ModelAndView view=new ModelAndView("bus");
        if (result.hasErrors()) {
        	System.out.println("error");
            return view;
        }
        else {
            busService.addBus(bus);
            view.setViewName("redirect:/busReport");
        }
		return view;
    }
    
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
        m.addAttribute("Bus", bus);
        m.addAttribute("title", "Edit Bus");

        return "editBus";
    }
    
    @PostMapping("/editBus/updateBus")
    public String updateBus(@ModelAttribute("updateBus") Bus bus) {
        busService.updateBus(bus);

        return "redirect:/busReport";
    }
    
    @GetMapping("/deleteBus/{busid}")
    public String deleteBus(@PathVariable int busid) {
        busService.deleteBus(busid);

        return "redirect:/busReport";
    }
}

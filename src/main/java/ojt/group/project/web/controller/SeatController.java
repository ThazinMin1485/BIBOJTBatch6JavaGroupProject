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

import ojt.group.project.bl.dto.SeatDto;
import ojt.group.project.bl.service.SeatService;
import ojt.group.project.crud.web.form.SeatForm;
import ojt.group.project.persistence.entity.Seat;

@Controller
public class SeatController {
	@Autowired
    private SeatService seatService;
	
	@RequestMapping("/seat")
    public ModelAndView viewBookingBusTicket() {
        ModelAndView view=new ModelAndView("seat");
        SeatForm seatForm =new SeatForm();
        view.addObject("seatForm",seatForm);
        return view;
    }
	
    @RequestMapping(value = "/insertseat", method = RequestMethod.POST)
    public ModelAndView insertSeat(@Valid @ModelAttribute("seatForm") SeatForm seat, BindingResult result) {
    	 ModelAndView view=new ModelAndView("seat");
        if (result.hasErrors()) {
        	System.out.println("error");
            return view;
        }
        else {
            seatService.addSeat(seat);
            view.setViewName("redirect:/seatReport");
        }
		return view;
    }
    
    @RequestMapping(value = "/seatReport")
    public ModelAndView showBusList() {
    	ModelAndView view =new ModelAndView("seatReport");
    	List<SeatDto> list =this.seatService.getAllSeat();
    	return view.addObject("list", list);
    }
    
    @GetMapping("/editSeat/{seatid}")
    public String lodeEditForm(@PathVariable(value = "seatid") int seatid, Model m) {
        Seat seat = seatService.getById(seatid);

        System.out.println(seat);
        m.addAttribute("Seat", seat);

        return "editSeat";
    }
    
    @PostMapping("/editSeat/updateSeat")
    public String updateSeat(@ModelAttribute("updateSeat") Seat seat) {
        seatService.updateSeat(seat);

        return "redirect:/seatReport";
    }
    
    @GetMapping("/deleteSeat/{seatid}")
    public String deleteSeat(@PathVariable int seatid) {
        seatService.deleteSeat(seatid);

        return "redirect:/seatReport";
    }
}

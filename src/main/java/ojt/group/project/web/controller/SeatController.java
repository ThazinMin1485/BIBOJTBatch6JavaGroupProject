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

/**
 * <h2> SeatController Class</h2>
 * <p>
 * Process for Displaying SeatController
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@Controller
public class SeatController {
	/**
	 * <h2> seatService</h2>
	 * <p>
	 * seatService
	 * </p>
	 */
	@Autowired
    private SeatService seatService;
	
	/**
	 * <h2> viewBookingBusTicket</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @return
	 * @return ModelAndView
	 */
	@RequestMapping("/seat")
    public ModelAndView viewBookingBusTicket() {
        ModelAndView view=new ModelAndView("seat");
        SeatForm seatForm =new SeatForm();
        view.addObject("seatForm",seatForm);
        return view;
    }
	
    /**
     * <h2> insertSeat</h2>
     * <p>
     * 
     * </p>
     *
     * @param seat
     * @param result
     * @return
     * @return ModelAndView
     */
    @RequestMapping(value = "/insertseat", method = RequestMethod.POST)
    public ModelAndView insertSeat(@Valid @ModelAttribute("seatForm") SeatForm seat, BindingResult result) {
    	 ModelAndView view=new ModelAndView("seat");
        if (result.hasErrors()) {
            return view;
        }
        else {
            seatService.addSeat(seat);
            view.setViewName("redirect:/seatReport");
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
    @RequestMapping(value = "/seatReport")
    public ModelAndView showBusList() {
    	ModelAndView view =new ModelAndView("seatReport");
    	List<SeatDto> list =this.seatService.getAllSeat();
    	return view.addObject("list", list);
    }
    
    /**
     * <h2> lodeEditForm</h2>
     * <p>
     * 
     * </p>
     *
     * @param seatid
     * @param m
     * @return
     * @return String
     */
    @GetMapping("/editSeat/{seatid}")
    public String lodeEditForm(@PathVariable(value = "seatid") int seatid, Model m) {
        Seat seat = seatService.getById(seatid);

        System.out.println(seat);
        m.addAttribute("updateSeat", seat);

        return "editSeat";
    }
    
    /**
     * <h2> updateSeat</h2>
     * <p>
     * 
     * </p>
     *
     * @param seat
     * @return
     * @return String
     */
    @PostMapping("/editSeat/updateSeat")
    public String updateSeat(@ModelAttribute("updateSeat") Seat seat) {
        seatService.updateSeat(seat);

        return "redirect:/seatReport";
    }
    
    /**
     * <h2> deleteSeat</h2>
     * <p>
     * 
     * </p>
     *
     * @param seatid
     * @return
     * @return String
     */
    @GetMapping("/deleteSeat/{seatid}")
    public String deleteSeat(@PathVariable int seatid) {
        seatService.deleteSeat(seatid);

        return "redirect:/seatReport";
    }
}

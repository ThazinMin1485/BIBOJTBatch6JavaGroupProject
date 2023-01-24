package ojt.group.project.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ojt.group.project.bl.dto.CustomerDto;
import ojt.group.project.bl.dto.ReservationDto;
import ojt.group.project.bl.dto.TransactionReportDto;
import ojt.group.project.bl.service.ReservationService;
import ojt.group.project.web.form.ReservationForm;

@Controller
public class AdminController {

	@Autowired
	private ReservationService service;
	
	@RequestMapping(value = { "/" })
	public ModelAndView viewReport() {
		ModelAndView report=new ModelAndView("home");
		List<ReservationDto> resList=service.getAllReservationList();
		List<TransactionReportDto> reportList=service.getAllReportList();
		report.addObject("reservation", resList);
		report.addObject("report", reportList);
		return report;
	}
	
	@GetMapping("/editReservation/{reservation_id}")
	public String editReservationForm(@PathVariable(value="reservation_id") int reservation_id,Model m) {
		ReservationForm resv=service.getReservationById(reservation_id);
		System.out.println(resv);
		m.addAttribute("reservation", resv);
		return "editReservation";
		
	}
	
	@RequestMapping(value={"/editReservation/updateReservation"},method=RequestMethod.POST)
	public String updateReservation(@ModelAttribute ("updateReservation") ReservationForm resv) {
		service.updateReservation(resv);
		return "redirect:/";
		
	}
	
	@GetMapping("/deleteReservation/{reservation_id}")
	public String deleteReservationById(@PathVariable(value="reservation_id") int id,Model m) {
		service.deleteReservationById(id);
		return "redirect:/";
	}
	
	@RequestMapping(value = { "/adminPassenger" })
	public ModelAndView viewPassenger() {
		ModelAndView report=new ModelAndView("adminPassenger");
		List<CustomerDto> cusList=service.getCustomerList();
		report.addObject("customer", cusList);
		return report;
	}
	
}

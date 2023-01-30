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

import ojt.group.project.bl.dto.BusDestinationDto;
import ojt.group.project.bl.dto.BusDto;
import ojt.group.project.bl.dto.CustomerDto;
import ojt.group.project.bl.dto.ReservationDto;
import ojt.group.project.bl.dto.SeatDto;
import ojt.group.project.bl.dto.TransactionReportDto;
import ojt.group.project.bl.service.ReservationService;
import ojt.group.project.web.form.ReservationForm;

@Controller
public class AdminController {

	@Autowired
	private ReservationService service;

	@RequestMapping(value = { "/reservation" })
	public ModelAndView viewReport() {
		ModelAndView report = new ModelAndView("reservation");
		List<ReservationDto> resList = service.getAllReservationList();
		List<TransactionReportDto> reportList = service.getAllReportList();
		report.addObject("reservation", resList);
		report.addObject("report", reportList);
		return report;
	}

	@GetMapping("/editReservation/{reservation_id}")
	public String editReservationForm(@PathVariable(value = "reservation_id") int reservation_id, Model m) {
		ReservationForm resv = service.getReservationById(reservation_id);
		System.out.println(resv);
		m.addAttribute("reservation", resv);
		return "editReservation";

	}

	@RequestMapping(value = { "/editReservation/updateReservation" }, method = RequestMethod.POST)
	public String updateReservation(@ModelAttribute("updateReservation") ReservationForm resv) {
		service.updateReservation(resv);
		return "redirect:/reservation";

	}

	@GetMapping("/deleteReservation/{reservation_id}")
	public String deleteReservationById(@PathVariable(value = "reservation_id") int id, Model m) {
		service.deleteReservationById(id);
		return "redirect:/reservation";
	}

	@RequestMapping(value = { "/adminPassenger" })
	public ModelAndView viewPassenger() {
		ModelAndView report = new ModelAndView("adminPassenger");
		List<CustomerDto> cusList = service.getCustomerList();
		report.addObject("customer", cusList);
		return report;
	}

	@RequestMapping(value = { "/busRoute" })
	public ModelAndView viewBusRoute() {
		ModelAndView report = new ModelAndView("busRoute");
		List<BusDto> busList = service.getBusList();
		report.addObject("bus", busList);
		return report;
	}

	@GetMapping("/selectBus/{busId}")
	public String bookingPage(@PathVariable(value = "busId") int busId, Model m) {
		List<SeatDto> st = service.getSeatByBusId(busId);
		BusDestinationDto des = service.getBusDestinationBusId(busId);
		m.addAttribute("seat", st);
		m.addAttribute("destination", des);
		return "booking";

	}
}

package ojt.group.project.bl.service;

import java.util.List;

import ojt.group.project.bl.dto.CustomerDto;
import ojt.group.project.bl.dto.ReservationDto;
import ojt.group.project.bl.dto.TransactionReportDto;
import ojt.group.project.web.form.ReservationForm;

public interface ReservationService {

	public List<ReservationDto> getAllReservationList();

	public ReservationForm getReservationById(int reservation_id);
	
	public void updateReservation(ReservationForm resv);
	
	public void deleteReservationById(int reservation_id);
	
	public List<TransactionReportDto> getAllReportList();
	
	public List<CustomerDto> getCustomerList();
	
}

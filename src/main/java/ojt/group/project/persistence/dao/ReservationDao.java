package ojt.group.project.persistence.dao;

import java.util.List;

import ojt.group.project.persistence.entity.Bus;
import ojt.group.project.persistence.entity.BusDestination;
import ojt.group.project.persistence.entity.Customer;
import ojt.group.project.persistence.entity.Reservation;
import ojt.group.project.persistence.entity.Seat;
import ojt.group.project.persistence.entity.TransactionReport;

public interface ReservationDao {

	public List<Reservation> getAllReservationList();
	
	public Reservation getReservationById(int reservation_id);
	
	public void updateReservation(Reservation resv);
	
	public void updateReport(TransactionReport report);
	
	public TransactionReport getReportById(int reservation_id);
	
	public List<TransactionReport> getAllReportList();
	
	public List<Customer> getCustomerList();
	
	public List<Bus> getBusList();
		
	public List<Seat> getSeatByBusId(int busid);
	
	public BusDestination getDestinationByBusId(int busid);
}

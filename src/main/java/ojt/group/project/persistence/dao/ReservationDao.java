package ojt.group.project.persistence.dao;

import java.util.List;

import ojt.group.project.persistence.entity.Bus;
import ojt.group.project.persistence.entity.BusDestination;
import ojt.group.project.persistence.entity.Customer;
import ojt.group.project.persistence.entity.Reservation;
import ojt.group.project.persistence.entity.Seat;
import ojt.group.project.persistence.entity.TransactionReport;

public interface ReservationDao {

	/**
	 * <h2> getAllReservationList</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @return
	 * @return List<Reservation>
	 */
	public List<Reservation> getAllReservationList();
	
	/**
	 * <h2> getReservationById</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param reservation_id
	 * @return
	 * @return Reservation
	 */
	public Reservation getReservationById(int reservation_id);
	
	/**
	 * <h2> updateReservation</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param resv
	 * @return void
	 */
	public void updateReservation(Reservation resv);
	
	/**
	 * <h2> updateReport</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param report
	 * @return void
	 */
	public void updateReport(TransactionReport report);
	
	/**
	 * <h2> getReportById</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param reservation_id
	 * @return
	 * @return TransactionReport
	 */
	public TransactionReport getReportById(int reservation_id);
	
	/**
	 * <h2> getAllReportList</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @return
	 * @return List<TransactionReport>
	 */
	public List<TransactionReport> getAllReportList();
	
	/**
	 * <h2> getCustomerList</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @return
	 * @return List<Customer>
	 */
	public List<Customer> getCustomerList();
	
	/**
	 * <h2> getBusList</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @return
	 * @return List<Bus>
	 */
	public List<Bus> getBusList();
		
	/**
	 * <h2> getSeatByBusId</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param busid
	 * @return
	 * @return List<Seat>
	 */
	public List<Seat> getSeatByBusId(int busid);

	/**
	 * <h2> getDestinationByBusId</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param busid
	 * @return
	 * @return List<BusDestination>
	 */
	public BusDestination getDestinationByBusId(int busid);
	
	public void addBusDestination(BusDestination bus);
	
	public Seat getSeatById(int seatid);

	public Reservation addReservation(Reservation resv);
	
	public void updateSeat(Seat s);	
}

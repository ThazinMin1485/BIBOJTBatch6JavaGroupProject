package ojt.group.project.bl.service;

import java.util.List;

import ojt.group.project.bl.dto.BusDestinationDto;
import ojt.group.project.bl.dto.BusDto;
import ojt.group.project.bl.dto.CustomerDto;
import ojt.group.project.bl.dto.ReservationDto;
import ojt.group.project.bl.dto.SeatDto;
import ojt.group.project.bl.dto.TransactionReportDto;
import ojt.group.project.web.form.ReservationForm;

public interface ReservationService {

	/**
	 * <h2> getAllReservationList</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @return
	 * @return List<ReservationDto>
	 */
	public List<ReservationDto> getAllReservationList();

	/**
	 * <h2> getReservationById</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param reservation_id
	 * @return
	 * @return ReservationForm
	 */
	public ReservationForm getReservationById(int reservation_id);
	
	/**
	 * <h2> updateReservation</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param resv
	 * @return void
	 */
	public void updateReservation(ReservationForm resv);
	
	/**
	 * <h2> deleteReservationById</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param reservation_id
	 * @return void
	 */
	public void deleteReservationById(int reservation_id);
	
	/**
	 * <h2> getAllReportList</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @return
	 * @return List<TransactionReportDto>
	 */
	public List<TransactionReportDto> getAllReportList();
	
	/**
	 * <h2> getCustomerList</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @return
	 * @return List<CustomerDto>
	 */
	public List<CustomerDto> getCustomerList();
	
	/**
	 * <h2> getBusList</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @return
	 * @return List<BusDto>
	 */
	public List<BusDto> getBusList();
	
	/**
	 * <h2> getSeatByBusId</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param busid
	 * @return
	 * @return List<SeatDto>
	 */
	public List<SeatDto> getSeatByBusId(int busid);

	/**
	 * <h2> getBusDestinationBusId</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param busid
	 * @return
	 * @return List<BusDestinationDto>
	 */

	public BusDestinationDto getBusDestinationBusId(int busid);

}

package ojt.group.project.bl.dto;

import java.text.SimpleDateFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import ojt.group.project.persistence.entity.Reservation;

/**
 * <h2> ReservationDto Class</h2>
 * <p>
 * Process for Displaying ReservationDto
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@AllArgsConstructor
@Data
public class ReservationDto {
	
	/**
	 * <h2> reservation_id</h2>
	 * <p>
	 * reservation_id
	 * </p>
	 */
	private Integer reservation_id;
	/**
	 * <h2> customer_id</h2>
	 * <p>
	 * customer_id
	 * </p>
	 */
	private Integer customer_id;
	/**
	 * <h2> bus_id</h2>
	 * <p>
	 * bus_id
	 * </p>
	 */
	private Integer bus_id;
	/**
	 * <h2> departlocation</h2>
	 * <p>
	 * departlocation
	 * </p>
	 */
	private String departlocation;
	/**
	 * <h2> destinationlocation</h2>
	 * <p>
	 * destinationlocation
	 * </p>
	 */
	private String destinationlocation;
	/**
	 * <h2> departtime</h2>
	 * <p>
	 * departtime
	 * </p>
	 */
	private String departtime;
	/**
	 * <h2> reservationdate</h2>
	 * <p>
	 * reservationdate
	 * </p>
	 */
	private String reservationdate;
	/**
	 * <h2> unitprice</h2>
	 * <p>
	 * unitprice
	 * </p>
	 */
	private Double unitprice;
	/**
	 * <h2> seatamount</h2>
	 * <p>
	 * seatamount
	 * </p>
	 */
	private Integer seatamount;
	/**
	 * <h2> createdat</h2>
	 * <p>
	 * createdat
	 * </p>
	 */
	private String createdat;
	
	/**
	 * <h2> delflag</h2>
	 * <p>
	 * delflag
	 * </p>
	 */
	private Boolean delflag;
	
	/**
	 * <h2> Constructor for ReservationDto </h2>
	 * <p>
	 * Constructor for ReservationDto
	 * </p>
	 * @param reserv
	 */
	public ReservationDto(Reservation reserv) {
		this.reservation_id=reserv.getReservationid();
		this.customer_id=reserv.getCustomerid();
		this.bus_id=reserv.getBusid();
		this.departlocation=reserv.getDepartlocation();
		this.destinationlocation=reserv.getDestinationlocation();
		SimpleDateFormat formDate = new SimpleDateFormat ("dd-MM-yyyy");
    	this.departtime=formDate.format(reserv.getDeparttime());
    	this.reservationdate=formDate.format(reserv.getReservationdate());
    	this.delflag=reserv.getDelflag();
    	this.unitprice=reserv.getUnitprice();
    	this.seatamount=reserv.getSeatamount();
    	this.createdat=formDate.format(reserv.getCreatedat());
	}
	

}

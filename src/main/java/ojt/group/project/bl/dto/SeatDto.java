package ojt.group.project.bl.dto;

import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ojt.group.project.persistence.entity.Seat;

/**
 * <h2>SeatDto Class</h2>
 * <p>
 * Process for Displaying SeatDto
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@Data
@Getter
@Setter
@NoArgsConstructor
public class SeatDto {
	/**
	 * <h2>seatid</h2>
	 * <p>
	 * seatid
	 * </p>
	 */
	private Integer seatid;
	/**
	 * <h2>busid</h2>
	 * <p>
	 * busid
	 * </p>
	 */
	private Integer busid;
	/**
	 * <h2>busno</h2>
	 * <p>
	 * busno
	 * </p>
	 */
	private Integer busno;
	/**
	 * <h2>seatno</h2>
	 * <p>
	 * seatno
	 * </p>
	 */
	private Integer seatno;
	/**
	 * <h2>reservationid</h2>
	 * <p>
	 * reservationid
	 * </p>
	 */
	private Integer reservationid;

	private Date createdat;
	private Boolean delflag;
	private Date updateat;

	/**
	 * <h2>Constructor for SeatDto</h2>
	 * <p>
	 * Constructor for SeatDto
	 * </p>
	 * 
	 * @param seat
	 */
	public SeatDto(Seat seat) {
		if (seat == null) {
			seat = new Seat();
		}
		this.seatid = seat.getSeatid();
		this.busid = seat.getBusid();
		this.busno = seat.getBusno();
		this.seatno = seat.getSeatno();
		this.reservationid = seat.getReservationid();
		this.createdat = seat.getCreatedat();
		this.delflag = seat.getDelflag();
		this.updateat=seat.getUpdateat();
	}
}

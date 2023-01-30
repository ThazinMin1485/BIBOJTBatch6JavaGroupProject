package ojt.group.project.crud.web.form;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ojt.group.project.persistence.entity.Seat;

/**
 * <h2> SeatForm Class</h2>
 * <p>
 * Process for Displaying SeatForm
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class SeatForm {
	/**
	 * <h2> seatid</h2>
	 * <p>
	 * seatid
	 * </p>
	 */
	private Integer seatid;
	/**
	 * <h2> busid</h2>
	 * <p>
	 * busid
	 * </p>
	 */
	@NotNull(message = "Bus Id cannot be empty")
	private Integer busid;
	/**
	 * <h2> busno</h2>
	 * <p>
	 * busno
	 * </p>
	 */
	@NotNull(message = "Bus Number cannot be empty")
	private Integer busno;
	/**
	 * <h2> seatno</h2>
	 * <p>
	 * seatno
	 * </p>
	 */
	@NotNull(message = "Bus Seat cannot be empty")
	private Integer seatno;
	/**
	 * <h2> reservationid</h2>
	 * <p>
	 * reservationid
	 * </p>
	 */
	private Integer reservationid;
	
	/**
	 * <h2> Constructor for SeatForm </h2>
	 * <p>
	 * Constructor for SeatForm
	 * </p>
	 * @param seat
	 */
	public SeatForm (Seat seat) {
        this.seatid=seat.getSeatid();
        this.busid=seat.getBusid();
        this.busno=seat.getBusno();
        this.seatno=seat.getSeatno();
        this.reservationid=seat.getReservationid();

    }
}

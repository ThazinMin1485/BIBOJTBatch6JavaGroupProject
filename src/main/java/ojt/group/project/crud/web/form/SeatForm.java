package ojt.group.project.crud.web.form;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ojt.group.project.persistence.entity.Seat;

@Getter
@Setter
@NoArgsConstructor
public class SeatForm {
	private Integer seatid;
	@NotNull
	private Integer busid;
	@NotNull
	private Integer busno;
	@NotNull
	private Integer seatno;
	@NotNull
	private Integer reservationid;
	
	public SeatForm (Seat seat) {
        this.seatid=seat.getSeatid();
        this.busid=seat.getBusid();
        this.busno=seat.getBusno();
        this.seatno=seat.getSeatno();
        this.reservationid=seat.getReservationid();

    }
}

package ojt.group.project.bl.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ojt.group.project.persistence.entity.Customer;
import ojt.group.project.persistence.entity.Seat;


@Data
@Getter
@Setter
@NoArgsConstructor
public class SeatDto {
	private Integer seatid;
	private Integer busid;
	private Integer busno;
	private Integer seatno;
	private Integer reservationid;
	
	public SeatDto(Seat seat) {
        if (seat == null) {
        	seat = new Seat();
        }
        this.seatid=seat.getSeatid();
        this.busid=seat.getBusid();
        this.busno=seat.getBusno();
        this.seatno=seat.getSeatno();
        this.reservationid=seat.getReservationid();
}
}

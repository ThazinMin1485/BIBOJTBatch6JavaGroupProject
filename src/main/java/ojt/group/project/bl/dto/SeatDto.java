package ojt.group.project.bl.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import ojt.group.project.persistence.entity.Seat;

@AllArgsConstructor
@Data
public class SeatDto {
	private Integer seatid;
	private Integer busid;
	private Integer busno;
	private Integer seatno;
	private Integer reservationid;
	private Date createdat;
	private Date updateat;
	private Boolean delflag;

	public SeatDto(Seat s) {
		this.seatid=s.getSeatid();
		this.busid=s.getBusid();
		this.busno=s.getBusno();
		this.seatno=s.getSeatno();
		this.reservationid=s.getReservationid();
		this.createdat=s.getCreatedat();
		this.updateat=s.getUpdateat();
		this.delflag=s.getDelflag();
	}
}

package ojt.group.project.bl.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import ojt.group.project.persistence.entity.BusDestination;
import ojt.group.project.persistence.entity.Payment;
import ojt.group.project.persistence.entity.Reservation;
import ojt.group.project.persistence.entity.Seat;

@Data
@AllArgsConstructor
public class BookingDto {
	private Integer seatid;
	private Integer busid;
	private Integer seatno;
	private Integer busno;
	private Date createdat;
	private Integer destinationid;
	private String departlocation;
	private String destinationlocation;
	private String departtime;
	private Double unitprice;
	private Integer reservation_id;
	private Integer customer_id;
	private Double seatamount;
	private Double totalamount;

	BookingDto(Seat seat,BusDestination bs) {
		this.seatid = seat.getSeatid();
		this.busid = seat.getBusid();
		this.seatno = seat.getBusno();
		this.createdat = seat.getCreatedat();
		
	}

	BookingDto(BusDestination bs) {
		this.destinationid = bs.getDestinationid();
		this.busid = bs.getBusid();
		this.departlocation = bs.getDepartlocation();
		this.destinationlocation = bs.getDestinationlocation();
		SimpleDateFormat formDate = new SimpleDateFormat("dd-MM-yyyy");
		this.departtime = formDate.format(bs.getDeparttime());
		this.unitprice = bs.getUnitprice();
	}

	BookingDto(Reservation reserv) {
		this.reservation_id = reserv.getReservationid();
		this.customer_id = reserv.getCustomerid();
		this.busid = reserv.getBusid();
		this.departlocation = reserv.getDepartlocation();
		this.destinationlocation = reserv.getDestinationlocation();
		SimpleDateFormat formDate = new SimpleDateFormat("dd-MM-yyyy");
		this.departtime = formDate.format(reserv.getDeparttime());
		this.unitprice = reserv.getUnitprice();
		this.seatamount = reserv.getSeatamount();
	}

	BookingDto(Payment p) {
		this.customer_id = p.getCustomerid();
		this.totalamount = p.getTotalamount();
	}

}

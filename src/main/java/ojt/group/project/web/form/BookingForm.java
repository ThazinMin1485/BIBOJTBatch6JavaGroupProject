package ojt.group.project.web.form;

import java.text.SimpleDateFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import ojt.group.project.persistence.entity.BusDestination;
import ojt.group.project.persistence.entity.Payment;
import ojt.group.project.persistence.entity.Reservation;
import ojt.group.project.persistence.entity.Seat;

@AllArgsConstructor
@Data
public class BookingForm {
	private Integer customerid;
	private Integer busid;
	private String departlocation;
	private String destinationlocation;
	private String departtime;
	private Double unitprice;
	private Double seatamount;
	private Integer seatid;
	private Integer seatno;
	private Double totalamount;
	private Integer destinationid;

	public BookingForm(Reservation res) {
		this.busid = res.getBusid();
		SimpleDateFormat formDate = new SimpleDateFormat("dd-MM-yyyy");
		this.customerid = res.getCustomerid();
		this.departlocation = res.getDepartlocation();
		this.destinationlocation = res.getDestinationlocation();
		this.departtime = formDate.format(res.getDeparttime());
		this.unitprice = res.getUnitprice();
		this.seatamount = res.getSeatamount();

	}

	public BookingForm(BusDestination bs) {

		this.destinationid = bs.getDestinationid();
		this.busid = bs.getBusid();
		this.departlocation = bs.getDepartlocation();
		this.destinationlocation = bs.getDestinationlocation();
		SimpleDateFormat formDate = new SimpleDateFormat("dd-MM-yyyy");
		this.departtime = formDate.format(bs.getDeparttime());
		this.unitprice = bs.getUnitprice();
	}

	public BookingForm(Seat seat) {
		this.busid = seat.getBusid();
		this.seatid = seat.getSeatid();
		this.seatno = seat.getSeatno();
	}

	public BookingForm(Payment p) {
		this.customerid = p.getCustomerid();
		this.totalamount = p.getTotalamount();
	}
}

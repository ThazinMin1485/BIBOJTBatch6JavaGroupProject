package ojt.group.project.bl.dto;

import java.text.SimpleDateFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import ojt.group.project.persistence.entity.Reservation;

@AllArgsConstructor
@Data
public class ReservationDto {
	
	private Integer reservation_id;
	private Integer customer_id;
	private Integer bus_id;
	private String departlocation;
	private String destinationlocation;
	private String departtime;
	private String reservationdate;
	private Double unitprice;
	private Double seatamount;
	private String createdat;
	private String updateat;
	private Boolean delflag;
	
	public ReservationDto(Reservation reserv) {
		this.reservation_id=reserv.getReservationid();
		this.customer_id=reserv.getCustomerid();
		this.bus_id=reserv.getBusid();
		this.departlocation=reserv.getDepartlocation();
		this.destinationlocation=reserv.getDestinationlocation();
		SimpleDateFormat formDate = new SimpleDateFormat ("dd-MM-yyyy");
    	this.departtime=formDate.format(reserv.getDeparttime());
    	this.updateat=formDate.format(reserv.getUpdateat());
    	this.reservationdate=formDate.format(reserv.getReservationdate());
    	this.delflag=reserv.getDelflag();
    	this.unitprice=reserv.getUnitprice();
    	this.seatamount=reserv.getSeatamount();
    	this.createdat=formDate.format(reserv.getCreatedat());
	}
	

}

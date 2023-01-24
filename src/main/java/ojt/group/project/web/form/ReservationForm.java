package ojt.group.project.web.form;

import java.text.SimpleDateFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ojt.group.project.persistence.entity.Reservation;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationForm {

    private Integer reservationid;
    private Integer customerid;
    private Integer busid;
    private String departlocation;
    private String destinationlocation;
    private String departtime;
    private String reservationdate;
    private Double unitprice;
    private Double seatamount;
    private String createdat;
    private String updateat;
    private Boolean delflag;

    public ReservationForm(Reservation resv) {
    	this.reservationid=resv.getReservationid();
    	this.customerid=resv.getCustomerid();
    	this.busid=resv.getBusid();
    	this.departlocation=resv.getDepartlocation();
    	this.destinationlocation=resv.getDestinationlocation();
    	SimpleDateFormat formDate = new SimpleDateFormat ("dd-MM-yyyy");
    	this.departtime=formDate.format(resv.getDeparttime());
    	this.delflag=resv.getDelflag();
    	this.updateat=formDate.format(resv.getUpdateat());
    	this.reservationdate=formDate.format(resv.getReservationdate());
    	this.unitprice=resv.getUnitprice();
    	this.seatamount=resv.getSeatamount();
    	this.createdat=formDate.format(resv.getCreatedat());
    	
    }



}

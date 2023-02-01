package ojt.group.project.web.form;

import java.text.SimpleDateFormat;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ojt.group.project.persistence.entity.Reservation;

/**
 * <h2> ReservationForm Class</h2>
 * <p>
 * Process for Displaying ReservationForm
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationForm {

    /**
     * <h2> reservationid</h2>
     * <p>
     * reservationid
     * </p>
     */
    private Integer reservationid;
    /**
     * <h2> customerid</h2>
     * <p>
     * customerid
     * </p>
     */
    private Integer customerid;
    /**
     * <h2> busid</h2>
     * <p>
     * busid
     * </p>
     */
    private Integer busid;
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
     * <h2> updateat</h2>
     * <p>
     * updateat
     * </p>
     */
    private String updateat;
    /**
     * <h2> delflag</h2>
     * <p>
     * delflag
     * </p>
     */
    private Boolean delflag;
    private List<String> checks;
    /**
     * <h2> Constructor for ReservationForm </h2>
     * <p>
     * Constructor for ReservationForm
     * </p>
     * @param resv
     */
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

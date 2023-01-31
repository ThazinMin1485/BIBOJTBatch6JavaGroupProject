package ojt.group.project.bl.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import ojt.group.project.persistence.entity.TransactionReport;

/**
 * <h2> TransactionReportDto Class</h2>
 * <p>
 * Process for Displaying TransactionReportDto
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@AllArgsConstructor
@Data
public class TransactionReportDto {

    /**
     * <h2> reportid</h2>
     * <p>
     * reportid
     * </p>
     */
    private Integer reportid;
    /**
     * <h2> customerid</h2>
     * <p>
     * customerid
     * </p>
     */
    private Integer customerid;
    /**
     * <h2> reservationid</h2>
     * <p>
     * reservationid
     * </p>
     */
    private Integer reservationid;
    /**
     * <h2> paymentid</h2>
     * <p>
     * paymentid
     * </p>
     */
    private Integer paymentid;
    /**
     * <h2> reportdate</h2>
     * <p>
     * reportdate
     * </p>
     */
    private String reportdate;
    /**
     * <h2> createdat</h2>
     * <p>
     * createdat
     * </p>
     */
    private Date createdat;
    /**
     * <h2> updateat</h2>
     * <p>
     * updateat
     * </p>
     */
    private Date updateat;
    /**
     * <h2> delflag</h2>
     * <p>
     * delflag
     * </p>
     */
    private Boolean delflag;

    /**
     * <h2> Constructor for TransactionReportDto </h2>
     * <p>
     * Constructor for TransactionReportDto
     * </p>
     * @param report
     */
    public TransactionReportDto(TransactionReport report) {
    	
    	this.reportid=report.getReportid();
    	this.customerid=report.getCustomerid();
    	this.reservationid=report.getReservationid();
    	this.paymentid=report.getPaymentid();
    	this.createdat=report.getCreatedat();
    	this.updateat=report.getUpdateat();
    	this.delflag=report.getDelflag();
    	SimpleDateFormat formDate = new SimpleDateFormat ("dd-MM-yyyy");
    	this.reportdate=formDate.format(report.getReportdate());
    }
}

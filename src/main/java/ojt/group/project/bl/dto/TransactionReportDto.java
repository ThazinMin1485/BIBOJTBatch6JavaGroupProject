package ojt.group.project.bl.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import ojt.group.project.persistence.entity.TransactionReport;

@AllArgsConstructor
@Data
public class TransactionReportDto {

    private Integer reportid;
    private Integer customerid;
    private Integer reservationid;
    private Integer paymentid;
    private String reportdate;
    private Date createdat;
    private Date updateat;
    private Boolean delflag;

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

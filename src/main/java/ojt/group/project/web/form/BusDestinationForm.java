package ojt.group.project.web.form;

import java.text.SimpleDateFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import ojt.group.project.persistence.entity.BusDestination;

@Data
@AllArgsConstructor
public class BusDestinationForm {
	private Integer destinationid;
	private Integer busid;
	private String departlocation;
	private String destinationlocation;
	private String departtime;
    private Double unitprice;

    public BusDestinationForm(BusDestination bs) {
    	this.destinationid=bs.getDestinationid();
    	this.busid=bs.getBusid();
    	this.departlocation=bs.getDepartlocation();
    	this.destinationlocation=bs.getDestinationlocation();
		SimpleDateFormat formDate = new SimpleDateFormat ("dd-MM-yyyy");
		this.departtime=formDate.format(bs.getDeparttime());
		this.unitprice=bs.getUnitprice();
    }
}

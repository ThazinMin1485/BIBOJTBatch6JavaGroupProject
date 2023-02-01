package ojt.group.project.bl.dto;

import java.text.SimpleDateFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import ojt.group.project.persistence.entity.BusDestination;

/**
 * <h2> BusDestinationDto Class</h2>
 * <p>
 * Process for Displaying BusDestinationDto
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@AllArgsConstructor
@Data
public class BusDestinationDto {
	/**
	 * <h2> destinationid</h2>
	 * <p>
	 * destinationid
	 * </p>
	 */
	private Integer destinationid;
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
     * <h2> unitprice</h2>
     * <p>
     * unitprice
     * </p>
     */
    private Double unitprice;

    /**
     * <h2> Constructor for BusDestinationDto </h2>
     * <p>
     * Constructor for BusDestinationDto
     * </p>
     * @param bs
     */
    public BusDestinationDto(BusDestination bs) {
    	this.destinationid=bs.getDestinationid();
    	this.busid=bs.getBusid();
    	this.departlocation=bs.getDepartlocation();
    	this.destinationlocation=bs.getDestinationlocation();
		SimpleDateFormat formDate = new SimpleDateFormat ("dd-MM-yyyy");
		this.departtime=formDate.format(bs.getDeparttime());
		this.unitprice=bs.getUnitprice();
    }
}

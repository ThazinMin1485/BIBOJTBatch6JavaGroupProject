package ojt.group.project.persistence.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.Getter;
import lombok.Setter;

/**
 * <h2> BusDestination Class</h2>
 * <p>
 * Process for Displaying BusDestination
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@Getter
@Setter
@Entity
@Table(name = "bus_destination")
public class BusDestination {
	/**
	 * <h2> destinationid</h2>
	 * <p>
	 * destinationid
	 * </p>
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer destinationid;

	/**
	 * <h2> busid</h2>
	 * <p>
	 * busid
	 * </p>
	 */
	@Column(name = "bus_id")
	private Integer busid;

	/**
	 * <h2> departlocation</h2>
	 * <p>
	 * departlocation
	 * </p>
	 */
	@Column(name = "depart_location")
	private String departlocation;
	
	/**
	 * <h2> destinationlocation</h2>
	 * <p>
	 * destinationlocation
	 * </p>
	 */
	@Column(name = "destination_location")
	private String destinationlocation;
	
	/**
	 * <h2> departtime</h2>
	 * <p>
	 * departtime
	 * </p>
	 */
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name = "depart_time")
	private Date departtime;
	
	/**
	 * <h2> unitprice</h2>
	 * <p>
	 * unitprice
	 * </p>
	 */
	@Column(name="unit_price")
    private Double unitprice;
}

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

@Getter
@Setter
@Entity
@Table(name = "bus_destination")
public class BusDestination {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer destinationid;

	@Column(name = "bus_id")
	private Integer busid;

	@Column(name = "depart_location")
	private String departlocation;
	
	@Column(name = "destination_location")
	private String destinationlocation;
	
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name = "depart_time")
	private Date departtime;
	
	@Column(name="unit_price")
    private Double unitprice;
}

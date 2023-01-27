package ojt.group.project.bl.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ojt.group.project.persistence.entity.Bus;

/**
 * @author PyaeSuMon
 *
 */
@AllArgsConstructor
@Data
@Getter
@Setter
@NoArgsConstructor
public class BusDto {
	/**
	 * <h2> busid</h2>
	 * <p>
	 * busid
	 * </p>
	 */
	private Integer busid;
	/**
	 * <h2> busno</h2>
	 * <p>
	 * busno
	 * </p>
	 */
	private Integer busno;
	/**
	 * <h2> busstatus</h2>
	 * <p>
	 * busstatus
	 * </p>
	 */
	private String busstatus;
	/**
	 * <h2> busseats</h2>
	 * <p>
	 * busseats
	 * </p>
	 */
	private String busseats;
	/**
	 * <h2> driverid</h2>
	 * <p>
	 * driverid
	 * </p>
	 */
	private Integer driverid;
	
	 /**
	 * <h2> Constructor for BusDto </h2>
	 * <p>
	 * Constructor for BusDto
	 * </p>
	 * @param bus
	 */
	public BusDto(Bus bus) {
    if (bus == null) {
        bus = new Bus();
    }
	 this.busid=bus.getBusid();
	 this.busno=bus.getBusno();
	 this.busstatus=bus.getBusstatus();
	 this.busseats=bus.getBusseats();
	 this.driverid=bus.getDriverid();
}
}

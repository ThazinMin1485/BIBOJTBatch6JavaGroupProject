package ojt.group.project.web.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ojt.group.project.persistence.entity.Bus;

/**
 * <h2> BusForm Class</h2>
 * <p>
 * Process for Displaying BusForm
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class BusForm {
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
	@NotNull(message = "Bus Number cannot be empty")
	private Integer busno;
	/**
	 * <h2> busstatus</h2>
	 * <p>
	 * busstatus
	 * </p>
	 */
	@NotEmpty(message = "Bus Status cannot be empty")
	private String busstatus;
	/**
	 * <h2> busseats</h2>
	 * <p>
	 * busseats
	 * </p>
	 */
	@NotEmpty(message = "Bus Seat cannot be empty")
	private String busseats;
	/**
	 * <h2> driverid</h2>
	 * <p>
	 * driverid
	 * </p>
	 */
	@NotNull(message = "Driver Id cannot be empty")
	private Integer driverid;
	
	/**
	 * <h2> Constructor for BusForm </h2>
	 * <p>
	 * Constructor for BusForm
	 * </p>
	 * @param bus
	 */
	public BusForm(Bus bus) {
		this.busid=bus.getBusid();
		this.busno=bus.getBusno();
		this.busstatus=bus.getBusstatus();
		this.busseats=bus.getBusseats();
		this.driverid=bus.getDriverid();
	}
}

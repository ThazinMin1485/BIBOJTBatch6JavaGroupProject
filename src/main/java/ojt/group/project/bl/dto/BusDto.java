package ojt.group.project.bl.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ojt.group.project.persistence.entity.Bus;
import java.util.Date;

/**
 * @author PyaeSuMon
 *
 */
@AllArgsConstructor
@Data
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
	private Date createdat;
	private Date updateat;
	private Boolean delflag;
	 /**
	 * <h2> Constructor for BusDto </h2>
	 * <p>
	 * Constructor for BusDto
	 * </p>
	 * @param bus
	 */
	public BusDto(Bus b) {
		this.busid = b.getBusid();
		this.busno = b.getBusno();
		this.busstatus = b.getBusstatus();
		this.busseats = b.getBusseats();
		this.driverid = b.getDriverid();
		this.createdat = b.getCreatedat();
		this.updateat = b.getUpdateat();
		this.delflag = b.getDelflag();
	}
  }
  
  


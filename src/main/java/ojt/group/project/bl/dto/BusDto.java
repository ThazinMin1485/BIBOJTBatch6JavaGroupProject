package ojt.group.project.bl.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import ojt.group.project.persistence.entity.Bus;

@AllArgsConstructor
@Data
public class BusDto {
	private Integer busId;
	private Integer busno;
	private String busstatus;
	private String busseats;
	private Integer driverid;
	private Date createdat;
	private Date updateat;
	private Boolean delflag;

	public BusDto(Bus b) {
		this.busId = b.getBusId();
		this.busno = b.getBusno();
		this.busstatus = b.getBusstatus();
		this.busseats = b.getBusseats();
		this.driverid = b.getDriverid();
		this.createdat = b.getCreatedat();
		this.updateat = b.getUpdateat();
		this.delflag = b.getDelflag();
	}

}

package ojt.group.project.crud.web.form;

import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ojt.group.project.persistence.entity.Bus;

@Getter
@Setter
@NoArgsConstructor
public class BusForm {
	private Integer busid;

	private Integer busno;
	@NotEmpty
	private String busstatus;
	@NotEmpty
	private String busseats;
	private Integer driverid;
	
	public BusForm(Bus bus) {
		this.busid=bus.getBusid();
		this.busno=bus.getBusno();
		this.busstatus=bus.getBusstatus();
		this.busseats=bus.getBusseats();
		this.driverid=bus.getDriverid();
	}
}

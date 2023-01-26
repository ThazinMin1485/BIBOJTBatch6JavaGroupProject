package ojt.group.project.bl.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ojt.group.project.persistence.entity.Bus;

@AllArgsConstructor
@Data
@Getter
@Setter
@NoArgsConstructor
public class BusDto {
	private Integer busid;
	private Integer busno;
	private String busstatus;
	private String busseats;
	private Integer driverid;
	
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

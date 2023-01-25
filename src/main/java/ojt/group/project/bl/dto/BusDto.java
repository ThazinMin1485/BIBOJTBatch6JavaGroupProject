package ojt.group.project.bl.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import ojt.group.project.persistence.entity.Bus;

@AllArgsConstructor
@Data
public class BusDto {
    private Integer busid;
    private Integer busno;
    private String busstatus;
    private Integer driverid;
    
    public BusDto(Bus bus) {
        if (bus == null) {
            bus = new Bus();
        }
        this.busid=bus.getBusId();
        this.busno=bus.getBusno();
        this.busstatus=bus.getBusstatus();
        this.driverid=bus.getDriverid();
}
}

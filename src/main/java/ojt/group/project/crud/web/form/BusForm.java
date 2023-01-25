package ojt.group.project.crud.web.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BusForm {
    private Integer busid;
    @NotEmpty
    private Integer busno;
    @NotEmpty
    private String busstatus;
    @NotEmpty
    private Integer driverid;
}

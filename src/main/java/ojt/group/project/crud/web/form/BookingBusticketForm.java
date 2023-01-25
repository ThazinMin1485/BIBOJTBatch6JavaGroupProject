package ojt.group.project.crud.web.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BookingBusticketForm {
    @NotEmpty
    @NotNull
    private String From;
    @NotEmpty
    @NotNull
    private String To;
    @NotEmpty
    @NotNull
    private String Departure_date;
    @NotEmpty
    @NotNull
    private String Passenger;

    private Integer age;
}

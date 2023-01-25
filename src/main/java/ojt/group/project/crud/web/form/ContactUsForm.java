package ojt.group.project.crud.web.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactUsForm {
    @NotEmpty
    @Size(min = 1, max = 50)
    private String userName;
    @NotEmpty
    private String email;
    private String message;
}

package ojt.group.project.crud.web.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

/**
 * <h2> ContactUsForm Class</h2>
 * <p>
 * Process for Displaying ContactUsForm
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@Getter
@Setter
public class ContactUsForm {
    /**
     * <h2> userName</h2>
     * <p>
     * userName
     * </p>
     */
    @NotEmpty(message = "Name cannot be empty")
    @Size(min = 1, max = 50)
    private String userName;
    /**
     * <h2> email</h2>
     * <p>
     * email
     * </p>
     */
    @NotEmpty(message = "Email cannot be empty")
    @Email
    private String email;
    /**
     * <h2> message</h2>
     * <p>
     * message
     * </p>
     */
    private String message;
}

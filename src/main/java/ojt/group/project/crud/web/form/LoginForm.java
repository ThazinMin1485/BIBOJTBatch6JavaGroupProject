package ojt.group.project.crud.web.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LoginForm {
    @NotEmpty
    @Email
    private String email;
    @NotEmpty
    @Size(min = 5, max = 20)
    private String password;
    
    public LoginForm(LoginForm login) {
        this.email=login.getEmail();
        this.password=login.getPassword();
    }
}

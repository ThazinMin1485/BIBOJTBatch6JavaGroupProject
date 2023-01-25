package ojt.group.project.crud.web.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ojt.group.project.persistence.entity.Customer;

@Getter
@Setter
@NoArgsConstructor
public class RegisterForm {
    
    private int customerid;
    @NotEmpty
    private String userName;
    @NotEmpty
    private String gender;

    @NotNull
    private Integer age;
    @NotEmpty
    private String nrc;
    @NotEmpty
    @Size(min=5,max=50)
    private String address;
    @NotEmpty
    private String phno;
    @NotEmpty
    @Email
    private String email;
    @NotEmpty
    @Size(min = 5, max = 20)
    private String password;
    @NotEmpty
    @Size(min = 1, max = 20)
    private String confirmpassword;
    
    public RegisterForm(Customer cus) {
        this.customerid=cus.getCustomerid();
        this.userName=cus.getUserName();
        this.gender=cus.getGender();
        this.age=cus.getAge();
        this.nrc=cus.getNrc();
        this.address=cus.getAddress();
        this.phno=cus.getPhno();
        this.email=cus.getEmail();
        this.password=cus.getPassword();
        this.confirmpassword=cus.getConfirmpassword();
}
}

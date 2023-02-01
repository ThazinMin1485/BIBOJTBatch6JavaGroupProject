package ojt.group.project.web.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ojt.group.project.persistence.entity.Customer;

/**
 * <h2> RegisterForm Class</h2>
 * <p>
 * Process for Displaying RegisterForm
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class RegisterForm {
    
    /**
     * <h2> customerid</h2>
     * <p>
     * customerid
     * </p>
     */
    private int customerid;
    /**
     * <h2> userName</h2>
     * <p>
     * userName
     * </p>
     */
    @NotEmpty(message = "Name cannot be empty")
    private String userName;
    /**
     * <h2> gender</h2>
     * <p>
     * gender
     * </p>
     */
    @NotEmpty
    private String gender;

    /**
     * <h2> age</h2>
     * <p>
     * age
     * </p>
     */
    @NotNull(message = "Age cannot be empty")
    private Integer age;
    /**
     * <h2> nrc</h2>
     * <p>
     * nrc
     * </p>
     */
    @NotEmpty(message = "NRC cannot be empty")
    private String nrc;
    /**
     * <h2> address</h2>
     * <p>
     * address
     * </p>
     */
    @NotEmpty(message = "Address cannot be empty")
    @Size(min=5,max=50)
    private String address;
    /**
     * <h2> ph_no</h2>
     * <p>
     * ph_no
     * </p>
     */
    @NotEmpty(message = "Phone Number cannot be empty")
    private String ph_no;
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
     * <h2> password</h2>
     * <p>
     * password
     * </p>
     */
    @NotEmpty(message = "Please Enter Your Password")
    @Size(min = 5, max = 20)
    private String password;
    /**
     * <h2> confirmpassword</h2>
     * <p>
     * confirmpassword
     * </p>
     */
    @NotEmpty
    @Size(min = 1, max = 20)
    private String confirmpassword;
    
    /**
     * <h2> Constructor for RegisterForm </h2>
     * <p>
     * Constructor for RegisterForm
     * </p>
     * @param cus
     */
    public RegisterForm(Customer cus) {
        this.customerid=cus.getCustomerid();
        this.userName=cus.getUserName();
        this.gender=cus.getGender();
        this.age=cus.getAge();
        this.nrc=cus.getNrc();
        this.address=cus.getAddress();
        this.ph_no=cus.getPh_no();
        this.email=cus.getEmail();
        this.password=cus.getPassword();
        this.confirmpassword=cus.getConfirmpassword();
}
}

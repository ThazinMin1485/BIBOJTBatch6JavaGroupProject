package ojt.group.project.web.form;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ojt.group.project.persistence.entity.Customer;

/**
 * <h2> CreateCusForm Class</h2>
 * <p>
 * Process for Displaying CreateCusForm
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateCusForm {
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
    @NotEmpty
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
    private Integer age;
    /**
     * <h2> nrc</h2>
     * <p>
     * nrc
     * </p>
     */
    @NotEmpty
    private String nrc;
    /**
     * <h2> address</h2>
     * <p>
     * address
     * </p>
     */
    @NotEmpty
    @Size(min=5,max=50)
    private String address;
    /**
     * <h2> ph_no</h2>
     * <p>
     * ph_no
     * </p>
     */
    private String ph_no;
    /**
     * <h2> email</h2>
     * <p>
     * email
     * </p>
     */
    @NotEmpty
    private String email;
    /**
     * <h2> password</h2>
     * <p>
     * password
     * </p>
     */
    @NotEmpty
    private String password;
    /**
     * <h2> confirmpassword</h2>
     * <p>
     * confirmpassword
     * </p>
     */
    @NotEmpty
    private String confirmpassword;
    private String type;

    /**
     * <h2> Constructor for CreateCusForm </h2>
     * <p>
     * Constructor for CreateCusForm
     * </p>
     * @param cus
     */
    public CreateCusForm(Customer cus) {
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
        this.type=cus.getType();
}
}

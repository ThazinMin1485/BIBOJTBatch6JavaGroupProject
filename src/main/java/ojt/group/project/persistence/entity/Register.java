package ojt.group.project.persistence.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * <h2> Register Class</h2>
 * <p>
 * Process for Displaying Register
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@Getter
@Setter
public class Register {
    /**
     * <h2> id</h2>
     * <p>
     * id
     * </p>
     */
    private int id;
    /**
     * <h2> userName</h2>
     * <p>
     * userName
     * </p>
     */
    private String userName;
    /**
     * <h2> gender</h2>
     * <p>
     * gender
     * </p>
     */
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
    private String nrc;
    /**
     * <h2> address</h2>
     * <p>
     * address
     * </p>
     */
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
    private String email;
    /**
     * <h2> password</h2>
     * <p>
     * password
     * </p>
     */
    private String password;
    /**
     * <h2> confirmpassword</h2>
     * <p>
     * confirmpassword
     * </p>
     */
    private String confirmpassword;
}

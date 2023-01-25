package ojt.group.project.persistence.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Register {
    private int id;
    private String userName;
    private String gender;
    private Integer age;
    private String nrc;
    private String address;
    private String phno;
    private String email;
    private String password;
    private String confirmpassword;
}

package ojt.group.project.persistence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerid;
    
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

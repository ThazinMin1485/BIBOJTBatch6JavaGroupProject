package ojt.group.project.bl.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import ojt.group.project.persistence.entity.Customer;

@AllArgsConstructor
@Data
public class CustomerDto {
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
    
    public CustomerDto(Customer cus) {
        if (cus == null) {
            cus = new Customer();
        }
        this.id=cus.getCustomerid();
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

package ojt.group.project.bl.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import ojt.group.project.persistence.entity.Customer;

@AllArgsConstructor
@Data
public class CustomerDto {
	
    private Integer customerid;
    private String customername;
    private String gender;
    private Integer age;
    private String address;
    private String nrc;
    private String phno;
    private String email;
    private Date createdat;
    private Date updateat;
    private Boolean delflag;

    public CustomerDto(Customer c) {
    	this.customerid=c.getCustomerid();
    	this.customername=c.getCustomername();
    	this.gender=c.getGender();
    	this.age=c.getAge();
    	this.address=c.getAddress();
    	this.nrc=c.getNrc();
    	this.phno=c.getPhno();
    	this.email=c.getEmail();
    	this.createdat=c.getCreatedat();
    	this.updateat=c.getUpdateat();
    	this.delflag=c.getDelflag();
    }
}

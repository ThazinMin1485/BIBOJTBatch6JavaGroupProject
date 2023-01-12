package ojt.group.project.persistence.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "customer")
public class Customer implements Serializable{
    /**
     *<h2>serialVersionUID</h2>
     *<p>
     *serialVersionUID
     *</p> 
     */
    private static final long serialVersionUID = 1L;
    /**
     *<h2>customerid</h2>
     *<p>
     *customerid
     *</p> 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="customer_id")
    private Integer customerid;
    
    /**
     *<h2>customername</h2>
     *<p>
     *customername
     *</p> 
     */
    @Column(name="customer_name")
    private String customername;
    
    /**
     *<h2>gender</h2>
     *<p>
     *gender
     *</p> 
     */
    @Column(name="gender")
    private String gender;
    
    /**
     *<h2>age</h2>
     *<p>
     *age
     *</p> 
     */
    @Column(name="age")
    private Integer age;
    
    /**
     *<h2>address</h2>
     *<p>
     *address
     *</p> 
     */
    @Column(name="address")
    private String address;
    
    /**
     *<h2>nrc</h2>
     *<p>
     *nrc
     *</p> 
     */
    @Column(name="nrc")
    private String nrc;
    
    /**
     *<h2>phno</h2>
     *<p>
     *phno
     *</p> 
     */
    @Column(name="ph_no")
    private Integer phno;
    
    /**
     *<h2>email</h2>
     *<p>
     *email
     *</p> 
     */
    @Column(name="email")
    private String email;
    
    /**
     *<h2>createdat</h2>
     *<p>
     *createdat
     *</p> 
     */
    @Column(name="created_at")
    private Date createdat;
    
    /**
     *<h2>updateat</h2>
     *<p>
     *updateat
     *</p> 
     */
    @Column(name="update_at")
    private Date updateat;
    
    /**
     *<h2>delflag</h2>
     *<p>
     *delflag
     *</p> 
     */
    @Column(name="del_flag")
    private Date delflag;
}

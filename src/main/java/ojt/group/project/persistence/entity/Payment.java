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
@Table(name = "payment")
public class Payment implements Serializable{
    /**
     *<h2>serialVersionUID</h2>
     *<p>
     *serialVersionUID
     *</p> 
     */
    private static final long serialVersionUID = 1L;
    /**
     *<h2>paymentid</h2>
     *<p>
     *paymentid
     *</p> 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="payment_id")
    private Integer paymentid;
    
    /**
     *<h2>customerid</h2>
     *<p>
     *customerid
     *</p> 
     */
    @Column(name="customer_id")
    private Integer customerid;
    
    /**
     *<h2>paymentdate</h2>
     *<p>
     *paymentdate
     *</p> 
     */
    @Column(name="payment_date")
    private Date paymentdate;
    
    /**
     *<h2>totalamount</h2>
     *<p>
     *totalamount
     *</p> 
     */
    @Column(name="total_amount")
    private Double totalamount;
    
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

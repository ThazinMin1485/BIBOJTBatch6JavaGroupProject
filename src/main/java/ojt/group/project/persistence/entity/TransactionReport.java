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
@Table(name = "transaction_report")
public class TransactionReport implements Serializable{
    /**
     *<h2>serialVersionUID</h2>
     *<p>
     *serialVersionUID
     *</p> 
     */
    private static final long serialVersionUID = 1L;
    /**
     *<h2>reportid</h2>
     *<p>
     *reportid
     *</p> 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="report_id")
    private Integer reportid;
    
    /**
     *<h2>customerid</h2>
     *<p>
     *customerid
     *</p> 
     */
    @Column(name="customer_id")
    private Integer customerid;
    
    /**
     *<h2>reservationid</h2>
     *<p>
     *reservationid
     *</p> 
     */
    @Column(name="reservation_id")
    private Integer reservationid;
    
    /**
     *<h2>paymentid</h2>
     *<p>
     *paymentid
     *</p> 
     */
    private Integer paymentid;
    
    /**
     *<h2>reportdate</h2>
     *<p>
     *reportdate
     *</p> 
     */
    @Column(name="report_date")
    private Date reportdate;
    
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
    private Boolean delflag;
}

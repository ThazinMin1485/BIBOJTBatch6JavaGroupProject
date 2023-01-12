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
@Table(name = "reservation")
public class Reservation implements Serializable{
    /**
     *<h2>serialVersionUID</h2>
     *<p>
     *serialVersionUID
     *</p> 
     */
    private static final long serialVersionUID = 1L;
    /**
     *<h2>reservationid</h2>
     *<p>
     *reservationid
     *</p> 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="reservation_id")
    private Integer reservationid;
    
    /**
     *<h2>customerid</h2>
     *<p>
     *customerid
     *</p> 
     */
    @Column(name="customer_id")
    private Integer customerid;
    
    /**
     *<h2>busid</h2>
     *<p>
     *busid
     *</p> 
     */
    @Column(name="bus_id")
    private Integer busid;
    
    /**
     *<h2>departlocation</h2>
     *<p>
     *departlocation
     *</p> 
     */
    @Column(name="depart_location")
    private String departlocation;
    
    /**
     *<h2>destinationlocation</h2>
     *<p>
     *destinationlocation
     *</p> 
     */
    @Column(name="destination_location")
    private String destinationlocation;
    
    /**
     *<h2>departtime</h2>
     *<p>
     *departtime
     *</p> 
     */
    @Column(name="depart_time")
    private Date departtime;
    
    /**
     *<h2>reservationdate</h2>
     *<p>
     *reservationdate
     *</p> 
     */
    @Column(name="reservation_date")
    private Date reservationdate;
    
    /**
     *<h2>unitprice</h2>
     *<p>
     *unitprice
     *</p> 
     */
    @Column(name="unit_price")
    private Double unitprice;
    
    /**
     *<h2>seatamount</h2>
     *<p>
     *seatamount
     *</p> 
     */
    @Column(name="seat_amount")
    private Double seatamount;
    
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

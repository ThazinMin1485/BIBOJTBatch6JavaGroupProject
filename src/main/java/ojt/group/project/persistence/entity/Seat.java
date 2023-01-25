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
@Table(name = "bus_seat")
public class Seat implements Serializable{
    /**
     *<h2>serialVersionUID</h2>
     *<p>
     *serialVersionUID
     *</p> 
     */
    private static final long serialVersionUID = 1L;
    /**
     *<h2>seatid</h2>
     *<p>
     *seatid
     *</p> 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="seat_id")
    private Integer seatid;
    
    /**
     *<h2>busid</h2>
     *<p>
     *busid
     *</p> 
     */
    @Column(name="bus_id")
    private Integer busid;
    
    /**
     *<h2>busno</h2>
     *<p>
     *busno
     *</p> 
     */
    @Column(name="bus_no")
    private Integer busno;
    
    /**
     *<h2>seatno</h2>
     *<p>
     *seatno
     *</p> 
     */
    @Column(name="seat_no")
    private Integer seatno;
    
    /**
     *<h2>reservationid</h2>
     *<p>
     *reservationid
     *</p> 
     */
    @Column(name="reservation_id")
    private Integer reservationid;
    
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

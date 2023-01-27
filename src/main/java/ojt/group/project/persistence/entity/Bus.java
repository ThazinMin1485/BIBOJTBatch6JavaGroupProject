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
import ojt.group.project.crud.web.form.BusForm;

/**
 * <h2> Bus Class</h2>
 * <p>
 * Process for Displaying Bus
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@Getter
@Setter
@Entity
@Table(name = "bus")
public class Bus implements Serializable{
	/**
     *<h2>serialVersionUID</h2>
     *<p>
     *serialVersionUID
     *</p> 
     */
    private static final long serialVersionUID = 1L;
    /**
     *<h2>busId</h2>
     *<p>
     *busId
     *</p> 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bus_id")
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
     *<h2>busstatus</h2>
     *<p>
     *busstatus
     *</p> 
     */
    @Column(name="bus_status")
    private String busstatus;
    
    /**
     *<h2>busseats</h2>
     *<p>
     *busseats
     *</p> 
     */
    @Column(name="bus_seats")
    private String busseats;
    
    /**
     *<h2>driverid</h2>
     *<p>
     *driverid
     *</p> 
     */
    @Column(name="driver_id")
    private Integer driverid;
    
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
    
    /**
     * <h2> Constructor for Bus </h2>
     * <p>
     * Constructor for Bus
     * </p>
     */
    public Bus() {
        super();
    }
    
    /**
     * <h2> Constructor for Bus </h2>
     * <p>
     * Constructor for Bus
     * </p>
     * @param busForm
     */
    public Bus(BusForm busForm) {
        this.busid=busForm.getBusid();
        this.busno=busForm.getBusno();
        this.busstatus=busForm.getBusstatus();
        this.busseats=busForm.getBusseats();
        this.driverid=busForm.getDriverid();
    }
}

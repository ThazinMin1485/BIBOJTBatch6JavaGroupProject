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
@Table(name = "driver")
public class Driver implements Serializable{
    /**
     *<h2>serialVersionUID</h2>
     *<p>
     *serialVersionUID
     *</p> 
     */
    private static final long serialVersionUID = 1L;
    /**
     *<h2>driverid</h2>
     *<p>
     *driverid
     *</p> 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="driver_id")
    private Integer driverid;
    
    /**
     *<h2>drivername</h2>
     *<p>
     *drivername
     *</p> 
     */
    @Column(name="driver_name")
    private String drivername;
    
    /**
     *<h2>busid</h2>
     *<p>
     *busid
     *</p> 
     */
    @Column(name="bus_id")
    private Integer busid;
    
    /**
     *<h2>phno</h2>
     *<p>
     *phno
     *</p> 
     */
    @Column(name="phno")
    private Integer phno;
    
    /**
     *<h2>nrc</h2>
     *<p>
     *nrc
     *</p> 
     */
    @Column(name="nrc")
    private String nrc;
    
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

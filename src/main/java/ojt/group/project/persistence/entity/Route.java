package ojt.group.project.persistence.entity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Route {
    private int busno;
    private Date departuretime;
    private String station;
    private double unitprice;
}

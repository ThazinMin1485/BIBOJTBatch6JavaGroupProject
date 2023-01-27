package ojt.group.project.persistence.dao;

import java.util.List;

import ojt.group.project.persistence.entity.Seat;

/**
 * <h2> SeatDao Class</h2>
 * <p>
 * Process for Displaying SeatDao
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
public interface SeatDao {
	 // add seat
    public void addSeat(Seat seat);

    // get all seat
    public List<Seat> getAllSeat();
    
    // get seat by id
    public Seat getSeatById(int seatid);

    // update seat
    public void updateSeat(Seat seat);

    // delete seat
    public void deleteseat(int seatid);

}

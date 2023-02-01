package ojt.group.project.bl.service;

import java.util.List;

import ojt.group.project.bl.dto.SeatDto;
import ojt.group.project.persistence.entity.Seat;
import ojt.group.project.web.form.SeatForm;

/**
 * <h2> SeatService Class</h2>
 * <p>
 * Process for Displaying SeatService
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
public interface SeatService {
	// add seat
    public void addSeat(SeatForm seatForm);

    // get all seat
    public List<SeatDto> getAllSeat();
    
    // get seat by id
    public Seat getById(int seatid);

    // update seat
    public void updateSeat(Seat seat);

    // seat seat
    public void deleteSeat(int seatid);
}

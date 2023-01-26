package ojt.group.project.bl.service;

import java.util.List;

import ojt.group.project.bl.dto.SeatDto;
import ojt.group.project.crud.web.form.SeatForm;
import ojt.group.project.persistence.entity.Seat;

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

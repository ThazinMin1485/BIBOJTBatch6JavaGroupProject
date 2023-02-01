package ojt.group.project.web.form;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import ojt.group.project.persistence.entity.Seat;
@Data
@AllArgsConstructor
public class SeatListForm {

	private List<Seat> seatList;
	
	public SeatListForm() {
		this.seatList=new ArrayList<Seat>();
	}
	public List<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }

    public void add(Seat seat) {
        this.seatList.add(seat);
    }
}

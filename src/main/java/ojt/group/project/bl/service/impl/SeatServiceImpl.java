package ojt.group.project.bl.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ojt.group.project.bl.dto.SeatDto;
import ojt.group.project.bl.service.SeatService;
import ojt.group.project.crud.web.form.SeatForm;
import ojt.group.project.persistence.dao.SeatDao;
import ojt.group.project.persistence.entity.Seat;

/**
 * <h2> SeatServiceImpl Class</h2>
 * <p>
 * Process for Displaying SeatServiceImpl
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@Transactional
@Service
public class SeatServiceImpl implements SeatService{
	
	 /**
	 * <h2> seatDao</h2>
	 * <p>
	 * seatDao
	 * </p>
	 */
	@Autowired
	    private SeatDao seatDao;
	
	/**
	 * <h2> addSeat </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param seatForm
	 */
	@Override
	 public void addSeat(SeatForm seatForm) {
		 Seat seat=new Seat();
		 seat.setSeatid(seatForm.getSeatid());
		 seat.setBusid(seatForm.getBusid());
		 seat.setBusno(seatForm.getBusno());
		 seat.setSeatno(seatForm.getSeatno());
	     seat.setCreatedat(new Date()); 
	     seatDao.addSeat(seat);
	 }

		/**
		 * <h2> getAllSeat </h2>
		 * <p>
		 * 
		 * </p>
		 * 
		 * @return
		 */
		@Override
	    public List<SeatDto> getAllSeat(){
			List<Seat> allSeat = seatDao.getAllSeat();
	        List<SeatDto> seat = new ArrayList<SeatDto>();
	        for (Seat seat1 : allSeat) {
	            SeatDto seat1Dto = new SeatDto(seat1);
	            seat1Dto.setSeatid(seat1.getSeatid());
	            seat1Dto.setBusid(seat1.getBusid());
	            seat1Dto.setBusno(seat1.getBusno());
	            seat1Dto.setSeatno(seat1.getSeatno());
	            seat1Dto.setReservationid(seat1.getReservationid());
	            seat.add(seat1Dto);
	        }
	        return seat;
	    }
		
		/**
		 * <h2> getById </h2>
		 * <p>
		 * 
		 * </p>
		 * 
		 * @param seatid
		 * @return
		 */
		@Override
	    public Seat getById(int seatid) {
			 return seatDao.getSeatById(seatid);
	    }

		/**
		 * <h2> updateSeat </h2>
		 * <p>
		 * 
		 * </p>
		 * 
		 * @param seat
		 */
		@Override
	    public void updateSeat(Seat seat) {
			seatDao.updateSeat(seat);
			seat.setCreatedat(new Date());
	        seat.setUpdateat(new Date());
	    }

		/**
		 * <h2> deleteSeat </h2>
		 * <p>
		 * 
		 * </p>
		 * 
		 * @param seatid
		 */
		@Override
	    public void deleteSeat(int seatid) {
			seatDao.deleteseat(seatid);
	    }
}

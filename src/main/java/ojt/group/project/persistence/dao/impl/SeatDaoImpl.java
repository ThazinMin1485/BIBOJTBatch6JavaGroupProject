package ojt.group.project.persistence.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import ojt.group.project.persistence.dao.SeatDao;
import ojt.group.project.persistence.entity.Bus;
import ojt.group.project.persistence.entity.Seat;

@Repository
public class SeatDaoImpl implements SeatDao{
	
	@Autowired
    private HibernateTemplate hiberneteTemplate;
    
    @Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public void addSeat(Seat seat) {
		sessionFactory.getCurrentSession().save(seat);
	}

    // get all seat
	@Override
    public List<Seat> getAllSeat(){
		return hiberneteTemplate.loadAll(Seat.class);
    }
    
 // get seat by id
	@Override
    public Seat getSeatById(int seatid) {
		Seat seat = hiberneteTemplate.get(Seat.class, seatid);
        return seat;
    }

    // update seat
	@Override
    public void updateSeat(Seat seat) {
		 hiberneteTemplate.update(seat);
    }

    // delete seat
	@Override
    public void deleteseat(int seatid) {
		 hiberneteTemplate.delete(hiberneteTemplate.load(Seat.class, seatid));
    }
}

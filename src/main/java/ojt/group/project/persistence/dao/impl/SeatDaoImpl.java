package ojt.group.project.persistence.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import ojt.group.project.persistence.dao.SeatDao;
import ojt.group.project.persistence.entity.Bus;
import ojt.group.project.persistence.entity.Seat;

/**
 * <h2>SeatDaoImpl Class</h2>
 * <p>
 * Process for Displaying SeatDaoImpl
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@Repository
public class SeatDaoImpl implements SeatDao {

	/**
	 * <h2>hiberneteTemplate</h2>
	 * <p>
	 * hiberneteTemplate
	 * </p>
	 */
	@Autowired
	private HibernateTemplate hiberneteTemplate;

	/**
	 * <h2>sessionFactory</h2>
	 * <p>
	 * sessionFactory
	 * </p>
	 */
	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * <h2>addSeat</h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param seat
	 */
	@Override
	public void addSeat(Seat seat) {
		sessionFactory.getCurrentSession().save(seat);
	}

	/**
	 * <h2>getAllSeat</h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @return
	 */
	@Override
	public List<Seat> getAllSeat() {
		return hiberneteTemplate.loadAll(Seat.class);
	}

	/**
	 * <h2>getSeatById</h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param seatid
	 * @return
	 */
	@Override
	public Seat getSeatById(int seatid) {
		Seat seat = hiberneteTemplate.get(Seat.class, seatid);
		return seat;
	}

	/**
	 * <h2>updateSeat</h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param seat
	 */
	@Override
	public void updateSeat(Seat seat) {
		hiberneteTemplate.update(seat);
	}

	/**
	 * <h2>deleteseat</h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param seatid
	 */
	@Override
	public void deleteseat(int seatid) {
		hiberneteTemplate.delete(hiberneteTemplate.load(Seat.class, seatid));
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Seat> getSeatByBusId(int busid) {
		String q = "SELECT s from Seat s WHERE s.busid=:busid";
		Query query = this.sessionFactory.getCurrentSession().createQuery(q);
		query.setParameter("busid", busid);
		return query.getResultList();
	}
}

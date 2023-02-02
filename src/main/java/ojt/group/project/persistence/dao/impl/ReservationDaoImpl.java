package ojt.group.project.persistence.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ojt.group.project.persistence.dao.ReservationDao;
import ojt.group.project.persistence.entity.Bus;
import ojt.group.project.persistence.entity.BusDestination;
import ojt.group.project.persistence.entity.Customer;
import ojt.group.project.persistence.entity.Reservation;
import ojt.group.project.persistence.entity.Seat;
import ojt.group.project.persistence.entity.TransactionReport;

/**
 * <h2> ReservationDaoImpl Class</h2>
 * <p>
 * Process for Displaying ReservationDaoImpl
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@Repository
@Transactional
public class ReservationDaoImpl implements ReservationDao {

	/**
	 * <h2> sessionFactory</h2>
	 * <p>
	 * sessionFactory
	 * </p>
	 */
	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * <h2> getAllReservationList </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Reservation> getAllReservationList() {
		String userQuery = "SELECT r FROM Reservation r where r.delflag=0";
		Query<Reservation> query = this.sessionFactory.getCurrentSession().createQuery(userQuery);
		return query.getResultList();
	}

	/**
	 * <h2> getReservationById </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param reservationid
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public Reservation getReservationById(int reservationid) {
		String q = "SELECT r FROM Reservation r WHERE r.reservationid=:reservationid";
		Query query = this.sessionFactory.getCurrentSession().createQuery(q);
		query.setParameter("reservationid", reservationid);
		Reservation rev = (Reservation) query.uniqueResult();
		return rev;
	}

	/**
	 * <h2> updateReservation </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param resv
	 */
	@Override
	public void updateReservation(Reservation resv) {

		sessionFactory.getCurrentSession().update(resv);
	}

	/**
	 * <h2> updateReport </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param report
	 */
	@Override
	public void updateReport(TransactionReport report) {
		sessionFactory.getCurrentSession().update(report);

	}

	/**
	 * <h2> getReportById </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param reservation_id
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public TransactionReport getReportById(int reservation_id) {
		String q = "SELECT r FROM TransactionReport r WHERE r.reservationid=:reservationid";
		Query query = this.sessionFactory.getCurrentSession().createQuery(q);
		query.setParameter("reservationid", reservation_id);
		TransactionReport report = (TransactionReport) query.uniqueResult();
		return report;
	}

	/**
	 * <h2> getAllReportList </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<TransactionReport> getAllReportList() {
		String userQuery = "SELECT r FROM TransactionReport r where r.delflag=0";
		Query<TransactionReport> query = this.sessionFactory.getCurrentSession().createQuery(userQuery);
		return query.getResultList();
	}

	/**
	 * <h2> getCustomerList </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> getCustomerList() {
		String userQuery = "SELECT c FROM Customer c where c.delflag=0";
		Query<Customer> query = this.sessionFactory.getCurrentSession().createQuery(userQuery);
		return query.getResultList();
	}

	/**
	 * <h2> getBusList </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Bus> getBusList() {
		String userQuery = "SELECT b FROM Bus b where b.delflag=0";
		Query<Bus> query = this.sessionFactory.getCurrentSession().createQuery(userQuery);
		return query.getResultList();
	}


	/**
	 * <h2> getSeatByBusId </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param busid
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<Seat> getSeatByBusId(int busid) {
		String q = "SELECT s from Seat s WHERE s.busid=:busid AND s.delflag=0";
		Query query = this.sessionFactory.getCurrentSession().createQuery(q);
		query.setParameter("busid", busid);
		return query.getResultList();
	}

	/**
	 * <h2> getDestinationByBusId </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param busid
	 * @return
	 */
	@SuppressWarnings({ "rawtypes" })
	@Override
	public BusDestination getDestinationByBusId(int busid) {
		String q = "SELECT b from BusDestination b WHERE b.busid=:busid";
		Query query = this.sessionFactory.getCurrentSession().createQuery(q);
		query.setParameter("busid", busid);
		BusDestination b=(BusDestination) query.uniqueResult();
		return b;
	}
	
	
	@SuppressWarnings("rawtypes")
	public Seat getSeatById(int seatid){
		String q = "SELECT s from Seat s WHERE s.seatid=:seatid";
		Query query = this.sessionFactory.getCurrentSession().createQuery(q);
		query.setParameter("seatid", seatid);
		Seat seat=(Seat) query.uniqueResult();
		return seat;
	}

	@Override
	public Reservation addReservation(Reservation resv) {

		sessionFactory.getCurrentSession().save(resv);
		return resv;
	}

	@Override
	public void updateSeat(Seat s) {
		sessionFactory.getCurrentSession().update(s);
		
	}

	@Override
	public void addBusDestination(BusDestination bus) {
		sessionFactory.getCurrentSession().save(bus);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Customer getCustomerById(int customerid) {
		String q = "SELECT c FROM Customer c WHERE c.customerid=:customerid";
		Query query = this.sessionFactory.getCurrentSession().createQuery(q);
		query.setParameter("customerid", customerid);
		Customer cus = (Customer) query.uniqueResult();
		return cus;
	}

	@Override
	public void updateCustomer(Customer cus) {
		sessionFactory.getCurrentSession().update(cus);
		
	}


}

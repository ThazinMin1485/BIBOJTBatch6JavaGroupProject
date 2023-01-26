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

@Repository
@Transactional
public class ReservationDaoImpl implements ReservationDao {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<Reservation> getAllReservationList() {
		String userQuery = "SELECT r FROM Reservation r where r.delflag=0";
		Query<Reservation> query = this.sessionFactory.getCurrentSession().createQuery(userQuery);
		return query.getResultList();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Reservation getReservationById(int reservationid) {
		String q = "SELECT r FROM Reservation r WHERE r.reservationid=:reservationid";
		Query query = this.sessionFactory.getCurrentSession().createQuery(q);
		query.setParameter("reservationid", reservationid);
		Reservation rev = (Reservation) query.uniqueResult();
		return rev;
	}

	@Override
	public void updateReservation(Reservation resv) {

		sessionFactory.getCurrentSession().update(resv);
	}

	@Override
	public void updateReport(TransactionReport report) {
		sessionFactory.getCurrentSession().update(report);

	}

	@SuppressWarnings("rawtypes")
	@Override
	public TransactionReport getReportById(int reservation_id) {
		String q = "SELECT r FROM TransactionReport r WHERE r.reservationid=:reservationid";
		Query query = this.sessionFactory.getCurrentSession().createQuery(q);
		query.setParameter("reservationid", reservation_id);
		TransactionReport report = (TransactionReport) query.uniqueResult();
		return report;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TransactionReport> getAllReportList() {
		String userQuery = "SELECT r FROM TransactionReport r where r.delflag=0";
		Query<TransactionReport> query = this.sessionFactory.getCurrentSession().createQuery(userQuery);
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> getCustomerList() {
		String userQuery = "SELECT c FROM Customer c where c.delflag=0";
		Query<Customer> query = this.sessionFactory.getCurrentSession().createQuery(userQuery);
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Bus> getBusList() {
		String userQuery = "SELECT b FROM Bus b where b.delflag=0";
		Query<Bus> query = this.sessionFactory.getCurrentSession().createQuery(userQuery);
		return query.getResultList();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Bus getBusById(int busId) {
		String q = "SELECT b FROM Bus b WHERE b.busId=:busId";
		Query query = this.sessionFactory.getCurrentSession().createQuery(q);
		query.setParameter("busId", busId);
		Bus b = (Bus) query.uniqueResult();
		return b;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<Seat> getSeatByBusId(int busid) {
		String q = "SELECT s from Seat s WHERE s.busid=:busid";
		Query query = this.sessionFactory.getCurrentSession().createQuery(q);
		query.setParameter("busid", busid);
		return query.getResultList();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<BusDestination> getDestinationByBusId(int busid) {
		String q = "SELECT b from BusDestination b WHERE b.busid=:busid";
		Query query = this.sessionFactory.getCurrentSession().createQuery(q);
		query.setParameter("busid", busid);
		return query.getResultList();
	}

}

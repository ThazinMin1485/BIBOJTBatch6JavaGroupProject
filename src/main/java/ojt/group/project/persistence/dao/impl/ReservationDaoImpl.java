package ojt.group.project.persistence.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ojt.group.project.persistence.dao.ReservationDao;
import ojt.group.project.persistence.entity.Reservation;
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

}

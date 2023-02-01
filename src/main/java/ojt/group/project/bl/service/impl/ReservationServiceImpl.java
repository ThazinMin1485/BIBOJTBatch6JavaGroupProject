package ojt.group.project.bl.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ojt.group.project.bl.dto.BusDestinationDto;
import ojt.group.project.bl.dto.BusDto;
import ojt.group.project.bl.dto.CustomerDto;
import ojt.group.project.bl.dto.ReservationDto;
import ojt.group.project.bl.dto.SeatDto;
import ojt.group.project.bl.dto.TransactionReportDto;
import ojt.group.project.bl.service.ReservationService;
import ojt.group.project.persistence.dao.ReservationDao;
import ojt.group.project.persistence.dao.SeatDao;
import ojt.group.project.persistence.entity.Bus;
import ojt.group.project.persistence.entity.BusDestination;
import ojt.group.project.persistence.entity.Customer;
import ojt.group.project.persistence.entity.Reservation;
import ojt.group.project.persistence.entity.Seat;
import ojt.group.project.persistence.entity.TransactionReport;
import ojt.group.project.web.form.ReservationForm;

@Transactional
@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	private ReservationDao resDao;
	
	@Autowired
	private SeatDao seatDao;

	@Override
	public List<ReservationDto> getAllReservationList() {
		List<Reservation> reser = resDao.getAllReservationList();
		List<ReservationDto> resList = new ArrayList<ReservationDto>();
		for (Reservation res : reser) {
			ReservationDto reserv = new ReservationDto(res);
			reserv.setReservation_id(res.getReservationid());
			reserv.setBus_id(res.getBusid());
			reserv.setCustomer_id(res.getCustomerid());
			reserv.setDepartlocation(res.getDepartlocation());
			reserv.setDestinationlocation(res.getDestinationlocation());
			reserv.setDeparttime(settoString(res.getDeparttime()));
			reserv.setDelflag(res.getDelflag());
			reserv.setUpdateat(settoString(res.getUpdateat()));
			reserv.setReservationdate(settoString(res.getReservationdate()));
			reserv.setUnitprice(res.getUnitprice());
			reserv.setSeatamount(res.getSeatamount());
			reserv.setCreatedat(settoString(res.getCreatedat()));
			resList.add(reserv);
		}
		return resList;
	}

	@Override
	public ReservationForm getReservationById(int reservation_id) {
		Reservation resv = resDao.getReservationById(reservation_id);
		ReservationForm resForm = new ReservationForm(resv);
		return resForm;
	}

	@Override
	public void updateReservation(ReservationForm resv) {
		Reservation res = new Reservation();
		TransactionReport rep = resDao.getReportById(resv.getReservationid());
		try {
			res.setBusid(resv.getBusid());
			res.setCustomerid(resv.getCustomerid());
			rep.setCustomerid(resv.getCustomerid());
			res.setReservationid(resv.getReservationid());
			res.setDepartlocation(resv.getDepartlocation());
			res.setDestinationlocation(resv.getDestinationlocation());
			res.setSeatamount(resv.getSeatamount());
			res.setUnitprice(resv.getUnitprice());
			res.setCreatedat(setDate(resv.getCreatedat()));
			rep.setCreatedat(setDate(resv.getCreatedat()));
			res.setDeparttime(setDate(resv.getDeparttime()));
			res.setDelflag(resv.getDelflag());
			rep.setDelflag(resv.getDelflag());
			res.setUpdateat(currentDate());
			rep.setUpdateat(currentDate());
			res.setReservationdate(setDate(resv.getReservationdate()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		resDao.updateReservation(res);
		resDao.updateReport(rep);
	}

	public Date setDate(String date) throws ParseException {
		SimpleDateFormat formDate = new SimpleDateFormat("dd-MM-yyyy");
		Date da = formDate.parse(date);
		return da;
	}

	public String settoString(Date date) {
		SimpleDateFormat formDate = new SimpleDateFormat("dd-MM-yyyy");
		String da = formDate.format(date);
		return da;
	}

	public Date currentDate() {
		Date dat = new Date();
		return dat;
	}

	@Override
	public void deleteReservationById(int reservation_id) {
		Reservation resv = resDao.getReservationById(reservation_id);
		resv.setDelflag(true);
		TransactionReport rep = resDao.getReportById(reservation_id);
		rep.setDelflag(true);
		resDao.updateReservation(resv);
		resDao.updateReport(rep);

	}

	@Override
	public List<TransactionReportDto> getAllReportList() {
		List<TransactionReport> report = resDao.getAllReportList();
		List<TransactionReportDto> reportList = new ArrayList<TransactionReportDto>();
		for (TransactionReport rep : report) {
			TransactionReportDto dto = new TransactionReportDto(rep);
			dto.setReportid(rep.getReportid());
			dto.setCreatedat(rep.getCreatedat());
			dto.setCustomerid(rep.getCustomerid());
			dto.setDelflag(rep.getDelflag());
			dto.setPaymentid(rep.getPaymentid());
			dto.setReservationid(rep.getReservationid());
			dto.setUpdateat(rep.getUpdateat());
			dto.setReportdate(settoString(rep.getReportdate()));
			reportList.add(dto);
		}
		return reportList;
	}

	@Override
	public List<CustomerDto> getCustomerList() {
		List<Customer> cus = resDao.getCustomerList();
		List<CustomerDto> cusList = new ArrayList<CustomerDto>();
		for (Customer cust : cus) {
			CustomerDto cusD = new CustomerDto(cust);
			cusD.setId(cust.getCustomerid());
			cusD.setAddress(cust.getAddress());
			cusD.setAge(cust.getAge());
			cusD.setCreatedat(cust.getCreatedat());
			cusD.setUserName(cust.getUserName());
			cusD.setDelflag(cust.getDelflag());
			cusD.setEmail(cust.getEmail());
			cusD.setGender(cust.getGender());
			cusD.setNrc(cust.getNrc());
			cusD.setPh_no(cust.getPh_no());
			cusD.setUpdateat(cust.getUpdateat());
			cusList.add(cusD);
		}
		return cusList;
	}

	@Override
	public List<BusDto> getBusList() {
		List<Bus> bus = resDao.getBusList();
		List<BusDto> busList = new ArrayList<BusDto>();
		for (Bus b : bus) {
			BusDto bD = new BusDto(b);
			bD.setBusid(b.getBusid());
			bD.setBusno(b.getBusno());
			bD.setBusseats(b.getBusseats());
			bD.setBusstatus(b.getBusstatus());
			bD.setCreatedat(b.getCreatedat());
			bD.setDelflag(b.getDelflag());
			bD.setDriverid(b.getDriverid());
			bD.setUpdateat(b.getUpdateat());
			busList.add(bD);
		}
		return busList;
	}

	@Override
	public List<SeatDto> getSeatByBusId(int busid) {
		List<Seat> seat = resDao.getSeatByBusId(busid);
		List<SeatDto> sList = new ArrayList<SeatDto>();
		for (Seat s : seat) {
			SeatDto sd = new SeatDto(s);
			sd.setBusid(s.getBusid());
			sd.setBusno(s.getBusno());
			sd.setCreatedat(currentDate());
			sd.setDelflag(s.getDelflag());
			sd.setSeatid(s.getSeatid());
			sd.setSeatno(s.getSeatno());
			sd.setUpdateat(currentDate());
			sList.add(sd);
		}
		return sList;
	}

	@Override
	public BusDestinationDto getBusDestinationBusId(int busid) {
		BusDestination dest = resDao.getDestinationByBusId(busid);
		BusDestinationDto dto=new BusDestinationDto(dest);
		return dto;
	}

	@Override
	public void setSeatByNo(int seatno) {

		Seat s=resDao.getSeatByNo(seatno);
		s.setDelflag(true);
		seatDao.updateSeat(s);
	}
}

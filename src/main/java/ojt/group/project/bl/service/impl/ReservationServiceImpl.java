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
import ojt.group.project.persistence.entity.Bus;
import ojt.group.project.persistence.entity.BusDestination;
import ojt.group.project.persistence.entity.Customer;
import ojt.group.project.persistence.entity.Reservation;
import ojt.group.project.persistence.entity.Seat;
import ojt.group.project.persistence.entity.TransactionReport;
import ojt.group.project.web.form.ReservationForm;

/**
 * <h2> ReservationServiceImpl Class</h2>
 * <p>
 * Process for Displaying ReservationServiceImpl
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@Transactional
@Service
public class ReservationServiceImpl implements ReservationService {

	/**
	 * <h2> resDao</h2>
	 * <p>
	 * resDao
	 * </p>
	 */
	@Autowired
	private ReservationDao resDao;

	/**
	 * <h2> getAllReservationList </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @return
	 */
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

	/**
	 * <h2> getReservationById </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param reservation_id
	 * @return
	 */
	@Override
	public ReservationForm getReservationById(int reservation_id) {
		Reservation resv= resDao.getReservationById(reservation_id);
		ReservationForm resForm=new ReservationForm(resv);
		return resForm;
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
	public void updateReservation(ReservationForm resv) {
		Reservation res=new Reservation();
		TransactionReport rep=resDao.getReportById(resv.getReservationid());
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		resDao.updateReservation(res);
		resDao.updateReport(rep);
	}
	
	
	/**
	 * <h2> setDate</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param date
	 * @return
	 * @throws ParseException
	 * @return Date
	 */
	public Date setDate(String date) throws ParseException {
    	SimpleDateFormat formDate = new SimpleDateFormat ("dd-MM-yyyy");
    	Date da=formDate.parse(date);
    	return da;
	}

	public String settoString(Date date){
    	SimpleDateFormat formDate = new SimpleDateFormat ("dd-MM-yyyy");
    	String da=formDate.format(date);
    	return da;
	}
	/**
	 * <h2> currentDate</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @return
	 * @return Date
	 */
	public Date currentDate() {
    	Date dat=new Date();
    	return dat;
	}

	/**
	 * <h2> deleteReservationById </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param reservation_id
	 */
	@Override
	public void deleteReservationById(int reservation_id) {
		Reservation resv=resDao.getReservationById(reservation_id);
		resv.setDelflag(true);
		TransactionReport rep=resDao.getReportById(reservation_id);
		rep.setDelflag(true);
		resDao.updateReservation(resv);
		resDao.updateReport(rep);
		
	}

	/**
	 * <h2> getAllReportList </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @return
	 */
	@Override
	public List<TransactionReportDto> getAllReportList() {
		List<TransactionReport> report=resDao.getAllReportList();
		List<TransactionReportDto> reportList=new ArrayList<TransactionReportDto>();
		for(TransactionReport rep:report) {
			TransactionReportDto dto=new TransactionReportDto(rep);
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

	/**
	 * <h2> getCustomerList </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @return
	 */
	@Override
	public List<CustomerDto> getCustomerList() {
		List<Customer> cus=resDao.getCustomerList();
		List<CustomerDto> cusList=new ArrayList<CustomerDto>();
		for(Customer cust:cus) {
			CustomerDto cusD=new CustomerDto(cust);
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

	/**
	 * <h2> getBusList </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @return
	 */
	@Override
	public List<BusDto> getBusList() {
		List<Bus> bus=resDao.getBusList();
		List<BusDto> busList=new ArrayList<BusDto>();
		for(Bus b:bus) {
			BusDto bD=new BusDto(b);
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

	/**
	 * <h2> getSeatByBusId </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param busid
	 * @return
	 */
	@Override
	public List<SeatDto> getSeatByBusId(int busid) {
		List<Seat> seat=resDao.getSeatByBusId(busid);
		List<SeatDto> sList=new ArrayList<SeatDto>();
		for(Seat s:seat) {
			SeatDto sd=new SeatDto(s);
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

	/**
	 * <h2> getBusDestinationBusId </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param busid
	 * @return
	 */
	@Override
	public List<BusDestinationDto> getBusDestinationBusId(int busid) {
		List<BusDestination> dest=resDao.getDestinationByBusId(busid);
		List<BusDestinationDto> destList=new ArrayList<BusDestinationDto>();
		for(BusDestination d:dest) {
			BusDestinationDto ds=new BusDestinationDto(d);
			ds.setDestinationid(d.getDestinationid());
			ds.setBusid(d.getBusid());
			ds.setDepartlocation(d.getDepartlocation());
			ds.setDeparttime(settoString(d.getDeparttime()));
			ds.setDestinationlocation(d.getDestinationlocation());
			ds.setUnitprice(d.getUnitprice());
			destList.add(ds);
		}
		return destList;
	}

	
	
}

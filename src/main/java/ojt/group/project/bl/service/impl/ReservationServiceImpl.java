package ojt.group.project.bl.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ojt.group.project.bl.dto.CustomerDto;
import ojt.group.project.bl.dto.ReservationDto;
import ojt.group.project.bl.dto.TransactionReportDto;
import ojt.group.project.bl.service.ReservationService;
import ojt.group.project.persistence.dao.ReservationDao;
import ojt.group.project.persistence.entity.Customer;
import ojt.group.project.persistence.entity.Reservation;
import ojt.group.project.persistence.entity.TransactionReport;
import ojt.group.project.web.form.ReservationForm;

@Transactional
@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	private ReservationDao resDao;

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
		Reservation resv= resDao.getReservationById(reservation_id);
		ReservationForm resForm=new ReservationForm(resv);
		return resForm;
	}

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
	public Date currentDate() {
    	Date dat=new Date();
    	return dat;
	}

	@Override
	public void deleteReservationById(int reservation_id) {
		Reservation resv=resDao.getReservationById(reservation_id);
		resv.setDelflag(true);
		TransactionReport rep=resDao.getReportById(reservation_id);
		rep.setDelflag(true);
		resDao.updateReservation(resv);
		resDao.updateReport(rep);
		
	}

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

	@Override
	public List<CustomerDto> getCustomerList() {
		List<Customer> cus=resDao.getCustomerList();
		List<CustomerDto> cusList=new ArrayList<CustomerDto>();
		for(Customer cust:cus) {
			CustomerDto cusD=new CustomerDto(cust);
			cusD.setCustomerid(cust.getCustomerid());
			cusD.setAddress(cust.getAddress());
			cusD.setAge(cust.getAge());
			cusD.setCreatedat(cust.getCreatedat());
			cusD.setCustomername(cust.getCustomername());
			cusD.setDelflag(cust.getDelflag());
			cusD.setEmail(cust.getEmail());
			cusD.setGender(cust.getGender());
			cusD.setNrc(cust.getNrc());
			cusD.setPhno(cust.getPhno());
			cusD.setUpdateat(cust.getUpdateat());
			cusList.add(cusD);
		}
		return cusList;
	}

	
}

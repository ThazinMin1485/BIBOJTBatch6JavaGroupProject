package ojt.group.project.project.bl.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ojt.group.project.bl.dto.BusDto;
import ojt.group.project.bl.service.BusService;
import ojt.group.project.crud.web.form.BusForm;
import ojt.group.project.persistence.dao.BusDao;
import ojt.group.project.persistence.entity.Bus;

@Transactional
@Service
public class BusServiceImpl implements BusService{
	
	 @Autowired
	    private BusDao busDao;
	 
	 @Override
	 public void addBus(BusForm busForm) {
		 Bus bus=new Bus(busForm);
	     bus.setCreatedat(new Date()); 
	     busDao.addBus(bus);
	 }
	 
	 @Override
	 public List<BusDto> getAllBus(){
		 List<Bus> allBus = busDao.getAllBus();
	        List<BusDto> bus = new ArrayList<BusDto>();
	        for (Bus bus1 : allBus) {
	            BusDto bus1Dto = new BusDto(bus1);
	            bus1Dto.setBusid(bus1.getBusid());
	            bus1Dto.setBusno(bus1.getBusno());
	            bus1Dto.setBusstatus(bus1.getBusstatus());
	            bus1Dto.setBusseats(bus1.getBusseats());
	            bus1Dto.setDriverid(bus1.getDriverid());
	            bus.add(bus1Dto);
	        }
	        return bus;
	 }
	 
	 @Override
	 	public Bus getById(int busid){
	        return busDao.getBusById(busid);
	    }

	    @Override
	    public void updateBus(Bus bus) {
	        busDao.updateBus(bus);
	    }

	    @Override
	    public void deleteBus(int busid) {
	        busDao.deleteBus(busid);
	    }
}

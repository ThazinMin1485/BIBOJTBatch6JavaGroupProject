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

/**
 * <h2> BusServiceImpl Class</h2>
 * <p>
 * Process for Displaying BusServiceImpl
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@Transactional
@Service
public class BusServiceImpl implements BusService{
	
	 /**
	 * <h2> busDao</h2>
	 * <p>
	 * busDao
	 * </p>
	 */
	@Autowired
	    private BusDao busDao;
	 
	 /**
	 * <h2> addBus </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param busForm
	 */
	@Override
	 public void addBus(BusForm busForm) {
		 Bus bus=new Bus(busForm);
	     bus.setCreatedat(new Date());
	     busDao.addBus(bus);
	 }
	 
	 /**
	 * <h2> getAllBus </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @return
	 */
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
	 
	 /**
	 * <h2> getById </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param busid
	 * @return
	 */
	@Override
	 	public Bus getById(int busid){
	        return busDao.getBusById(busid);
	    }

	    /**
	     * <h2> updateBus </h2>
	     * <p>
	     * 
	     * </p>
	     * 
	     * @param bus
	     */
	    @Override
	    public void updateBus(Bus bus) {
	        busDao.updateBus(bus);
	        bus.setCreatedat(new Date());
	        bus.setUpdateat(new Date());
	    }

	    /**
	     * <h2> deleteBus </h2>
	     * <p>
	     * 
	     * </p>
	     * 
	     * @param busid
	     */
	    @Override
	    public void deleteBus(int busid) {
	        busDao.deleteBus(busid);
	    }
}

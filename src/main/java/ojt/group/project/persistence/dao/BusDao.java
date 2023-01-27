package ojt.group.project.persistence.dao;

import java.util.List;

import ojt.group.project.persistence.entity.Bus;

/**
 * <h2> BusDao Class</h2>
 * <p>
 * Process for Displaying BusDao
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
public interface BusDao {
	 // add bus
    public void addBus(Bus bus);

    // get all bus
    public List<Bus> getAllBus();
    
    // get employee by id
    public Bus getBusById(int busid);

    // update employee
    public void updateBus(Bus bus);

    // delete employee
    public void deleteBus(int busid);
}

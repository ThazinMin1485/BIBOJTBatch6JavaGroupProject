package ojt.group.project.bl.service;

import java.util.List;



import ojt.group.project.bl.dto.BusDto;
import ojt.group.project.crud.web.form.BusForm;
import ojt.group.project.persistence.entity.Bus;

/**
 * <h2> BusService Class</h2>
 * <p>
 * Process for Displaying BusService
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
public interface BusService {
	// add bus
    public void addBus(BusForm busForm);

    // get all bus
    public List<BusDto> getAllBus();
    
    // get bus by id
    public Bus getById(int busid);

    // update bus
    public void updateBus(Bus bus);

    // delete bus
    public void deleteBus(int busid);
}

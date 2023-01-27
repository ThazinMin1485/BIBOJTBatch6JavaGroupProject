package ojt.group.project.persistence.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import ojt.group.project.persistence.dao.BusDao;
import ojt.group.project.persistence.entity.Bus;

/**
 * <h2> BusDaoImpl Class</h2>
 * <p>
 * Process for Displaying BusDaoImpl
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@Repository
public class BusDaoImpl implements BusDao{

	/**
	 * <h2> hiberneteTemplate</h2>
	 * <p>
	 * hiberneteTemplate
	 * </p>
	 */
	@Autowired
    private HibernateTemplate hiberneteTemplate;
    
    /**
     * <h2> sessionFactory</h2>
     * <p>
     * sessionFactory
     * </p>
     */
    @Autowired
    private SessionFactory sessionFactory;
    
    /**
     * <h2> addBus </h2>
     * <p>
     * 
     * </p>
     * 
     * @param bus
     */
    @Override
    public void addBus(Bus bus) {
        sessionFactory.getCurrentSession().save(bus);
    }
    
    @Override
    public List<Bus> getAllBus() {
        return hiberneteTemplate.loadAll(Bus.class);
    }
    
    /**
     * <h2> getBusById </h2>
     * <p>
     * 
     * </p>
     * 
     * @param busid
     * @return
     */
    @Override
    public Bus getBusById(int busid) {
        Bus bus = hiberneteTemplate.get(Bus.class, busid);
        return bus;
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
        hiberneteTemplate.update(bus);
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
        hiberneteTemplate.delete(hiberneteTemplate.load(Bus.class, busid));
    }
}

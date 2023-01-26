package ojt.group.project.persistence.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import ojt.group.project.persistence.dao.BusDao;
import ojt.group.project.persistence.entity.Bus;

@Repository
public class BusDaoImpl implements BusDao{

	@Autowired
    private HibernateTemplate hiberneteTemplate;
    
    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public void addBus(Bus bus) {
        sessionFactory.getCurrentSession().save(bus);
    }
    
    @Override
    public List<Bus> getAllBus() {
        return hiberneteTemplate.loadAll(Bus.class);
    }
    
    @Override
    public Bus getBusById(int busid) {
        Bus bus = hiberneteTemplate.get(Bus.class, busid);
        return bus;
    }

    @Override
    public void updateBus(Bus bus) {
        hiberneteTemplate.update(bus);
    }

    @Override
    public void deleteBus(int busid) {
        hiberneteTemplate.delete(hiberneteTemplate.load(Bus.class, busid));
    }
}

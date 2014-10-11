package de.nak.cars.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import de.nak.cars.model.Car;

/**
 * Car data access object.
 * 
 * @author V870556
 *
 */
public class CarDAO {
	private SessionFactory sessionFactory;

	public void save(Car car) {
		sessionFactory.getCurrentSession().saveOrUpdate(car);
	}
	
	public Car load(Long id) {
		
		return (Car) sessionFactory.getCurrentSession().get(Car.class, id);
	}
	
	public void delete(Car car) {
		sessionFactory.getCurrentSession().delete(car);
	}
	
	@SuppressWarnings("unchecked")
	public List<Car> loadAll() {
		return sessionFactory.getCurrentSession().createQuery("from Car").list();
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}

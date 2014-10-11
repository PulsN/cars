package de.nak.cars.service;

import java.util.List;

import de.nak.cars.dao.CarDAO;
import de.nak.cars.model.Car;

public class CarServiceImpl implements CarService {
	private CarDAO carDAO;
	
	public void setCarDAO(CarDAO carDAO) {
		this.carDAO = carDAO;
	}

	@Override
	public void saveCar(Car car) {
		carDAO.save(car);
	}

	@Override
	public Car loadCar(Long id) {
		return carDAO.load(id);
	}

	@Override
	public void deleteCar(Car car) {
		carDAO.delete(car);

	}

	@Override
	public List<Car> loadAllCars() {
		return carDAO.loadAll();
	}

}

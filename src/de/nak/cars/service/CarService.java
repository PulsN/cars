package de.nak.cars.service;

import java.util.List;

import de.nak.cars.model.Car;

/**
 * Car service interface.
 * 
 * @author V870556
 *
 */
public interface CarService {
	
	/**
	 * Create or updates a car.
	 * @param car
	 */
	void saveCar(Car car);
	
	/**
	 * Loads a single car.
	 * @param id
	 * @return a car or null.
	 */
	Car loadCar(Long id);
	
	/**
	 * Deletes the given car.
	 * @param car
	 */
	void deleteCar(Car car);
	
	/**
	 * Loads a list of all cars.
	 * @return a list which is empty if no car was found
	 */
	List<Car> loadAllCars();
	
}

package de.nak.cars.action;

import com.opensymphony.xwork2.ActionSupport;

import de.nak.cars.model.Car;
import de.nak.cars.service.CarService;

/**
 * Action for a single car.
 * 
 * @author V870556
 *
 */
public class CarAction extends ActionSupport {
	private Car car;
	private Long carId;
	private CarService carService;
	
	public String save() {
		carService.saveCar(car);
		return SUCCESS;
	}
	
	public String delete() {
		carService.deleteCar(car);
		return SUCCESS;
	}
	
	public String load() {
		carService.loadCar(carId);
		return SUCCESS;
	}
	
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Long getCarId() {
		return carId;
	}
	public void setCarId(Long carId) {
		this.carId = carId;
	}
	public void setCarService(CarService carService) {
		this.carService = carService;
	}
	
	
}

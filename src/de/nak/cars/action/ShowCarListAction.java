package de.nak.cars.action;

import java.util.List;

import com.opensymphony.xwork2.Action;

import de.nak.cars.model.Car;
import de.nak.cars.service.CarService;

/**
 * Action that shows a list of cars.
 * 
 * @author V870556
 *
 */
public class ShowCarListAction implements Action{
	private List<Car> carList;
	private CarService carService;
	
	@Override
	public String execute() throws Exception {
		carList = carService.loadAllCars();
		return SUCCESS;
	}


	public List<Car> getCarList() {
		return carList;
	}


	public void setCarService(CarService carService) {
		this.carService = carService;
	}
	
}

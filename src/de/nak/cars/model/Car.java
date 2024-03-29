package de.nak.cars.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Car entity.
 * 
 * @author V870556
 */
@Entity
public class Car {
	private Long id;
	private String brand;
	private String color;
	private Integer wheelCount;
	private Integer yearOfProduction;
	private Boolean isDieselEngine = Boolean.FALSE;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(length = 100, nullable = false)
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Column(length = 50, nullable = false)
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Column(name = "wheel_count", scale = 1, nullable = false)
	public Integer getWheelCount() {
		return wheelCount;
	}
	public void setWheelCount(Integer wheelCount) {
		this.wheelCount = wheelCount;
	}
	
	@Column(name = "year_of_production", scale = 4)
	public Integer getYearOfProduction() {
		return yearOfProduction;
	}
	public void setYearOfProduction(Integer yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}
	
	@Column(name = "diesel_engine_flag", nullable = false)
	public Boolean getIsDieselEngine() {
		return isDieselEngine;
	}
	public void setIsDieselEngine(Boolean isDieselEngine) {
		this.isDieselEngine = isDieselEngine;
	}
}

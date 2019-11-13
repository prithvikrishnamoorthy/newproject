package com.demo.Vehicle.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "Vehicle")
public class VehiclePojo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idv")
	private int vehicle_id;

	private String vehicleModel;

	private int fuelCapacity;

	private int length;

	private int breadth;

	private int height;

	@JsonManagedReference
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "locationId")
	private LocationPojo locationPojo;

	public VehiclePojo(int vehicle_id, String vehicleModel, int fuelCapacity, int length, int breadth, int height,
			LocationPojo locationPojo) {
		super();
		this.vehicle_id = vehicle_id;
		this.vehicleModel = vehicleModel;
		this.fuelCapacity = fuelCapacity;
		this.length = length;
		this.breadth = breadth;
		this.height = height;
		this.locationPojo = locationPojo;
	}

	public VehiclePojo() {

	}

	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public int getVehicle_id() {
		return vehicle_id;
	}

	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public LocationPojo getLocationPojo() {
		return locationPojo;
	}

	public void setLocationPojo(LocationPojo locationPojo) {
		this.locationPojo = locationPojo;
	}

}

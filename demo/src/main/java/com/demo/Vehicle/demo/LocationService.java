package com.demo.Vehicle.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@PropertySource("classpath:application.properties")
public class LocationService {

	@Autowired
	private LocationRepo locationRepo;

//	LocationRepo locationRepo = new LocationRepo();
	
	@Autowired
	private VehicleRepo vehicleRepo;

//	@Value("${message}")
//	private String message;

//	Location Booking
	
	public String addLocation(LocationPojo locationPojo) {

		System.out.println("test1");

		locationRepo.save(locationPojo);

//		return locationPojo.getLocationName() + message;
		return locationPojo.getLocationName();

	}

//	Updating Location

	public String updateLocation(int id, LocationPojo locationPojo) {

		locationRepo.save(locationPojo);

		return "updated";

	}

//	vehiclelist in location

	public List<VehiclePojo> vehicleInLocation(int locationId) {

		return vehicleRepo.getVehicleList(locationId);

	}

}

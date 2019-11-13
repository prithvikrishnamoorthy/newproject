package com.demo.Vehicle.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@PropertySource("classpath:application.properties")
@Service
public class VehicleService {

	@Value("${message}")
	private String message;

	@Autowired
	private VehicleRepo vehicleRepo;

	public String addVehicle(VehiclePojo vehiclePojo, int locationId) {

		vehicleRepo.save(vehiclePojo);

		String messages;

		messages = vehiclePojo.getVehicle_id() + message;

		return messages;
	}

	public String delVehicle(int vehicle_id) {

		vehicleRepo.deleteById(vehicle_id);

		return "vehicle deleted";

	}

	public String updateVehicle(int vehicle_id, VehiclePojo vehiclePojo) {

		vehicleRepo.save(vehiclePojo);

		return "vehicle updated";

	}

}

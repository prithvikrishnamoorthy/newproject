package com.demo.Vehicle.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/demo/vehicle")

public class VehicleController {

	@Autowired
	private VehicleService vehicleService;

//	Adding Vehicle

	@RequestMapping(method = RequestMethod.POST, value = "/add/{locationId}")
	@ResponseBody
	public String addVehicle(@RequestBody VehiclePojo vehiclePojo, @PathVariable int locationId) {

		return vehicleService.addVehicle(vehiclePojo, locationId);

	}

//	delete 

	@RequestMapping(method = RequestMethod.DELETE, value = "/delete/{vehicle_id}")
	@ResponseBody
	public String delVehicle(@RequestBody VehiclePojo vehiclePojo, @PathVariable int vehicle_id) {

		return vehicleService.delVehicle(vehicle_id);

	}

//	update

	@RequestMapping(method = RequestMethod.PUT, value = "/update/{vehicle_id}")
	@ResponseBody
	public String updateVehicle(@RequestBody VehiclePojo vehiclePojo, @PathVariable int vehicle_id) {

		return vehicleService.updateVehicle(vehicle_id, vehiclePojo);

	}

}

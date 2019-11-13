package com.demo.Vehicle.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LocationController {

	@Autowired
	private LocationService locationService;

	// Adding location

	@RequestMapping(method = RequestMethod.POST, value = "/locationadd")
	@ResponseBody

	public String addLocation(@RequestBody LocationPojo locationPojo) {

		return locationService.addLocation(locationPojo);

	}

	// updating location

	@RequestMapping(method = RequestMethod.PUT, value = "/updatelocation/{id}")
	@ResponseBody

	public String updateLocation(@RequestBody LocationPojo locationPojo, @PathVariable int id) {

		return locationService.updateLocation(id, locationPojo);

	}

	// location list

	@RequestMapping(method = RequestMethod.GET, value = "/list/{locationId}")
	@ResponseBody

	public List<VehiclePojo> vehicleInLocation(@PathVariable int locationId) {

		return locationService.vehicleInLocation(locationId);

	}

}

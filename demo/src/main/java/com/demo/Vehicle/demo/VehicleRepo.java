package com.demo.Vehicle.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VehicleRepo extends JpaRepository<VehiclePojo, Integer> {

	@Query(value = "SELECT * FROM  demo.vehicle WHERE location_id = ?;", nativeQuery = true)
	List<VehiclePojo> getVehicleList(int locationId);

}
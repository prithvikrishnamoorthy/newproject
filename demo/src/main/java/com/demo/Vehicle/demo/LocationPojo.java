package com.demo.Vehicle.demo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "locationName" }) })
public class LocationPojo {

	@Id
	@Column(name = "locationId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int locationId;

	private String locationName;

	private String address;

/*	@Transient
	@JsonBackReference
	@OneToMany(mappedBy = "locationPojo", cascade = CascadeType.REMOVE)
	private List<VehiclePojo> vehiclePojo;
*/
	public LocationPojo(int locationId, String locationName, String address, List<VehiclePojo> vehiclePojo) {
		super();
		this.locationId = locationId;
		
		this.locationName = locationName;
		
		this.address = address;
		
//		this.vehiclePojo = vehiclePojo;
	}

	public LocationPojo() {

	}

	public int getLocationId() {
		
		return locationId;
		
	}

	public void setLocationId(int locationId) {
		
		this.locationId = locationId;
	}

	public String getLocationName() {
		
		return locationName;
	}

	public void setLocationName(String locationName) {
		
		this.locationName = locationName;
	}

	public String getAddress() {
		
		return address;
	}

	public void setAddress(String address) {
		
		this.address = address;
	}

/*	public List<VehiclePojo> getVehiclePojo() {
		return vehiclePojo;
	}

	public void setVehiclePojo(List<VehiclePojo> vehiclePojo) {
		this.vehiclePojo = vehiclePojo;
	}
*/
}
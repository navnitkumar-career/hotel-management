package com.example.test.DTO;

public class FacilityDTO {

	int id;
	String facilityName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFacilityName() {
		return facilityName;
	}

	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}

	@Override
	public String toString() {
		return "FacilityDTO [id=" + id + ", facilityName=" + facilityName + "]";
	}

}

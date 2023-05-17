package com.example.test.DTO;

public class ResidentDTO {

	int id;
	String residentName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getResidentName() {
		return residentName;
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

	@Override
	public String toString() {
		return "Facility [id=" + id + ", residentName=" + residentName + "]";
	}

}

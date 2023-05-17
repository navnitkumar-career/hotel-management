package com.example.test.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Resident {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

package com.example.test.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ResidentRoom {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	int roomId;
	int residentId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	@Override
	public String toString() {
		return "ResidentRoom [id=" + id + ", roomId=" + roomId + ", residentId=" + residentId + "]";
	}

}

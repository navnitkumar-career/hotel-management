package com.example.test.DTO;

public class ResidentRoomDTO {

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
		return "ResidentRoomDTO [id=" + id + ", roomId=" + roomId + ", residentId=" + residentId + "]";
	}

}

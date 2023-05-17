package com.example.test.DTO;

public class RoomDTO {

	int id;
	int roomNo;
	int facilityId;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public int getFacilityId() {
		return facilityId;
	}
	public void setFacilityId(int facilityId) {
		this.facilityId = facilityId;
	}
	
	@Override
	public String toString() {
		return "RoomDTO [id=" + id + ", roomNo=" + roomNo + ", facilityId=" + facilityId + "";
	}
	
	

}

package com.example.test.Service;

import java.util.List;
import java.util.Map;

import com.example.test.DTO.FacilityDTO;
import com.example.test.DTO.ResidentRoomDTO;
import com.example.test.DTO.RoomDTO;

public interface FacilityService {

	public List<FacilityDTO> getlist();

	Map<String, Object> getListByFacilityId(int id);

	public List<RoomDTO> getRoomList();

	public ResidentRoomDTO Add(ResidentRoomDTO residentRoom);

	void DeleteById(int id);

}

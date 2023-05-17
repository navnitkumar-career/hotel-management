package com.example.test.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.DTO.FacilityDTO;
import com.example.test.DTO.ResidentRoomDTO;
import com.example.test.DTO.RoomDTO;
import com.example.test.Service.FacilityService;

@RestController
public class FacilityContoller {

	@Autowired
	FacilityService facilityService;

	@GetMapping(path = "getlist", produces = "application/json")
	public List<FacilityDTO> getList() {

		List<FacilityDTO> facilityList = facilityService.getlist();

		return facilityList;
	}

	@GetMapping(path = "get/{id}", produces = "application/json")
	public Map<String, Object> getById(@PathVariable("id") int id) {
		Map<String, Object> map = facilityService.getListByFacilityId(id);
		return map;
	}

	@GetMapping(path = "getroomlist", produces = "application/json")
	public List<RoomDTO> getRoomList() {
		List<RoomDTO> list = facilityService.getRoomList();
		return list;
	}

	@GetMapping(path = "delete/{id}", produces = "application/json")
	public Map<String, String> delete(@PathVariable("id") int id) {
		facilityService.DeleteById(id);

		HashMap<String, String> map = new HashMap<>();
		map.put("status", "success");
		map.put("message", "Record Deleted");
		return map;

	}

	@PostMapping(path = "add", produces = "application/json", consumes = "application/json")
	public ResidentRoomDTO Add(@RequestBody ResidentRoomDTO residentRoom) {
		ResidentRoomDTO resident = facilityService.Add(residentRoom);
		return resident;
	}

}

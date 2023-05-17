package com.example.test.Serviceimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.DTO.FacilityDTO;
import com.example.test.DTO.ResidentRoomDTO;
import com.example.test.DTO.RoomDTO;
import com.example.test.Entity.Facility;
import com.example.test.Entity.ResidentRoom;
import com.example.test.Entity.Room;
import com.example.test.Repository.FacilityRepository;
import com.example.test.Repository.ResidentRoomRepository;
import com.example.test.Repository.RoomRepository;
import com.example.test.Service.FacilityService;

@Service
public class FacilityServiceimpl implements FacilityService {

	@Autowired
	ModelMapper modelMapper;

	@Autowired
	FacilityRepository facilityRepository;

	@Autowired
	RoomRepository roomRepository;

	@Autowired
	ResidentRoomRepository residentRoomRepository;

	@Transactional
	@Override
	public List<FacilityDTO> getlist() {

		List<Facility> list = facilityRepository.findAll();
		
		List<FacilityDTO> facilityList = list.stream().map(t -> {

			FacilityDTO facility = new FacilityDTO();
			modelMapper.map(t, facility);
			return facility;
		}).collect(Collectors.toList());
		return facilityList;

	}

	@Transactional
	@Override
	public Map<String, Object> getListByFacilityId(int id) {
		Map<String, Object> map = new LinkedHashMap<>();

		Facility facility = facilityRepository.findById(id).get();

		map.put("facilities", facility);

		List<Map<String, Object>> list = new ArrayList<>();

		List<Room> listRoom = roomRepository.getByFacilityId(id);

		for (Room room : listRoom) {
			Map<String, Object> map1 = new HashMap<>();
			map1.put("RoomId", room.getId());
			map1.put("RoomNo", room.getRoomNo());
			list.add(map1);
		}

		map.put("RoomList", list);

		return map;
	}

	@Override
	@Transactional
	public List<RoomDTO> getRoomList() {
		List<Room> list = roomRepository.findAll();

		List<RoomDTO> roomList = list.stream().map(t -> {
			RoomDTO room = new RoomDTO();
			modelMapper.map(t, room);
			return room;
		}).collect(Collectors.toList());
		return roomList;
	}

	@Override
	public ResidentRoomDTO Add(ResidentRoomDTO residentRoom) {

		ResidentRoom residentroom1 = new ResidentRoom();
		modelMapper.map(residentRoom, residentroom1);

		residentRoomRepository.save(residentroom1);
		modelMapper.map(residentroom1, residentRoom);
		return residentRoom;
	}

	@Override
	public void DeleteById(int id) {
		residentRoomRepository.deleteById(id);

	}

}

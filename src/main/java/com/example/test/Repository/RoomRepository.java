package com.example.test.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test.Entity.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {

	
	List<Room> getByFacilityId(int facilityId);

}

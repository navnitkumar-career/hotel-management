package com.example.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test.Entity.ResidentRoom;

@Repository
public interface ResidentRoomRepository extends JpaRepository<ResidentRoom, Integer> {

}

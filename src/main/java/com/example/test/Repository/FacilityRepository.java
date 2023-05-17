package com.example.test.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.test.Entity.Facility;

@Repository
public interface FacilityRepository extends JpaRepository<Facility, Integer> {

	@Query(value = "SELECT CASE WHEN COUNT(facility_name) > 0 THEN 'TRUE' ELSE 'FALSE' END FROM facility f WHERE f.facility_name=:name", nativeQuery = true)
	List<String> isFacilityExitsByName(String name);
	

}

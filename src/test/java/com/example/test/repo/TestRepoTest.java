package com.example.test.repo;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.test.Entity.Facility;
import com.example.test.Repository.FacilityRepository;

@SpringBootTest
public class TestRepoTest {

	@Autowired
	private FacilityRepository facilityRepository;

	@Test
	void isTestExitsById() {

		Facility facility = new Facility(8, "hotel233");
		System.out.println(facility);
		List<Facility> list1 = facilityRepository.findAll();

		System.out.println(list1.toString());
		facilityRepository.save(facility);

		List<String> list = facilityRepository.isFacilityExitsByName(facility.getFacilityName());
		System.out.println(list);
		// assertEquals(true, Boolean.parseBoolean(list.get(0)));
	}

//	@AfterEach
//	void tearDown() {
//		// facilityRepository.deleteAll();
//		System.out.println("tearDown");
//	}
//
//	@BeforeEach
//	void setUp() {
//		System.out.println("setUp");
//	}
}

package com.example.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


class TestApplicationTests {
	
	private Calculator c = new Calculator();

	@Test
	void contextLoads() {
	}

	@Test
	@Disabled      
	void testSum() {

		int expectedResult = 17;

		int actualResult = c.doSum(12, 3, 2);

		assertThat(actualResult).isEqualTo(expectedResult);

	}

	@Test
	void testProduct() {

		int expectedResult = 36;

		int actualResult = c.doProduct(12, 3);

		assertThat(actualResult).isEqualTo(expectedResult);

	}

	@Test
	void testCompare() {

		

		Boolean actualResult = c.compapeToNums(12, 12);

		assertThat(actualResult).isTrue();

	}}

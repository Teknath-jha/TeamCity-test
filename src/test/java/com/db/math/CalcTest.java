package com.db.math;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class CalcTest {

	Calc calc = new Calc();

	@Test
	public void testAddNums() {
		assertEquals(15, calc.addNums(10, 5));
	}

	@Test
	public void testAddNums2() {
		assertNotEquals(200, calc.addNums(10, 10));
	}
	
	@Test
	public void testAddNums3() {
		assertEquals(150, calc.addNums(100, 50));
	}

	@Test
	public void testAddNums4() {
		assertNotEquals(20, calc.addNums(180, 10));
	}
	
	@Test
	public void testAddNums5() {
		assertNotEquals(200, calc.addNums(10, 10));
	}
	
	@Test
	public void testAddNums6() {
		assertEquals(150, calc.addNums(100, 50));
	}

	@Test
	public void testAddNums7() {
		assertNotEquals(20, calc.addNums(180, 10));
	}
}
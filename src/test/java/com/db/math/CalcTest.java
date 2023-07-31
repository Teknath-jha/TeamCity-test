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
}
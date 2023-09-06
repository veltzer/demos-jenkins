package com.kavinschool.calc;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {
	private Calc myTest = new Calc(20, 10);
	private double result;


	@Test
	public void testAdd() {
		result = 30;
		assertEquals(result, myTest.add(), .01);
	}

	@Test
	public void testMul() {
		result = 200;
		assertEquals(result, myTest.mul(), .01);

	}

	@Test
	public void testSub() {
		result = 10;
		assertEquals(result, myTest.sub(), .01);
	}

	@Test
	public void testDiv() {
		result = 2;
		assertEquals(result, myTest.div(), .01);
	}

	@Test
	public void testSquare() {
		result = 400;
		assertEquals(result, myTest.square(), .01);
	}
	
	@Test
	public void testCube() {
		result = 8000;
		assertEquals(result, myTest.cube(), .01);
	}

	@Test
	public void testRem() {
		result = 0;
		assertEquals(result, myTest.rem(), .01);
	}
	
	@Test
	public void testPower() {
		result = 10240000000000.0;
		assertEquals(result, myTest.pow(), .01);
	}
	
}

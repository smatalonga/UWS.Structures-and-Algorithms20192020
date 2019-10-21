package com.uws.sya.junitexample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleCalculatorTest {

	@Test
	void testWithACero() {
		//Set test environment
		SimpleCalculator target = new SimpleCalculator();
		int inputA = 3;
		int inputB = 0;
		//Expected result
		int expectedResult = 3;
		//Stimuli to the unit under test (target.sum)
		int actualResult = target.sum(inputA, inputB);
		//Check
		assertEquals(expectedResult, actualResult);
		
	}
	
	@Test
	void testWithTwoEqualPositiveNumbers() {
		//Set test environment
		SimpleCalculator target = new SimpleCalculator();
		int inputA = 3;
		int inputB = 3;
		//Expected result
		int expectedResult = 6;
		//Stimuli to the unit under test (target.sum)
		int actualResult = target.sum(inputA, inputB);
		//Check
		assertEquals(expectedResult, actualResult);
		
	}
	
	@Test
	void testWithTwoDifferentPositiveNumbers() {
		//Set test environment
		SimpleCalculator target = new SimpleCalculator();
		int inputA = 3;
		int inputB = 4;
		//Expected result
		int expectedResult = 7;
		//Stimuli to the unit under test (target.sum)
		int actualResult = target.sum(inputA, inputB);
		//Check
		assertEquals(expectedResult, actualResult);
		
	}

}

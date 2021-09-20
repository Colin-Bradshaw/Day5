package com.ss.dayfive.assignment5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursiveSumClumpTest {
	RecursiveSumClump rsc = new RecursiveSumClump();
	
	int[] input1 = {-5, 0, 2, 2, 2, 7, 7, 10};
	int[] input2 = {-5, 0, 2, 2, 2, 7, 7, 10, 2, 2};
	
	int[] output1 = {-5, 0, 6, 14, 10};
	int[] output2 = {-5, 0, 6, 14, 10, 4};
	
	@Test
	void identicalValuesTest() {
		assertArrayEquals(output1, rsc.identicalValues(input1));
		assertArrayEquals(output2, rsc.identicalValues(input2));
		
	}
	
	@Test
	void groupSumClumpTest() {
		assertTrue(rsc.groupSumClump(output1, -5));
		assertTrue(rsc.groupSumClump(output1, 1));
		assertFalse(rsc.groupSumClump(output1, 3));
	}

}

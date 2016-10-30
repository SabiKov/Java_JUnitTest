package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.Test;

public class ArrayCompareTest {

	//Array.sort
	// Testing the two arrays contain the same value at each index location
	@Test
	public void testArraySort_RandomArray() {
		int[] numbers = {12, 3, 4, 1};
		int[] excepted = {1, 3, 4, 12};
		
		Arrays.sort(numbers);
		
		assertArrayEquals(excepted, numbers);
		
	}
	
	//Check nullPointerException and handling exception with JUnit test 
	@Test(expected=NullPointerException.class)
	public void testArraySort_NullArray() {
		int[] numbers = {};
		
		Arrays.sort(numbers);	
	}
	
	// Timeout measures the performance of the method 
	@Test(timeout=10)
	public void testSort_Performance() {
		int[] numbers = {12, 23, 4};
		
		for(int i = 0; i <= 1000000; i++) {
			
			numbers[0] = i;
		}
		Arrays.sort(numbers);	
	}

}

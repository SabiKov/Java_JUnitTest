package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {
	
	StringHelper helper =  new StringHelper();
	
	private String input;
	private String exceptedOutput;
	
	public StringHelperParameterizedTest(String input, String exceptedOutput) {
		this.input = input;
		this.exceptedOutput = exceptedOutput;
	}

	@Parameters
	public static Collection<String[]> testCondition() {
		String[][] expectedOutput = { {"AACD", "CD"},
									{"ACD", "CD" } };
		
		return Arrays.asList(expectedOutput);
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AInFirst2Positions() {
		//AACD => CD, ACD => CD, CDEF => CDEF, CDAA => CDAA

		assertEquals(exceptedOutput, helper.truncateAInFirst2Positions(input));
	}

	
}

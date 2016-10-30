package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {
	
	StringHelper helper;
	
	@Before
	public void beforeAddEveryMethod() {
		helper = new StringHelper();
	}
	

	@Test
	public void testTruncateAInFirst2Positions_AInFirst2Positions() {
		//AACD => CD, ACD => CD, CDEF => CDEF, CDAA => CDAA

		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
		assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
		//excepted, actual
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AInFirstPosition() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
		assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
	}
	//expected:<ABC[]> but was:<ABC[D]>
	
	//ABCD => false, ABAB => true, AB => true, A => false,
    @Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
    	assertFalse( 
    			helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }
    @Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
    	assertTrue( 
    			helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }
	
}

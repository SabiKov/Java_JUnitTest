package com.in28minutes.junit.helper;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeAfterTestCase {

	/**
	 * @BeforeClass executes only once.
	 * e.g initialize DB connection, 
	 * However, it can be replaced by using @Before or @After depend on the test case
	 * */
	@BeforeClass
	public static void beforeClass() {
		
		System.out.println("Before Class");
		
	}
	
	
	
	/**
	 * @Before test case executes "before" each test case method.
	 * e.g instantiate object,
	 * */
	@Before
	public void setup() {
		System.out.println("Before Test");
	}
	
	
	@Test
	public void test1() {
		System.out.println("test 1 executed");
	}
	
	@Test
	public void test2() {
		System.out.println("test 2 executed");
	}

	/**
	 * @After test case runs after every test method, using e.g close DB connection
	 * */
	@After
	public void tearDown() {
		System.out.println("After Test");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	
}

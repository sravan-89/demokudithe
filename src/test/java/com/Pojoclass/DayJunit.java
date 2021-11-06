package com.Pojoclass;

import java.util.Date;

import org.junit.*;


public class DayJunit {

	@BeforeClass
	public static void beforeclass() {
     System.out.println("Before Class ---> initilize the webdriver");
     }
	
	@AfterClass
	public static void afterclass() {
     System.out.println("After Class ---> Close Browser");
	}
	
	@Before
	public void before() {
     System.out.println("Before ---> Starting time of execution");
     Date d = new Date();
     System.out.println(d);
	}
	@After
	public void after() {
     System.out.println("After ---> Ending time of Execution");
	}
	@Test
	public void test1() {
    System.out.println("test1 ");
	}
	@Test
	public void test2() {
    System.out.println("test2");
	}
}

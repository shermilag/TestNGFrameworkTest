package com.TestNG.Test;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	@Test
	public void loginTest() {
		System.out.println("login test");
		//int i=9/0;
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void HomePageTest() {
		System.out.println("HomePage test");
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void SearchPageTest() {
		System.out.println("SearchPage test");
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void RegPageTest() {
		System.out.println("RegPage test");
	}
	

}

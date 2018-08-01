package com.TestNG.Test;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	
	@Test(timeOut=1000)
	public void infiniteloopTest() {
		int i =1;
		while(i==1) {
			System.out.println(i);
		}
	}

}

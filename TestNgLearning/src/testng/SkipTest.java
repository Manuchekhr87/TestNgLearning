package testng;

import org.testng.annotations.Test;

public class SkipTest {
	
	@Test(priority = 1) 
	public void Method1() {
		System.out.println("This method should be printed first");		
	}
	
	@Test(enabled = false)  // enabled = false means that the line will be skipped, and will not be tested
	public void Method2() {
		System.out.println("This method should be printed second");
	}
	
	@Test(priority = 3) 
	public void Method3() {
		System.out.println("This method should be printed third");		
	}
	
	@Test(priority = 4) 
	public void Method4() {
		System.out.println("This method should be printed fourth");		
	}

}

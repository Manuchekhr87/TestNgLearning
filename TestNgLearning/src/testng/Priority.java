package testng;

import org.testng.annotations.Test;

public class Priority {
	
	//If you do not prioritize the sequence of the results, it will print the results in alphabetical sequence
	
	@Test(priority = 1)       // priority = 1 means that it will be printed first
	public void Method1() {
		System.out.println("This method should be printed first");		
	}
	
	@Test(priority = 2)       // priority = 2 means that it will be printed first
	public void Method2() {
		System.out.println("This method should be printed second");
	}
	
	@Test(priority = 3)       // priority = 3 means that it will be printed third
	public void Method3() {
		System.out.println("This method should be printed third");		
	}
	
	@Test(priority = 4)       // priority = 4 means that it will be printed fourth
	public void Method4() {
		System.out.println("This method should be printed fourth");		
	}


}

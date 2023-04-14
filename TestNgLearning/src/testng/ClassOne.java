package testng;

import org.testng.annotations.Test;

public class ClassOne {
	
	//If you do not prioritize the sequence of the results, it will print the results in alphabetical sequence
	
	@Test(priority = 1)
	public void DemoOne() {
		System.out.println("This line should be printed first");		
	}
	
	@Test(priority = 2)
	public void DemoTwo() {
		System.out.println("This line should be printed second");		
	}
	
	@Test(priority = 3)
	public void DemoThree() {
		System.out.println("This line should be printed third");		
	}
	
	@Test(priority = 4)
	public void DemoFour() {
		System.out.println("This line should be printed fourth");	
		System.out.println("----------------------------------");
	}

}

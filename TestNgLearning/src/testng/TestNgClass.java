package testng;

import org.testng.annotations.Test;

public class TestNgClass {
	
	@Test(priority = 1)
	public void MethodOne() {
		System.out.println("This method should be printed first");
		
	}
	
	@Test(priority = 2)
	public void MethodTwo() {
		System.out.println("This method should be printed second");
		
	}

	@Test(priority = 3)
	public void MethodThree() {
		System.out.println("This method should be printed third");
	
	}

	@Test(priority = 4)
	public void MethodFour() {
		System.out.println("This method should be printed fourth");
	
	}

	@Test(priority = 5)
	public void MethodFive() {
		System.out.println("This method should be printed fifth");
	
	}
	

}

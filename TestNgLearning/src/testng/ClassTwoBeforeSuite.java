package testng;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ClassTwoBeforeSuite {
	
	@BeforeSuite   // this line will be tested first before all classes get tested
	@Test
	public void SDLC() {
		System.out.println("This line should print SDLC");		
	}
	
	@Test
	public void STLC() {
		System.out.println("This line should print STLC");		
	}
	
	@Test
	public void DLC() {
		System.out.println("This line should print DLC");		
	}
	
	@Test
	public void TestPlan() {
		System.out.println("This line should print TestPlan");	
		System.out.println("----------------------------------");
	}

}

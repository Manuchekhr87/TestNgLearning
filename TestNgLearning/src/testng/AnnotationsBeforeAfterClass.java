package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsBeforeAfterClass {
	
	@BeforeClass
	@Test
	public void English() {
		System.out.println("This line should print English");		
	}
	
	@Test
	public void Russian() {
		System.out.println("This line should print Russian");		
	}
	
	@BeforeTest
	@Test
	public void Tajik() {
		System.out.println("This line should print Tajik");		
	}
	
	@AfterTest
	@Test
	public void Persian() {
		System.out.println("This line should print Persian");		
	}
	
	@AfterClass
	@Test
	public void Turkish() {
		System.out.println("This line should print Turkish");	
	}


}

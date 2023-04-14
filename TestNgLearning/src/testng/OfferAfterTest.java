package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class OfferAfterTest {
	
	@Test
	public void AggFunction() {
		System.out.println("This line should print AggFunction");		
	}
	
	@AfterTest
	@Test
	public void Joins() {
		System.out.println("This line should print Joins");		
	}
	
	@Test
	public void Subquery() {
		System.out.println("This line should print Subquery");		
	}
	
	@Test
	public void ConditionalClauses() {
		System.out.println("This line should print ConditionalClauses");	
	}

}

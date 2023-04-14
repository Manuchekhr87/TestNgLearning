package testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InterviewBeforeTest {
	
	@Test
	public void Agile() {
		System.out.println("This line should print Agile");		
	}
	
	@BeforeTest
	@Test
	public void QALead() {
		System.out.println("This line should print QALead");		
	}
	
	@Test
	public void BusinessAnalyst() {
		System.out.println("This line should print BusinessAnalyst");		
	}
	
	@Test
	public void ProductOwner() {
		System.out.println("This line should print ProductOwner");		
	}


}

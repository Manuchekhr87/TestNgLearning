package testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class ClassThreeAfterSuite {
	
	@AfterSuite   // this line will be tested after all classes get tested, at the end
	@Test
	public void FixedIncome() {
		System.out.println("This line should print FixedIncome");		
	}
	
	@Test
	public void DerrivativeContract() {
		System.out.println("This line should print DerrivativeContracts");		
	}
	
	@Test
	public void Repo() {
		System.out.println("This line should print Repo");		
	}
	
	@Test
	public void USTreasuries() {
		System.out.println("This line should print USTreasuries");		
	}

}

package testng;

import org.testng.annotations.Test;

public class TestNgGroups {
	
	@Test
	public void MethodOne() {
		System.out.println("Print number 1");
		
	}
	
	/*                   This means that the test will run ONLY methods which have SmokeTest (in our case)
	<groups>
	   <run>
		 <include name="SmokeTest"></include>
	   </run>
    </groups>
	*/
	
	/*                   This means that the test will not run methods which have SmokeTest, 
	                     it will exclude it and the rest will be executed (in our case)
	<groups>
	   <run>
		 <exclude name="SmokeTest"></include>
	   </run>
    </groups>
	*/
		
	
	@Test(groups = {"SmokeTest"})
	public void MethodTwo() {
		System.out.println("Print number 2");
		
	}
	
	@Test
	public void MethodThree() {
		System.out.println("Print number 3");
		
	}
	
	@Test(groups = {"SmokeTest"})
	public void MethodFour() {
		System.out.println("Print number 4");
		
	}
	
	@Test
	public void MethodFive() {
		System.out.println("Print number 5");
		
	}
	
	@Test(groups = {"SmokeTest"})
	public void MethodSix() {
		System.out.println("Print number 6");
		
	}
	
	@Test
	public void MethodSeven() {
		System.out.println("Print number 7");
		
	}
	
	@Test
	public void MethodEight() {
		System.out.println("Print number 8");
		
	}
	
	

}

package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SalesForce {
	
	@Test
	public void SalesForceUrl() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Automation\\chromedriver.exe");
		
		WebDriver salesforce = new ChromeDriver();
		Thread.sleep(3000);
		
		salesforce.get("https:\\login.salesforce.com");		
		Thread.sleep(3000);
		
		salesforce.quit();
		Thread.sleep(4000);
	}
	
	@Test(dependsOnMethods = {"SalesForceUrl"}) // The line below will run after successful run of SalsForceUrl
	public void SalesForceLogin() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Automation\\chromedriver.exe");
		
		WebDriver salesforce = new ChromeDriver();
		Thread.sleep(3000);
		
		salesforce.get("https:\\login.salesforce.com");		
		Thread.sleep(3000);
		
		salesforce.findElement(By.id("username")).sendKeys("myusername"); // By.id("username") is a locator
		Thread.sleep(3000);
		
		salesforce.findElement(By.id("password")).sendKeys("mypassword");
		Thread.sleep(3000);
		
		salesforce.findElement(By.id("Login")).click();
		Thread.sleep(3000);
		
		salesforce.quit();
		Thread.sleep(4000);
	}
	
	@Test(dependsOnMethods = {"SalesForceLogin"})
	public void SalesForceLoginNegativeTes() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Automation\\chromedriver.exe");
		
		WebDriver salesforce = new ChromeDriver();
		Thread.sleep(3000);
		
		salesforce.get("https:\\login.salesforce.com");		
		Thread.sleep(3000);
		
		salesforce.findElement(By.id("username")).sendKeys("   "); 
		Thread.sleep(3000);
		
		salesforce.findElement(By.id("password")).sendKeys("   ");
		Thread.sleep(3000);
		
		salesforce.findElement(By.id("Login")).click();
		Thread.sleep(3000);
		
		salesforce.quit();
		Thread.sleep(4000);
		
	}

}

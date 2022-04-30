package Pompagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class flighttest {
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\selenium jar\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
		driver.get("http://jt-dev.azurewebsites.net/#/SignUp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
	}
	@Test
	public void FlightSearchfunction() {
	FlightSearchfunction rg=new FlightSearchfunction(driver); 
		
		Assert.assertEquals(driver.getCurrentUrl(), "http://jt-dev.azurewebsites.net/#/SignUp");
			rg.verifyDropdown();
			rg.Setdropdown();
			rg.SetFacebookRegistrationPageFirstname();
			rg.namefield();
			rg.addressfield();
			rg.iagreetermsandcondition();
			rg.signup();
			
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

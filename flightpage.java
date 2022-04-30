package Pompagefactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class flightpage {
	
		//declaration
		
	@FindBy(xpath="")private WebElement dropdown;
	@FindBy(xpath="")private WebElement namefield;  
	@FindBy(xpath="")private WebElement addressfield;
	@FindBy(xpath="")private WebElement iagreetermsandcondition;
	@FindBy(xpath="")private WebElement signup;
	
	
	//Initialization
	public flightpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//usage
	
	public void verifydropdown() {
		Assert.assertTrue(dropdown.isDisplayed(),"Dropdown is display");
	}
	public void Setdropdown() {
		Select lang=new Select(language);
		Assert.assertTrue(language.isDisplayed());		
		Assert.assertFalse(language.isSelected());		
		lang.selectByVisibleText("English");		
	}
	public void Setdropdown() {
	Select lange=new Select(language);
	Assert.assertTrue(language.isDisplayed());		
	Assert.assertFalse(language.isSelected());		
	lang.selectByVisibleText("Dutch");
	}
	public void namefield() {
		namefield.sendKeys("pratiksha jawarkar");
	}
	public void addressfield() {
		addressfield.sendKeys("pratikshashrijawarkar@gmail.com");
    }
	public void iagreetermsandcondition() {
		iagreetermsandcondition.click();
	}
	public void signup() {
		signup.click();
	
	}
}
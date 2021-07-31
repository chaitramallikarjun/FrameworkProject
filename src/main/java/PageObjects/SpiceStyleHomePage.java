package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpiceStyleHomePage {
	public WebDriver driver;
	

	
	public SpiceStyleHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//*[@id='keyword']")
	WebElement searchBox;
	
	@FindBy(css = "[type='submit'] span")
	WebElement submit;
	
public  WebElement searchBoxvalidation()
{
	return  searchBox;
	
}
public  WebElement submitvalidation()
{
	return  submit;
	
}

}

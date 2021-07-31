package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;

	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "highlight-book")
	 private WebElement book;

	@FindBy(xpath = "//li[@id='header-vacations']/a")
	private WebElement deals;

	@FindBy(css = "#spicestyleheader a")
	private WebElement spicestyleheader;

	public WebElement getbook() {
		return book;

	}

	public WebElement getdeals() {
		return deals;

	}
	public  WebElement getspicestyleheader() {
		
	
	return	 spicestyleheader;
		
		 

	}

}

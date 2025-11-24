package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.MyLocatorsReader;

public class TextBoxPage {
	
	private WebDriver driver;
	private MyLocatorsReader myLocatorsReader;
	
	
	

	//Constructor
	public TextBoxPage(WebDriver driver) {
		this.driver=driver;
		this.myLocatorsReader=new MyLocatorsReader("src/test/resources/locators/TextBox.loc");
		PageFactory.initElements(driver, this);
	}
	
	//Note: No Need to use @FindBy pagefactory here as we are reading locators from .loc file which is dynamic reading
	// @FindBy annotation supports compile time and not dynamic reading
	// Hence we will direct create methods to access them
	
		
	//Methods
	// We are returning webdriver because we created manager waits utility there we need WebElement as a method parameter
	
	
	public WebElement clickTextBox() {
		return driver.findElement(By.xpath(myLocatorsReader.getLocator("Elements.TextBox.link")));
	}
	
	public WebElement enterFullName() {
		return driver.findElement(By.xpath(myLocatorsReader.getLocator("Elements.TextBox.FullName.text")));
	}

	
	public WebElement enterEmail() {
		return driver.findElement(By.xpath(myLocatorsReader.getLocator("Elements.TextBox.Email.text")));
	}
	
	public WebElement enterCurrentAddress() {
		return driver.findElement(By.xpath(myLocatorsReader.getLocator("Elements.TextBox.CurrentAddress.text")));
	}
	
	public WebElement enterPassword() {
		return driver.findElement(By.id(myLocatorsReader.getLocator("Elements.TextBox.Password.text")));
	}
	
	public WebElement clickSubmit() {
		return driver.findElement(By.xpath(myLocatorsReader.getLocator("Elements.TextBox.Submit.button")));
	}
	
	
	

}

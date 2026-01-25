package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import utilities.MyLocatorsReader;

public class StudentRegistrationPage {
	
	private WebDriver driver;
	private MyLocatorsReader myLocatorsReader;
	
	//constructor
	public StudentRegistrationPage(WebDriver driver) {
		this.driver=driver;
		this.myLocatorsReader=new MyLocatorsReader("src/test/resources/locators/Registration.loc");
		PageFactory.initElements(driver, this);
	}
	
	
	//Methods
	public WebElement enterName() {
		return driver.findElement(By.id(myLocatorsReader.getLocator("Registration.Name.Text")));
	}
	
	public WebElement enterEmail() {
		return driver.findElement(By.xpath(myLocatorsReader.getLocator("Registration.Email.Text")));
	}
	
	

}

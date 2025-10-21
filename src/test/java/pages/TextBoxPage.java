package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.MyLocatorsReader;

public class TextBoxPage {
	
	private WebDriver driver;
	private MyLocatorsReader myLocatorsReader;
	
	
	

	//Constructor
	public TextBoxPage(WebDriver driver) {
		this.driver=driver;
		this.myLocatorsReader=new MyLocatorsReader("src/test/resources/locators/TextBox.loc");
	}
	
	//Note: No Need to use @FindBy pagefactory here as we are reading locators from .loc file
	// And we will direct create methods to access them
	
	
	//Methods
	
	public void clickElementsButton() {
		driver.findElement(By.xpath(myLocatorsReader.getLocator("Elements.Click"))).click();
	}
	
	public void clickTextBox() {
		driver.findElement(By.xpath(myLocatorsReader.getLocator("Elements.TextBox.link"))).click();
	}
	
	public void enterFullName(String fullName) {
		driver.findElement(By.xpath(myLocatorsReader.getLocator("Elements.TextBox.FullName.text"))).sendKeys(fullName);
	}

	
	public void enterEmail(String email) {
		driver.findElement(By.xpath(myLocatorsReader.getLocator("Elements.TextBox.Email.text"))).sendKeys(email);
	}
	
	public void enterCurrentAddress(String currentAddress) {
		driver.findElement(By.xpath(myLocatorsReader.getLocator("Elements.TextBox.CurrentAddress.text"))).sendKeys(currentAddress);
	}
	
	public void enterPassword(String password) {
		driver.findElement(By.id(myLocatorsReader.getLocator("Elements.TextBox.Password.text"))).sendKeys(password);
	}
	
	public void clickSubmit() {
		driver.findElement(By.xpath(myLocatorsReader.getLocator("Elements.TextBox.Submit.button"))).click();
	}
	
	

}

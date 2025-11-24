package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import utilities.MyLocatorsReader;

public class WebTablesPage {
	
	private WebDriver driver;
	private MyLocatorsReader myLocatorsReader;
	
	//constructor
	public WebTablesPage(WebDriver driver) {
		this.driver=driver;
		this.myLocatorsReader=new MyLocatorsReader("src/test/resources/locators/WebTables.loc");
		PageFactory.initElements(driver, this);
	}
	
	
	//Methods
	public WebElement openWebTableSection() {
		return driver.findElement(By.xpath(myLocatorsReader.getLocator("Elements.WebTables.Button")));
	}
	
	public WebElement getFirstNameFirstRow() {
		return driver.findElement(By.xpath(myLocatorsReader.getLocator("WebTables.Row1.FirstName")));
	}
	
	public WebElement getLastNameFirstRow() {
		return driver.findElement(By.xpath(myLocatorsReader.getLocator("WebTables.Row1.LastName")));
	}
	
	public WebElement getAgeFirstRow() {
		return driver.findElement(By.xpath(myLocatorsReader.getLocator("WebTables.Row1.Age")));
	}
	

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import utilities.MyLocatorsReader;

public class CheckBoxPage {
	
	private WebDriver driver;
	private MyLocatorsReader myLocatorsReader;
	
	//constructor
	public CheckBoxPage(WebDriver driver) {
		this.driver=driver;
		this.myLocatorsReader=new MyLocatorsReader("src/test/resources/locators/CheckBox.loc");
		PageFactory.initElements(driver, this);
	}
	
	
	//Methods
	public WebElement openCheckBoxSection() {
		return driver.findElement(By.xpath(myLocatorsReader.getLocator("Elements.CheckBox.link")));
	}
	
	public WebElement clickMainLevel1() {
		return driver.findElement(By.xpath(myLocatorsReader.getLocator("Elements.CheckBox.MainLevel1")));
	}
	
	public WebElement clickMainLevel2() {
		return driver.findElement(By.xpath(myLocatorsReader.getLocator("Elements.CheckBox.MainLevel2")));
	}
	

}

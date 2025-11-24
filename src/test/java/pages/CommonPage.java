package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.MyLocatorsReader;

public class CommonPage {

	private WebDriver driver;
	private MyLocatorsReader locReader;
	
	//Constructor
	public CommonPage(WebDriver driver) {
		this.driver=driver;
		this.locReader=new MyLocatorsReader("src/test/resources/locators/Common.loc");
	}
	
	
	public WebElement clickElementsButton() {
		return driver.findElement(By.xpath(locReader.getLocator("Elements.Click")));
	}
	
	public WebElement clickWidgetSection() {
		return driver.findElement(By.xpath(locReader.getLocator("Mainpage.Widgets")));
	}
	
	
}

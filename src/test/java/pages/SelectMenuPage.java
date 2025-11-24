package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import utilities.MyLocatorsReader;

public class SelectMenuPage {
	
	private WebDriver driver;
	private MyLocatorsReader locReader;
	
	//constructor
	public SelectMenuPage(WebDriver driver) {
		this.driver=driver;
		this.locReader=new MyLocatorsReader("src/test/resources/locators/SelectMenu.loc");
		PageFactory.initElements(driver, this);
	}
	
	
	//Methods
	public WebElement openSelectMenu() {
		return driver.findElement(By.xpath(locReader.getLocator("Widgets.SelectMenu")));
	}
	
	public WebElement selectOneDropDown() {
		return driver.findElement(By.xpath(locReader.getLocator("Widgets.SelectMenu.SelectOne")));
	}
	
	
	

}

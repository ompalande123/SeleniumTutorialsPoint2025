package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import utilities.MyLocatorsReader;

public class LinksPage {

	private WebDriver driver;
	private MyLocatorsReader locReader;
	
	//const
	public LinksPage(WebDriver driver) {
		this.driver=driver;
		this.locReader=new MyLocatorsReader("src/test/resources/locators/Links.loc");
		PageFactory.initElements(driver, this);
	}
	
	
	//Methods
	public WebElement openLinksSection() {
		return driver.findElement(By.xpath(locReader.getLocator("Elements.Links")));
	}
	
	public WebElement openLinksHome() {
		return driver.findElement(By.xpath(locReader.getLocator("Elements.Links.Home")));
	}
	
	
}

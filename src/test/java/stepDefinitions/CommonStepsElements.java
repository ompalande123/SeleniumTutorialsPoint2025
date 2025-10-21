package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.TextBoxPage;
import utilities.MyDriverManager;

public class CommonStepsElements {
	
	
	private WebDriver driver;
	TextBoxPage tb;
	
	
	@Given("user is on tutorials point page")
	public void useristutorialspointpage() {
		driver=MyDriverManager.getDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		tb=new TextBoxPage(driver);
	}
	
	@And("user expands Elements section from the page")
	public void userexpandsElementssectionfromthepage() {
		tb.clickElementsButton();
	}
	
	@And("user closes the browser")
	public void userclosesthebrowser() {
		MyDriverManager.quitDriver();
	}

}

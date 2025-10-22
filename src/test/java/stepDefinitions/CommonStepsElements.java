package stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.observer.entity.MediaEntity;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.TextBoxPage;
import utilities.MyDriverManager;
import utilities.MyExtentManager;
import utilities.MyScreenshotsManager;
import utilities.MyWaitsManager;

public class CommonStepsElements {

	private WebDriver driver;
	TextBoxPage tb;
	MyExtentManager extentManager=MyExtentManager.getInstance();
	MyWaitsManager myWaits=new MyWaitsManager();
	
	
	@Given("user is on tutorials point page")
	public void useristutorialspointpage() {
		driver=MyDriverManager.getDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		tb=new TextBoxPage(driver);
		
		extentManager.createTest("Logged in to Tutorials point");
		extentManager.testLog(Status.PASS, "Logged in successfully.."+driver.getCurrentUrl());
		String path=MyScreenshotsManager.captureScreenshot(driver, "HomePage");
		System.out.println("Path is: "+path);
		extentManager.addScreenshot(Status.INFO, path);
		
	}
	
	@And("user expands Elements section from the page")
	public void userexpandsElementssectionfromthepage() {
		myWaits.clickOnAfterElementVisible(driver, tb.clickElementsButton(), 20);
		extentManager.testLog(Status.PASS, "Elements section expaned");
		String path=MyScreenshotsManager.captureScreenshot(driver, "Elements Section");
		extentManager.addScreenshot(Status.PASS, path);
	}
	
	@And("user closes the browser")
	public void userclosesthebrowser() {
		MyDriverManager.quitDriver();
		extentManager.testLog(Status.PASS, "User closed browser successfully..");
		extentManager.flush();
	}

}

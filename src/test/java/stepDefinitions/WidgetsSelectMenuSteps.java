package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SelectMenuPage;
import utilities.MyDriverManager;
import utilities.MyExtentManager;
import utilities.MyWaitsManager;

public class WidgetsSelectMenuSteps {
	
	private WebDriver driver;
	SelectMenuPage sp;
	MyExtentManager extentManager = MyExtentManager.getInstance();
	MyWaitsManager myWaits=new MyWaitsManager();
	
	// constructor
		public WidgetsSelectMenuSteps() {
			driver = MyDriverManager.getDriver();
			sp = new SelectMenuPage(driver);
			if (extentManager == null) {
				extentManager = new MyExtentManager();
			}
		}
	
	@When("user clicks on select option")
	public void userclicksonselectoption() {
		myWaits.isVisible(driver, sp.openSelectMenu(), 100);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",sp.openSelectMenu());
		
	}
	
	@Then("user selects value from the dropdown")
	public void userSelectsValueFromDropDown() throws InterruptedException {
//		myWaits.clickOnAfterElementVisible(driver, sp.selectOneDropDown(), 100);
		Select select=new Select(sp.selectOneDropDown());
		select.selectByVisibleText("Mr.");
		Thread.sleep(5000);
		
	}

}

package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import io.cucumber.java.en.When;
import pages.CheckBoxPage;
import pages.TextBoxPage;
import utilities.MyDriverManager;
import utilities.MyExtentManager;
import utilities.MyWaitsManager;

public class ElementsCheckBoxSteps {

	private WebDriver driver;
	CheckBoxPage cb;
	MyExtentManager extentManager = MyExtentManager.getInstance();
	MyWaitsManager myWaits = new MyWaitsManager();

	public ElementsCheckBoxSteps() {
		driver = MyDriverManager.getDriver();
		cb = new CheckBoxPage(driver);
		if (extentManager == null) {
			extentManager = new MyExtentManager();
		}

	}

	@When("user selects checkbox section")
	public void userclicksonCheckBoxbutton() {

		myWaits.clickOnAfterElementVisible(driver, cb.openCheckBoxSection(), 20);
		extentManager.createTest("Inside Check Box validation");
		extentManager.testLog(Status.PASS, "User clicked on Checkbox");

	}

	@When("user selects level1 and level2 checkboxes")
	public void userselectslevel1andlevel2checkboxes() {

		myWaits.clickOnAfterElementVisible(driver, cb.clickMainLevel1(), 20);
		myWaits.clickOnAfterElementVisible(driver, cb.clickMainLevel2(), 20);
		extentManager.createTest("Check boxes selected");
		extentManager.testLog(Status.PASS, "User selected check boes");

	}
	
	@When("user select all child checkboxes")
	public void userallchildcheckboxes() throws InterruptedException {
		
		myWaits.clickOnAfterElementVisible(driver, cb.clickMainLevel1Plus(), 30);
		myWaits.clickOnAfterElementVisible(driver, cb.clickChild1Checkbox(), 20);
		myWaits.clickOnAfterElementVisible(driver, cb.clickChild2Checkbox(), 20);
		
		Assert.assertEquals(true, driver.findElement(By.xpath("//input[@id='c_bs_1']")).isSelected());
		
	}
	
	

}

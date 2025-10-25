package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.TextBoxPage;
import utilities.MyDriverManager;
import utilities.MyExtentManager;
import utilities.MyWaitsManager;

public class ElementsTextBoxSteps {
	
	private WebDriver driver;
	TextBoxPage tb;
	MyExtentManager extentManager=MyExtentManager.getInstance();
	MyWaitsManager myWaits=new MyWaitsManager();
	
	public ElementsTextBoxSteps() {
		driver=MyDriverManager.getDriver();
		tb=new TextBoxPage(driver);
		if(extentManager==null) {
			extentManager=new MyExtentManager();
		}
		
	}
	
	
	@When("user clicks on Text Box button")
	public void userclicksonTextBoxbutton() {
		
		myWaits.clickOnAfterElementVisible(driver, tb.clickTextBox(), 20);
		extentManager.createTest("Inside Text Box validation");
		extentManager.testLog(Status.PASS, "User clicked on Text");
		
	}
	
	
	@And("user fills Text Box fields")
	public void userfillsTextBoxfields() {
		
		myWaits.sendKeysAfterVisible(driver, tb.enterFullName(), 20, "Ethan Hunt");
		extentManager.testLog(Status.PASS, "User entered Full Name: "+"Ethan Hunt");
		
		String email="EthanHunt8180@gmail.com";
		myWaits.sendKeysAfterVisible(driver, tb.enterEmail(), 20, email);
		
		myWaits.sendKeysAfterVisible(driver, tb.enterCurrentAddress(), 20, "Yashada Supreme, F 303, Pune 412105");
		myWaits.sendKeysAfterVisible(driver, tb.enterPassword(), 20, "Test123");
		
	}
	
	@And("user clicks on Submit button")
	public void userclicksonSubmitbutton() throws InterruptedException {
		Thread.sleep(5000);
		tb.clickSubmit();
	}
	

}

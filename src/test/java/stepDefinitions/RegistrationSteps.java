package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.StudentRegistrationPage;
import utilities.MyDriverManager;
import utilities.MyExtentManager;
import utilities.MyWaitsManager;


public class RegistrationSteps {
	
	private WebDriver driver;
	StudentRegistrationPage sr;
	MyExtentManager extentManager=MyExtentManager.getInstance();
	MyWaitsManager myWaits=new MyWaitsManager();
	
	//Constructor
	public RegistrationSteps() {
		driver=MyDriverManager.getDriver();
		sr=new StudentRegistrationPage(driver);
		if(extentManager==null) {
			extentManager=new MyExtentManager();
		}
	}
	
	
	// Step Definitions
	@When("user enters student name")
	public void user_enters_student_name() throws InterruptedException {
		myWaits.sendKeysAfterVisible(driver, sr.enterName(), 10, "James Bond");
		
		
	}
	
	@And("user enters student email")
	public void user_enters_student_email() throws InterruptedException {
		myWaits.sendKeysAfterVisible(driver, sr.enterEmail(), 10, "test.tester@tester.com");
		Thread.sleep(5000);
		driver.quit();
	}
	

}

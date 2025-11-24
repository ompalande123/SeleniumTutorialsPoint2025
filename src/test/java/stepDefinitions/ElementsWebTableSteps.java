package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.WebTablesPage;
import utilities.MyDriverManager;
import utilities.MyExtentManager;
import utilities.MyWaitsManager;

public class ElementsWebTableSteps {
	
	private WebDriver driver;
	WebTablesPage wt;
	MyExtentManager extentManager = MyExtentManager.getInstance();
	MyWaitsManager myWaits=new MyWaitsManager();
	
	
	//constructor
	public ElementsWebTableSteps() {
		driver=MyDriverManager.getDriver();
		wt=new WebTablesPage(driver);
		if(extentManager == null) {
			extentManager=new MyExtentManager();
		}
		
	}
	
	
	//Steps definitions
	@When("user selects Web Tables section")
	public void userSelectsWebTablesSection() {
		myWaits.clickOnAfterElementVisible(driver, wt.openWebTableSection(), 30);
		
	}
	
	@Then("user get values from first row")
	public void userGetValuesFromWebTables() {
		String firstName=wt.getFirstNameFirstRow().getText();
		String lastName=wt.getLastNameFirstRow().getText();
		String age=wt.getAgeFirstRow().getText();
		
		System.out.println("First Name: "+firstName+"\n"
				+"Last Name: "+lastName+"\n"
				+"Age: "+age);
	}
	

}

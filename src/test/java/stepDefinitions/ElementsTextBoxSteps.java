package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.TextBoxPage;
import utilities.MyDriverManager;

public class ElementsTextBoxSteps {
	
	private WebDriver driver;
	TextBoxPage tb;
	
	
	public ElementsTextBoxSteps() {
		driver=MyDriverManager.getDriver();
		tb=new TextBoxPage(driver);
	}
	
	
	@When("user clicks on Text Box button")
	public void userclicksonTextBoxbutton() {
		
		tb.clickTextBox();
		
	}
	
	
	@And("user fills Text Box fields")
	public void userfillsTextBoxfields() {
		tb.enterFullName("Ethan Hunt");
		tb.enterEmail("EthanHunt8180@gmail.com");
		tb.enterCurrentAddress("Yashada Supreme, F 303, Pune 412105");
		tb.enterPassword("Test123");
	}
	
	@And("user clicks on Submit button")
	public void userclicksonSubmitbutton() throws InterruptedException {
		Thread.sleep(5000);
		tb.clickSubmit();
	}
	

}

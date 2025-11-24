package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LinksPage;
import utilities.MyDriverManager;
import utilities.MyExtentManager;
import utilities.MyWaitsManager;

public class ElementsLinksSteps {

	private WebDriver driver;
	LinksPage lp;
	MyExtentManager extentManager = MyExtentManager.getInstance();
	MyWaitsManager myWaits = new MyWaitsManager();

	// constructor
	public ElementsLinksSteps() {
		driver = MyDriverManager.getDriver();
		lp = new LinksPage(driver);
		if (extentManager == null) {
			extentManager = new MyExtentManager();
		}
	}

	// Step Definitions
	@When("user click on links button")
	public void useronlinksbutton() {
		System.out.println("Window handle of main page: "+driver.getWindowHandle());
		myWaits.clickOnAfterElementVisible(driver, lp.openLinksSection(), 40);
	}

	@Then("user clicks on Home url")
	public void useronHomeurl() throws InterruptedException {
		myWaits.clickOnAfterElementVisible(driver, lp.openLinksHome(), 30);
		Thread.sleep(50000);
		String windows=driver.getWindowHandle();
		System.out.println("Home link window : "+windows);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(180));
		
	}
	
	@And("user validates the title of the home page")
	public void userValidatesTitle() {
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
	}

}

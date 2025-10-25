package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.observer.entity.MediaEntity;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.TextBoxPage;
import utilities.MyDriverManager;
import utilities.MyExcelManager;
import utilities.MyExtentManager;
import utilities.MyScreenshotsManager;
import utilities.MyWaitsManager;

public class CommonStepsElements {

	private WebDriver driver;
	TextBoxPage tb;
	MyExtentManager extentManager=MyExtentManager.getInstance();
	MyWaitsManager myWaits=new MyWaitsManager();
	
	//Excel reading data
	Map<String, String> testData;
	
	
	@Given("user is on tutorials point page")
	public void useristutorialspointpage() throws IOException {
		driver=MyDriverManager.getDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		tb=new TextBoxPage(driver);
		
		extentManager.createTest("Logged in to Tutorials point");
		extentManager.testLog(Status.PASS, "Logged in successfully.."+driver.getCurrentUrl());
		String path=MyScreenshotsManager.captureScreenshot(driver, "HomePage");
		System.out.println("Path is: "+path);
		extentManager.addScreenshot(Status.INFO, path);
		
		//Excel data reading
		testData = MyExcelManager.getTestData("Create_Users", "2");
		System.out.println("Name captured is: "+testData.get("Username").toString());

		
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
	
	
	@When("user intentionally failed test case")
	public void userintentionallyfailedtestcase() {
		Assert.assertEquals(5, 7);	
		
	}
	
	@When("user read {string} and {string} from sheet")
	public void readdatafromExcel(String Username, String Jobname) {
		System.out.println(testData.get(Username));
		System.out.println(testData.get(Jobname));
	}
	
	@Given("user want to read sheet {string}")
	public void readSheet(String sheetName) throws IOException{
		List<Map<String, String>> users=MyExcelManager.readAllRows(sheetName, MyExcelManager.filePath);
		for(Map<String, String> user:users) {
			System.out.println("Test Data fetched as : "+user);
			if(user.get("Username").equalsIgnoreCase("Omkar")){
				System.out.println("Able to retrive specific values");
			}
		}
		
	}

}

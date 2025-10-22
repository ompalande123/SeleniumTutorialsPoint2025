package utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class MyExtentManager {
	
	private ExtentSparkReporter sparkReporter;
	private ExtentReports extent;
	private ExtentTest test;
	private static MyExtentManager instance;
	
	
	
	//
	public static MyExtentManager getInstance() {
		if(instance==null) {
			instance=new MyExtentManager();
		}
		return instance;
	}
	
	
	
	//
	public MyExtentManager() {
		String timestamp=new SimpleDateFormat("yyyyMMdd_HHmmSSS").format(new Date());
		
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"\\extentReports\\TestResult_"+timestamp+".html");
		
		sparkReporter.config().setDocumentTitle("Automation Execution Report");
		sparkReporter.config().setReportName("PetStore API Testing Report");
		sparkReporter.config().setTheme(Theme.STANDARD);
		
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		
	}
	
	
	public void createTest(String testName) {
		test = extent.createTest(testName);
	}
	
	
	public void testLog(Status st, String details) {
		test.log(st, details);
	}
	
	public void addScreenshot(Status st, String path) {
		test.log(st, MediaEntityBuilder.createScreenCaptureFromPath(path).build());
	}
	
	
	public void flush() {
		extent.flush();
	}

}

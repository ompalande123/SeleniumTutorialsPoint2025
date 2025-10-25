package runner;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features="@target/rerun.txt",
		glue="stepDefinitions",
		plugin= {"pretty"}
		
		)

public class FailedRunner extends AbstractTestNGCucumberTests {
	
	private static boolean allTestsPassed=true;
	
	@AfterMethod
	public void afterMethod(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			allTestsPassed=false;
		}
		
	}
	
	
	@AfterClass
	public static void clearRerunFile() {
		File rerunFile=new File("target/rerun.txt");
		
		if(!rerunFile.exists()) {
			System.out.println("File not found : rerun.txt");
		}
		
		try {
			String content = new String(Files.readAllBytes(Paths.get("target/rerun.txt")));
			
			if(allTestsPassed || content.trim().isEmpty()) {
				FileWriter writer=new FileWriter(rerunFile);
				writer.write("");
				writer.close();
			}else
			{
				System.out.println("Some tests are still failing in rerun.txt file: ");
				System.out.println(content);
			}
			
		}catch(IOException e) {
			System.err.println("Failed to process rerun.txt file");
			e.getMessage();
		}
		
	}

}
		
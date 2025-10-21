package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyDriverManager {
	
	private static WebDriver driver;
	
	public static WebDriver getDriver() {
		if(driver==null) {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
			
		}
		return driver;
	}
	
	
	public static void quitDriver() {
		if(driver!=null) {
			driver.quit();
			driver=null;
		}
	}
	

}

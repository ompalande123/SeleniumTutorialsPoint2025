package utilities;

import java.time.Duration;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class MyDriverManager {

	private static WebDriver driver;

	public static WebDriver getDriver() {
		MyConfigReader configReader = new MyConfigReader("src/test/resources/configurations/config.properties"); // we
																													// can't
																													// create
																													// object
																													// at
																													// class
																													// level
																													// if
																													// method
																													// is
																													// static

		if (driver == null) {

			switch (configReader.getConfigValue("browser")) {
			case "chrome":
				if (configReader.getConfigValue("headless").equalsIgnoreCase("true")) {
					ChromeOptions options = new ChromeOptions();
					options.addArguments("--headless=new");
					driver = new ChromeDriver(options);
				} else {
					driver = new ChromeDriver();
				}
				break;

			case "edge":
				if (configReader.getConfigValue("headless").equalsIgnoreCase("true")) {
					EdgeOptions options = new EdgeOptions();
					options.addArguments("--headless=new");
					driver = new EdgeDriver(options);
				} else {
					driver = new EdgeDriver();
				}
				break;
				
			default:
				throw new IllegalArgumentException(configReader.getConfigValue("browser")+" Not a valid browser name...");
				

			}

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));

		}
		return driver;
	}

	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}

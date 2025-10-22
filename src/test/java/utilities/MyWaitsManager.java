package utilities;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyWaitsManager {

	private WebDriver driver;

	// Constructor
	public MyWaitsManager() {
		this.driver = driver;
	}

	// explicit wait to handle click action with visibilityOf element
	public void clickOnAfterElementVisible(WebDriver driver, WebElement element, long timeout) {
		new WebDriverWait(driver, Duration.ofSeconds(timeout)).until(ExpectedConditions.visibilityOf(element));
		element.click();

	}

	// explit wait for visibility of element only
	public void isVisible(WebDriver driver, WebElement element, long timeout) {
		new WebDriverWait(driver, Duration.ofSeconds(timeout)).until(ExpectedConditions.visibilityOf(element));

	}

	// explicit wait to handle sendKeys with visibilityOf element
	public void sendKeysAfterVisible(WebDriver driver, WebElement element, long timeout, String value) {
		new WebDriverWait(driver, Duration.ofSeconds(timeout)).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}

}

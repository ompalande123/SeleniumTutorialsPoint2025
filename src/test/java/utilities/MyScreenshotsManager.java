package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class MyScreenshotsManager {

	
	public static String captureScreenshot(WebDriver driver, String screenshotName) {
		String timestamp=new SimpleDateFormat("yyyyMMdd_HHmmSSS").format(new Date());
		String destPath=System.getProperty("user.dir")+"/reports/screenshots/"+screenshotName+"_"+timestamp+".png";
		
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File(destPath));
		}catch(IOException e) {
			e.printStackTrace();
		}
//		return "reports/screenshots/"+screenshotName+"_"+timestamp+".png";
		return destPath;
	}
	
}

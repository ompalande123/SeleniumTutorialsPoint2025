package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MyLocatorsReader {
	
	private Properties prop;
	
	
	//Constructor
	public MyLocatorsReader(String filepath) {
		prop=new Properties();
		
		try(FileInputStream fis=new FileInputStream(filepath)){
			prop.load(fis);
		}catch(IOException e) {
			throw new RuntimeException("Unable to read locators file - "+filepath,e);
		}
	}
	
	
	public String getLocator(String key) {
		String locator=prop.getProperty(key);
		if(locator==null) {
			throw new RuntimeException("Locator not found - "+key);
		}
		return locator;
		
	}
	

}

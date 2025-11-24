package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MyConfigReader {
	
		private Properties prop;
		
		//Constructor
		public MyConfigReader(String filepath) {
			prop=new Properties();
			
			try(FileInputStream fis=new FileInputStream(filepath)){
				prop.load(fis);
			}catch(IOException e) {
				throw new RuntimeException("Unable to read config file - "+filepath,e);
			}
		}
		
		
		public String getConfigValue(String key) {
			String value=prop.getProperty(key);
			if(value==null) {
				throw new RuntimeException("Locator not found - "+key);
			}
			return value;
			
		}
		
}

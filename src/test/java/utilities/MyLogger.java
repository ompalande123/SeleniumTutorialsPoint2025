package utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyLogger {
	
	public static Logger getLogger(Class<?> className) {
		return LogManager.getLogger(className);
	}

}

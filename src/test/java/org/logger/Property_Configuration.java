package org.logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Property_Configuration {
	
	public static Logger Log= Logger.getLogger(Property_Configuration.class);
	
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j.properties");

		Log.info("info");
		Log.warn("Warning");
		Log.error("Error");
		Log.fatal("fatal");
			
	}

}
		
		
	
	
	
	
	



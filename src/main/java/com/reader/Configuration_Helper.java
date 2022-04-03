package com.reader;

import java.io.IOException;

public class Configuration_Helper {
	
	
	public Configuration_Helper() {
		//dummy
	}
	
	
	public static ConfigurationReader getInstanceCR() throws IOException {
	
		ConfigurationReader r = new ConfigurationReader();
		return r;

	}
          public static Configuration_Helper getInstance() {
        	  Configuration_Helper h = new Configuration_Helper();
        	  return h;

		}
	


}

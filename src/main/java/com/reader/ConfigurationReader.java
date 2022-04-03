package com.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    Properties p;
	public ConfigurationReader() throws IOException {
		
		File f = new File("C:\\Users\\LENOVO\\eclipse-workspace\\cucumber_cocept\\src\\main\\java\\com\\poperties\\Adactin.properties");
		FileInputStream fil = new FileInputStream(f);//fileNotFound exception throws
		 p = new Properties();
		p.load(fil);//Io exception 
		
	}
	
	public String getbrowser() {
		   String browser = p.getProperty("browser");
           return browser;
	}
	public String geturl() {
		String url = p.getProperty("url");
        return url;
	}
	
	public String getpath() {
		String path = p.getProperty("writepath");
		return path;

	}
	
	

}

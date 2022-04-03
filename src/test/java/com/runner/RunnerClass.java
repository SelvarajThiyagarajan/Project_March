package com.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseClass.BaseClass;
import com.reader.Configuration_Helper;

@RunWith(io.cucumber.junit.Cucumber.class)
@io.cucumber.junit.CucumberOptions(features ="src//test//java//com//cucumber//cucumber_cocept//Adactin.feature" ,
glue = "com.StepDefinition",
monochrome=true,

plugin = { "pretty",
		"html:target/HtmlReport.html",
		
		"json:target/JsonReport.json",
		
		
}
  )

public class RunnerClass {
	
	public static WebDriver driver ;
	@BeforeClass
	public static void setup() throws IOException {
		
		String browser = Configuration_Helper.getInstance().getInstanceCR().getbrowser();
		driver= BaseClass.browserLaunch(browser);
     
	}
	@AfterClass
	public static void tearDown() {
		driver.close();

	}
	

}

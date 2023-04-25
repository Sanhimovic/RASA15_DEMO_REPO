package com.demowebshop.automation.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base_Class
{
	public WebDriver driver;
	
	@Parameters({"time"})
	@BeforeMethod
	public void openapp(long time) throws IOException
	{
		String gecko_key = GetDataFromProperty.getData("GECKO_KEY");
		String gecko_value = GetDataFromProperty.getData("GECKO_VALUE");
		
		System.setProperty(gecko_key,gecko_value);
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		driver.get(GetDataFromProperty.getData("URL"));
	}
	
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}
}

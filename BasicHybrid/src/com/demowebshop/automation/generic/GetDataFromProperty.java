package com.demowebshop.automation.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetDataFromProperty 
{
	public static String getData(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./property/propertiesData.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}
}
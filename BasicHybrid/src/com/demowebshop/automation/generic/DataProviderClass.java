package com.demowebshop.automation.generic;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;

public class DataProviderClass 
{
	@DataProvider(name = "usercred")
	public Object[][] getData() throws EncryptedDocumentException, IOException
	{
		Object[][] arr = GenericRead_Excel.getData("Sheet3");
		return arr;
	}
}

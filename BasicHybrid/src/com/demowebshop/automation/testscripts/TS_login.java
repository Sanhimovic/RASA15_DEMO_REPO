package com.demowebshop.automation.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.demowebshop.automation.generic.Base_Class;
import com.demowebshop.automation.generic.DataProviderClass;
import com.demowebshop.automation.pomscripts.Pom_login;

@Listeners(com.demowebshop.automation.generic.ListenerClass.class)
public class TS_login extends Base_Class
{
	@Test(dataProvider = "usercred",dataProviderClass = DataProviderClass.class)
	public void loginscript(String user,String pass) throws InterruptedException
	{
		Thread.sleep(1500);
		String home_title = driver.getTitle();
		Assert.assertEquals(home_title, "Demo Web Shop");
		Reporter.log("HOME PAGE DISPLAYED");
		Pom_login pmc=new Pom_login(driver);
		pmc.login().click();
		String login_title = driver.getTitle();
		Assert.assertEquals(login_title, "Demo Web Shop. Login");
		Reporter.log("LOGIN PAGE DISPLAYED");
		Thread.sleep(1500);
		pmc.username().sendKeys(user);
		Thread.sleep(1500);
		pmc.password().sendKeys(pass);
		Thread.sleep(1500);
		String Error_msg = driver.findElement(By.xpath("//span[@for='Email']")).getText();
		SoftAssert sft=new SoftAssert();
		sft.assertEquals(Error_msg, "Please enter a valid email address");
		sft.assertAll();
		Reporter.log("PROPER ERROR MESSAGE IS DISPLAYED");
		pmc.cbox().click();
		Thread.sleep(1500);
		pmc.login_button().click();
		
	}
}

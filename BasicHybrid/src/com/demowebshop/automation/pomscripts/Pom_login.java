package com.demowebshop.automation.pomscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pom_login 
{
	@FindBy(linkText = "Log in")
	private WebElement login_link;
	
	@FindBy(id = "Email")
	private WebElement email_text;
	
	@FindBy(id = "Password")
	private WebElement pass_text;
	
	@FindBy(id = "RememberMe")
	private WebElement rem_cbox;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement login_btn;
	
	public Pom_login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement login()
	{
		return login_link;
	}
	
	public WebElement username()
	{
		return email_text;
	}
	
	public WebElement password()
	{
		return pass_text;
	}
	
	public WebElement cbox()
	{
		return rem_cbox;
	}
	
	public WebElement login_button()
	{
		return login_btn;
	}
}

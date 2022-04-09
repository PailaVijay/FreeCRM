package com.crm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.BaseClass;

public class LoginPage extends BaseClass {

	
	public LoginPage()
	{
		//this.driver=driver;
	  	 PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//li[@class='active']")
	WebElement LoginBtn;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement UserName;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement Password;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[4]")
	WebElement Login;
	
	
	public void clickLogin()
	{
		LoginBtn.click();
		
	}
	public void getUserName(String name) 
	{
		UserName.click();
		UserName.sendKeys(name);
	}
	
	public void getUserPassword(String psw) 
	{
		Password.click();
		Password.sendKeys(psw);
	}
	
	
	public void clickLoginBtn()
	{
		LoginBtn.click();
		
	}
	public String getTitle()
	{
	   return driver.getTitle();
	 
	}
	public void getHomePageTitle()
	{
		driver.getTitle();
		
	}
}

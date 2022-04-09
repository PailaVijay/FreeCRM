package com.crm.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.qa.base.BaseClass;

import com.crm.qa.pages.LoginPage;

public class TC_001_LoginPage extends BaseClass{

LoginPage lp;

@Test
 public void loginPageTitleTest()
{
    String title= lp.getTitle();
	Assert.assertEquals(title, "Free CRM software for customer relationship management, sales, marketing campaigns and support.");
	
	
		
}
	
@Test	
public void LoginTest() throws InterruptedException
{
	LoginPage lp= new LoginPage();
	lp.clickLogin();
	Thread.sleep(3000);
	lp.getUserName(username);
	lp.getUserPassword(password);
	lp.clickLoginBtn();
	
}
}

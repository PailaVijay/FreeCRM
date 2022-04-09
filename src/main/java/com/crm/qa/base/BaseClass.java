package com.crm.qa.base;





import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import com.crm.qa.utility.ReadConfiguration;

public class BaseClass {
  
public static WebDriver driver;
ReadConfiguration rc=new ReadConfiguration();
public String URL=rc.getUrl();
public String username=rc.getUserName();
public String password= rc.getPassword();




@BeforeClass
public void setUp()
{
   
       
	   System.setProperty("webdriver.chrome.driver", rc.getChrome());
	   driver= new ChromeDriver();
	   
	   driver.get(URL);
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
}


public void tearDown()
{
	driver.close();
}

}
	


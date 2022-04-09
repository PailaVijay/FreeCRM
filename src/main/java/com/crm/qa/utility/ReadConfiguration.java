package com.crm.qa.utility;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfiguration {
    public static Properties prop;
	public ReadConfiguration()
	{
	
		try {
			// String source= System.getProperty("user.dir")+"\\src\\main\\java\\com\\crm\\qa\\config\\config.properties";
			 File src= new File("C:\\Users\\Vijay\\eclipse-workspace\\FreeCRM\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			 FileInputStream fis= new FileInputStream(src);
			 prop= new Properties();
			 prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        	
			
		
}
	
	public String getUrl()
	{
	  String URL=prop.getProperty("url");
	  return URL;
		
	}
	public String getUserName()
	{
	  String UN=prop.getProperty("username");
	  return UN;
		
	}
	public String getPassword()
	{
	  String password=prop.getProperty("password");
	  return password;
		
	}
	public String getChrome()
	{
	  String chrome=prop.getProperty("chrome");
	  return chrome;
		
	}
	public String getFirefox()
	{
	  String FF=prop.getProperty("firefox");
	  return FF;
		
	}
	public String getEdge()
	{
	  String edge=prop.getProperty("edge");
	  return edge;
		
	}
}

package com.Baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Library {
	
	public static WebDriver driver;
	public static Properties prop;
	protected Logger logger;
	public void launchapplication() throws IOException {
		FileInputStream input=new FileInputStream("src/test/resources/Properities/Config.Property");
		prop=new Properties();
		prop.load(input);
		logger=Logger.getLogger(Library.class);
		PropertyConfigurator.configure("src/test/resources/Properities/log4j.properties");
		
		try {
			
			if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				logger.info("****************chrome browser launched*****");
			}
			else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				logger.info("****************firefox browser launched*****");
				
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
			
			logger.info("****************Application launched*****");
		}
		catch(Exception e)
		{
			System.out.println("Browser didnt launch");
			
			
		}
		

	}
	
	public void teardown()
	{
		driver.close();
	}
	

}

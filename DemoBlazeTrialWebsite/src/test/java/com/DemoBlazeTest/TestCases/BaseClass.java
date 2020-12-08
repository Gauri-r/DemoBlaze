package com.DemoBlazeTest.TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass
	{

		public WebDriver driver;
		public Properties propConfig;
		public Properties propPath;
		Logger logs;
		

		public WebDriver InitializeDriver() throws IOException
			{
				propConfig=new Properties();
				propPath= new Properties();
				logs=LogManager.getLogger(BaseClass.class.getName());
				//For Config.properties File
				
//				File fileConfig = new File(System.getProperty("user.dir")
//						+ "\\src\\test\\java\\com\\DemoBlazeTest\\TestData\\Config.properties");
				FileInputStream fisConfig = new FileInputStream("F:\\Gauri\\EclipseOxygen\\DemoBlazeTrialWebsite\\src\\main\\java\\resources\\Config.properties");
				propConfig.load(fisConfig);     
				
				//For path.properties File
				/*File filePath = new File(System.getProperty("user.dir")
						+ "\\src\\main\\java\\resources\\Path.properties");
				*/
				FileInputStream fisPath = new FileInputStream("F:\\Gauri\\EclipseOxygen\\DemoBlazeTrialWebsite\\src\\main\\java\\resources\\Path.properties");
				propPath.load(fisPath);	
				
				System.out.println("xpathloginlink :"+propPath.getProperty("xpathloginlink"));
				//propPath.setProperty("name", "KOP");

				if (propConfig.getProperty("Browser").equals("chrome"))
					{
						System.setProperty("webdriver.chrome.driver", propConfig.getProperty("chromepath"));
						driver = new ChromeDriver();
						driver.manage().window().maximize();
						logs.info("Chrome Browser Started successfully");
					}
				else if (propConfig.getProperty("Browser").equals("chrome"))
					{

					}
				return driver;
			}
	}

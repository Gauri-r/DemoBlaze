package com.DemoBlazeTest.Pageobject;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage_PageObject
	{
		WebDriver driver;
		Properties propPath;
		By phoneLink;
		By laptopLink;
		By monitorLink;

		public HomePage_PageObject(WebDriver driver, Properties propPath)
			{
				// TODO Auto-generated constructor stub
				this.driver = driver;
				this.propPath = propPath;
				phoneLink = By.xpath(propPath.getProperty("xpathcategoryphonelink"));
				laptopLink = By.xpath(propPath.getProperty("xpathcategorylaptopslink"));
				monitorLink = By.xpath(propPath.getProperty("xpathcategorymonitorlink"));

			}
		
		public WebElement getPhoneLink()
			{
				return(driver.findElement(phoneLink));
			}
		public WebElement getLaptopLink()
			{
				return(driver.findElement(laptopLink));
			}
		public WebElement getMonitorLink()
			{
				return(driver.findElement(monitorLink));
			}


	}

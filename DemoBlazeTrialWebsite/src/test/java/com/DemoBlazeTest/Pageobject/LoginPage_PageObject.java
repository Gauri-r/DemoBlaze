package com.DemoBlazeTest.Pageobject;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.DemoBlazeTest.TestCases.BaseClass;

public class LoginPage_PageObject extends BaseClass
	{
		WebDriver driver;
		Properties propPath;
		By loginLink;
		By userNameText;
		By passwordText;
		By loginButton;

		public LoginPage_PageObject(WebDriver driver, Properties propPath)
			{
				// TODO Auto-generated constructor stub
				this.driver = driver;

				this.propPath = propPath;
				loginLink = By.xpath(propPath.getProperty("xpathloginlink"));
				// By loginLink = By.xpath("//a[@id='login2']");
				userNameText = By.xpath(propPath.getProperty("xpathusernametext"));
				passwordText = By.xpath(propPath.getProperty("xpathpasswordtext"));
				loginButton = By.xpath(propPath.getProperty("xpathsubmitloginbutton"));

				// System.out.println("xpathloginlink
				// :"+propPath.getProperty("xpathusernametext"));
			}

		public WebElement GetLoginLink()
			{
				System.out.println(propPath.getProperty("xpathusernametext"));
				return (driver.findElement(loginLink));

			}

		public WebElement GetUserNameText()
			{
				return (driver.findElement(userNameText));
			}

		public WebElement GetPasswordText()
			{
				return (driver.findElement(passwordText));
			}

		public WebElement GetLoginButton()
			{
				return (driver.findElement(loginButton));
			}

	}

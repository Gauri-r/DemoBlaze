package com.DemoBlazeTest.Pageobject;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PurchaseMonitor_PageObject
	{
		WebDriver driver;
		Properties propPath;
		By xpathmonitor_asusfullhd_link;
		By xpath_addtocart_button;
		By xpath_cart_link;
		By xpath_cart_placeorder_button;
		By xpath_placeorder_name_text;
		By xpath_placeorder_country_text;
		By xpath_placeorder_city_text;
		By xpath_placeorder_creditcard_text;
		By xpath_placeorder_month_text;
		By xpath_placeorder_year_text;
		By xpath_purchase_button;
		By xpath_purchase_ok_button;

		public PurchaseMonitor_PageObject(WebDriver driver, Properties propPath)
			{
				// TODO Auto-generated constructor stub
				this.driver = driver;
				this.propPath = propPath;
				xpathmonitor_asusfullhd_link = By.xpath(propPath.getProperty("xpathmonitor_asusfullhd_link"));
				xpath_addtocart_button = By.xpath(propPath.getProperty("xpath_addtocart_button"));
				xpath_cart_link = By.xpath(propPath.getProperty("xpath_cart_link"));
				xpath_cart_placeorder_button = By.xpath(propPath.getProperty("xpath_cart_placeorder_button"));
				xpath_placeorder_name_text = By.xpath(propPath.getProperty("xpath_placeorder_name_text"));
				xpath_placeorder_country_text = By.xpath(propPath.getProperty("xpath_placeorder_country_text"));
				xpath_placeorder_city_text = By.xpath(propPath.getProperty("xpath_placeorder_city_text"));
				xpath_placeorder_creditcard_text = By.xpath(propPath.getProperty("xpath_placeorder_creditcard_text"));
				xpath_placeorder_month_text = By.xpath(propPath.getProperty("xpath_placeorder_month_text"));
				xpath_placeorder_year_text = By.xpath(propPath.getProperty("xpath_placeorder_year_text"));
				xpath_purchase_button = By.xpath(propPath.getProperty("xpath_purchase_button"));
				xpath_purchase_ok_button = By.xpath(propPath.getProperty("xpath_purchase_ok_button"));

			}

		public WebElement getClickOnMonitor()
			{
				return driver.findElement(xpathmonitor_asusfullhd_link);
			}

		public WebElement getClickOnAddToCart()
			{
				return driver.findElement(xpath_addtocart_button);
				// return driver.findElement(cssSelectorphone_addtocart_button);
			}

		public WebElement getClickOnCartLink()
			{
				return driver.findElement(xpath_cart_link);
			}

		public WebElement getClickOnPlaceOrder()
			{
				return driver.findElement(xpath_cart_placeorder_button);
			}

		public WebElement getInputName()
			{
				return driver.findElement(xpath_placeorder_name_text);
			}

		public WebElement getInputCountryName()
			{
				return driver.findElement(xpath_placeorder_country_text);
			}

		public WebElement getInputCityName()
			{
				return driver.findElement(xpath_placeorder_city_text);
			}

		public WebElement getInputCreditCardDetails()
			{
				return driver.findElement(xpath_placeorder_creditcard_text);
			}

		public WebElement getInputMonth()
			{
				return driver.findElement(xpath_placeorder_month_text);
			}

		public WebElement getInputYear()
			{
				return driver.findElement(xpath_placeorder_year_text);
			}

		public WebElement getClickOnPurchase()
			{
				return driver.findElement(xpath_purchase_button);
			}

		public WebElement getClickOnOk()
			{
				return driver.findElement(xpath_purchase_ok_button);
			}

	}

package com.DemoBlazeTest.TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.DemoBlazeTest.Pageobject.HomePage_PageObject;
import com.DemoBlazeTest.Pageobject.LoginPage_PageObject;
import com.DemoBlazeTest.Pageobject.PurchaseLaptop_PageObject;
import com.DemoBlazeTest.Pageobject.PurchaseMonitor_PageObject;
import com.DemoBlazeTest.Pageobject.PurchasePhone_PageObject;

public class LoginPage_TestCase extends BaseClass
	{
		WebDriver driver;
		HomePage_PageObject homePageObject;
		WebDriverWait wait;
		PurchasePhone_PageObject purchasePhone;
		PurchaseLaptop_PageObject purchaseLaptop;
		PurchaseMonitor_PageObject purchaseMonitor;

		@BeforeTest
		public void Initialization() throws IOException
			{
				driver = InitializeDriver();
				driver.get(propConfig.getProperty("url"));

				homePageObject = new HomePage_PageObject(driver, propPath);
				purchasePhone = new PurchasePhone_PageObject(driver, propPath);
				purchaseLaptop = new PurchaseLaptop_PageObject(driver, propPath);
				purchaseMonitor = new PurchaseMonitor_PageObject(driver, propPath);
				wait = new WebDriverWait(driver, 10);
				// System.out.println("xpathloginlink
				// :"+propPath.getProperty("xpathloginlink"));
			}

		@Test
		private void Login() throws InterruptedException
			{
				// TODO Auto-generated method stub
				LoginPage_PageObject login = new LoginPage_PageObject(driver, propPath);
				// System.out.println("xpathusernametext
				// :"+propPath.getProperty("xpathusernametext"));

				login.GetLoginLink();
				login.GetLoginLink().click();
				Thread.sleep(2000);
				login.GetUserNameText().sendKeys(propPath.getProperty("username"));
				login.GetPasswordText().sendKeys(propPath.getProperty("password"));
				login.GetLoginButton().click();
				logs.info("Login to Demoblaze is Successful");
			}

		@Test(dependsOnMethods = { "Login" })
		private void PurchasePhone() throws InterruptedException
			{
				// driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
				Thread.sleep(3000);
				homePageObject.getPhoneLink().click();
				System.out.println("PhoneLink Clicked");
				Thread.sleep(5000);
				purchasePhone.getClickOnPhone().click();
				driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
				/*
				 * if(driver.switchTo().alert() != null) {
				 * System.out.println(driver.switchTo().alert().getText()); }
				 */
				purchasePhone.getClickOnAddToCart().click();

				// Thread.sleep(2000);
				purchasePhone.getClickOnCartLink().click();
				purchasePhone.getClickOnPlaceOrder().click();
				purchasePhone.getInputName().sendKeys(propPath.getProperty("purchase_customer_name"));
				purchasePhone.getInputCountryName().sendKeys(propPath.getProperty("purchase_country_name"));
				purchasePhone.getInputCityName().sendKeys(propPath.getProperty("purchase_city_name"));
				purchasePhone.getInputCreditCardDetails().sendKeys(propPath.getProperty("purchase_creditcard"));
				purchasePhone.getInputMonth().sendKeys(propPath.getProperty("purchase_month"));
				purchasePhone.getInputYear().sendKeys(propPath.getProperty("purchase_year"));
				/* driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); */
				Thread.sleep(3000);
				purchasePhone.getClickOnPurchase().click();
				// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				Thread.sleep(2000);
				purchasePhone.getClickOnOk().click();
				logs.info("Purchase of Phone Successful");
			}

		@Test(dependsOnMethods = { "Login" })
		private void PurchaseLaptops() throws InterruptedException
			{
				// driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				Thread.sleep(5000);
				// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(propPath.getProperty("xpathcategorylaptopslink"))));
				homePageObject.getLaptopLink().click();
				Thread.sleep(3000);
				// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				System.out.println("LaptopLink Clicked");
				purchaseLaptop.getClickOnLaptop().click();
				System.out.println("MacBook Pro Link Clicked");
				Thread.sleep(2000);
				purchaseLaptop.getClickOnAddToCart().click();

				// Thread.sleep(2000);
				purchaseLaptop.getClickOnCartLink().click();
				Thread.sleep(2000);
				purchaseLaptop.getClickOnPlaceOrder().click();
				Thread.sleep(2000);
				purchaseLaptop.getInputName().sendKeys(propPath.getProperty("purchase_customer_name"));
				purchaseLaptop.getInputCountryName().sendKeys(propPath.getProperty("purchase_country_name"));
				purchaseLaptop.getInputCityName().sendKeys(propPath.getProperty("purchase_city_name"));
				purchaseLaptop.getInputCreditCardDetails().sendKeys(propPath.getProperty("purchase_creditcard"));
				purchaseLaptop.getInputMonth().sendKeys(propPath.getProperty("purchase_month"));
				purchaseLaptop.getInputYear().sendKeys(propPath.getProperty("purchase_year"));
				/* driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); */
				Thread.sleep(3000);
				purchaseLaptop.getClickOnPurchase().click();
				// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				Thread.sleep(2000);
				purchaseLaptop.getClickOnOk().click();

				logs.info("Purchase of Laptop Successful");

			}

		@Test(dependsOnMethods = { "Login" })
		private void PurchaseMonitor() throws InterruptedException
			{
				homePageObject.getMonitorLink().click();
				Thread.sleep(3000);
				System.out.println("MonitorLink Clicked");
			
				Thread.sleep(2000);
				purchaseMonitor.getClickOnMonitor().click();
				Thread.sleep(3000);
				purchaseMonitor.getClickOnAddToCart().click();

				
				purchaseMonitor.getClickOnCartLink().click();
				Thread.sleep(2000);
				purchaseMonitor.getClickOnPlaceOrder().click();
				Thread.sleep(2000);
				purchaseMonitor.getInputName().sendKeys(propPath.getProperty("purchase_customer_name"));
				purchaseMonitor.getInputCountryName().sendKeys(propPath.getProperty("purchase_country_name"));
				purchaseMonitor.getInputCityName().sendKeys(propPath.getProperty("purchase_city_name"));
				purchaseMonitor.getInputCreditCardDetails().sendKeys(propPath.getProperty("purchase_creditcard"));
				purchaseMonitor.getInputMonth().sendKeys(propPath.getProperty("purchase_month"));
				purchaseMonitor.getInputYear().sendKeys(propPath.getProperty("purchase_year"));
				/* driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); */
				Thread.sleep(3000);
				purchaseMonitor.getClickOnPurchase().click();
				// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				Thread.sleep(2000);
				purchaseMonitor.getClickOnOk().click();

				logs.info("Purchase of Monitor Successful");
			}

		/*
		 * @AfterTest private void TearDown() { driver.close(); }
		 */
	}

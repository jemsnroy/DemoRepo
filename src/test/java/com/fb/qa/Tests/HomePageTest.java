package com.fb.qa.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.qa.TestBase.TestBase;
import com.fb.qa.TestPages.HomePage;
import com.fb.qa.TestPages.LoginPage;

public class HomePageTest extends TestBase {

	LoginPage lp;
	HomePage hp;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialize();
		lp = new LoginPage();
		hp = lp.enterLoginCred(prop.getProperty("UserName"), prop.getProperty("Password"));
	}

	@Test(priority = 1)
	public void verifyURL() {
		String expectedURL = "https://www.facebook.com/";
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);
	}
	
	@Test(priority = 2)
	public void verifySearchBox() {
	boolean flag =	hp.validateSearchBox();
	Assert.assertTrue(flag);
	}

	@Test(priority = 3)
	public void verifyLogOutButton() {
		lp=hp.clickOnButton();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

package com.fb.qa.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.qa.TestBase.TestBase;
import com.fb.qa.TestPages.HomePage;
import com.fb.qa.TestPages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage lp;
	HomePage hp;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialize();
		lp = new LoginPage();
	}

	@Test (priority = 1)
	public void verifyImage() {
		boolean flag1 = lp.validateImage();
		Assert.assertTrue(flag1, "No,The image is not displayed");
	}

	@Test (priority = 2)
	public void verifyText() {
		boolean flag2 = lp.validateText();
		Assert.assertTrue(flag2, "No,The text is not displayed");
	}

	@Test (priority = 3)
	public void verifyURL() {
		String expectedURL = prop.getProperty("url");
		String actualURL = lp.validateUrl();
		Assert.assertEquals(expectedURL, actualURL);
	}

	@Test (priority = 4)
	public void verifyloginWithWrongChar() {
		lp.enterLoginCred(prop.getProperty("UserNameWro"), prop.getProperty("PassWro"));
		
		String expectedErr = "The email or mobile number you entered isn’t connected to an account. Find your account and log in.";
		String actualErr = lp.readWrongEmailErr();
		Assert.assertEquals(actualErr, expectedErr);
	}
	
	@Test (priority = 5)
	public void verifyLogin() {
		hp = lp.enterLoginCred(prop.getProperty("UserName"), prop.getProperty("Password"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

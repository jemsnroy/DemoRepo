package com.fb.qa.Tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.qa.TestBase.TestBase;
import com.fb.qa.TestPages.LoginPage;
import com.fb.qa.TestPages.SignUpPage;

public class SignUpPageTest extends TestBase {
	LoginPage lp;
	SignUpPage sp;

	public SignUpPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialize();
		lp = new LoginPage();
		sp = new SignUpPage();
	}

	@Test
	public void verifyCNA() {
		sp.clickOnCNA(prop.getProperty("FirstName"), prop.getProperty("LastName"),prop.getProperty("Email"), prop.getProperty("NewPass"), prop.getProperty("Month"), prop.getProperty("Day"), prop.getProperty("Year"));
	}

	
}

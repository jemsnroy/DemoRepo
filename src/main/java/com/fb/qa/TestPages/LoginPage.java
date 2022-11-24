package com.fb.qa.TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.TestBase.TestBase;

public class LoginPage extends TestBase {

	@FindBy(xpath = "//img[@class='fb_logo _8ilh img']")
	public WebElement image;

	@FindBy(xpath = "//h2[@class='_8eso']")
	public WebElement text;

	@FindBy(name = "email")
	public WebElement email;

	@FindBy(name = "pass")
	public 	WebElement pass;

	@FindBy(name = "login")
	public 	WebElement button;
	
	@FindBy(xpath = "//div[@class='_9ay7']")
	public WebElement emailErr;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean validateImage() {
		return image.isDisplayed();
	}

	public boolean validateText() {
		return text.isDisplayed();
	}
	
	public String validateUrl() {
		 return driver.getCurrentUrl();
	}
	
	public String readWrongEmailErr() {
		return emailErr.getText();
	}
	
	public HomePage enterLoginCred(String un, String pa) {
		email.sendKeys(un);
		pass.sendKeys(pa);
		button.click();
		return new HomePage();
	}
}

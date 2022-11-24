package com.fb.qa.TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.TestBase.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//div[@class='x78zum5 x1n2onr6']")
	WebElement button;

	@FindBy(xpath = "//span[contains(text(),'Log Out')]")
	WebElement logout;
	
	@FindBy(xpath = "//div[@role='banner']/div[2]//label")
	WebElement serchbox;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String url() {
		return driver.getCurrentUrl();
	}
	
	public boolean validateSearchBox() {
		return serchbox.isDisplayed();
	}

	public LoginPage clickOnButton() {
		button.click();
		logout.click();
		return new LoginPage();
	}
}

package com.fb.qa.TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.fb.qa.TestBase.TestBase;

public class SignUpPage extends TestBase {

	@FindBy(partialLinkText = "Create new account")
	WebElement cnButton;

	@FindBy(name = "firstname")
	WebElement fName;

	@FindBy(name = "lastname")
	WebElement lName;

	@FindBy(name = "reg_email__")
	WebElement email;

	@FindBy(id = "password_step_input")
	WebElement password;

	@FindBy(id = "month")
	WebElement month;

	@FindBy(id = "day")
	WebElement day;
	
	@FindBy(id = "year")
	WebElement year;
	
	@FindBy(xpath = "//label[contains(text(),'Male')]")
	WebElement gender;
	
	@FindBy(name = "websubmit")
	WebElement button;
	
	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnCNA(String firstName, String lastName, String enterEmail, String pass, String m, String d, String y ) {
		cnButton.click();
		fName.sendKeys(firstName);
		lName.sendKeys(lastName);
		email.sendKeys(enterEmail);
		password.sendKeys(pass);
		
		Select s1 = new Select(month);
		s1.selectByVisibleText(m);
		
		Select s2 = new Select(day);
		s2.selectByVisibleText(d);
		
		Select s3 = new Select(year);
		s3.selectByVisibleText(y);
		
		gender.click();
		button.click();
	}

	public void fillUPForm() {

	}
}

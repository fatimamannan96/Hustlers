package com.ebay.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signinpage {

	WebDriver driver;
	public Signinpage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(id="userid")
		WebElement email;
		
		public void enterEmail(String eName) {
			email.sendKeys(eName);
		}
		
		@FindBy(name="pass")
		WebElement password;
		
		public void enterPassword(String pass) {
			password.sendKeys(pass);
		
	}
}

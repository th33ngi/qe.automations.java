package com.automation.qe.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automation.qe.base.BasePage;
import com.automation.qe.utility.WebElements;

public class HomePage extends BasePage{
	WebElements webElement;
	
	public HomePage(WebDriver driver) {
		super(driver);
		webElement = new WebElements(driver);
	}
	
	//Page locator
	By headerTitle = By.xpath("//div/span");
	By username = By.cssSelector("");
	By logOut = By.cssSelector("");
	
	//Page actions/methods
	public Boolean homeHeaderTitle() {
		return webElement.waitForElementBoolean(headerTitle, "", 60, 2);
	}
	
	public Boolean getUsername() {
		webElement.waitForElementString(username,"", 60, 2);
		return true;
	}
	
	public Boolean logOut() {
		webElement.click(logOut);
		return true;
	}
}

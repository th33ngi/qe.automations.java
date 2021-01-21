package com.automation.qe.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automation.qe.base.BasePage;
import com.automation.qe.utility.WebElements;

public class LoginPage extends BasePage{
	WebElements webElement;

	public LoginPage(WebDriver driver) {
		super(driver);
		webElement = new WebElements(driver);
	}
	
	//Page locator
	private By username = By.id("identifierId");
	private By password = By.name("password");
	private By loginBtn = By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]");
	
	public Boolean loginHeaderTitle() {
		webElement.getPageTitle();
		return true;
	}
	
	public HomePage doLogin(String user, String pwd) {
		webElement.sendKeys(username, user);
		webElement.click(loginBtn);
		webElement.sendKeys(password, pwd);
		return new HomePage(driver);
	}
}

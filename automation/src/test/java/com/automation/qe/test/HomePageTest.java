package com.automation.qe.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.qe.base.BaseTest;
import com.automation.qe.jira.JiraPolicy;
import com.automation.qe.page.HomePage;

public class HomePageTest extends BaseTest {
	
	@JiraPolicy(logTicketReady=true)
	@Test(priority=3, enabled=true)
	public void verifyIfUsernameExist() {
		Boolean actualResult = page.getInstance(HomePage.class).getUsername();
		System.out.println("Was the Username Found ?: "+actualResult);
		Assert.assertTrue(actualResult, "");
	}
	
	@JiraPolicy(logTicketReady=true)
	@Test(priority=4, enabled=true)
	public void doLogOut() {
		Boolean actualResult = page.getInstance(HomePage.class).logOut();
		System.out.println("Has the system logged out ?: "+actualResult);
		Assert.assertTrue(actualResult);
	}
}

package com.automation.qe.utility;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class OptionsManager {
	Properties prop;
	ChromeOptions chromeOptions;
	FirefoxOptions firefoxOptions;
	
	public OptionsManager(Properties prop) {
		this.prop = prop;
	}
	
	public ChromeOptions getChromeOptions() {
		chromeOptions = new ChromeOptions();
		if(Boolean.parseBoolean(prop.getProperty("incognito"))) {
			chromeOptions.addArguments("--incognito");
		}
		return chromeOptions;
	}
	
	public FirefoxOptions getFirefoxOptions() {
		firefoxOptions = new FirefoxOptions();
		if(Boolean.parseBoolean(prop.getProperty("incognito"))) {
			firefoxOptions.addArguments("-private");
		}
		return firefoxOptions;
	}
}

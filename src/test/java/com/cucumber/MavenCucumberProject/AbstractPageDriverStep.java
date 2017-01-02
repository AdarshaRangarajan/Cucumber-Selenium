package com.cucumber.MavenCucumberProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbstractPageDriverStep {

	static WebDriver driver = null;

	public static WebDriver getDriver() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\Chrome\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;

	}

}

package com.cucumber.MavenCucumberProject.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TitleverifyPage extends BasePage{
	
	WebDriver driver;
	
	public TitleverifyPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void navigateToLink(String link) throws Throwable {
		
		driver.findElement(By.id(link)).click();
	}
	
	public String checkPageTitle() throws Throwable {
		return driver.getTitle();
		
	}

	

}

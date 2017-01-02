package com.cucumber.MavenCucumberProject.PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;

public class FeedbackConfirmPage extends BasePage {

	WebDriver driver;

	public FeedbackConfirmPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void NavigateToZerobankWebsite() throws Throwable {
		driver.navigate().to("http://zero.webappsecurity.com/");
	}
	
	public void clickOnFeedbackLink() throws Throwable {
		driver.findElement(By.id("feedback")).click();
	}
	
	public void FillFeedbackForm(List<List<String>> data) throws Throwable {
	

		driver.findElement(By.id("name")).sendKeys(data.get(1).get(1));
		driver.findElement(By.id("email")).sendKeys(data.get(2).get(1));
		driver.findElement(By.id("subject")).sendKeys(data.get(3).get(1));
		driver.findElement(By.id("comment")).sendKeys(data.get(4).get(1));
		driver.findElement(By.name("submit")).click();
		
	}

}

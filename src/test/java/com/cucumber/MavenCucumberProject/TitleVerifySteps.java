package com.cucumber.MavenCucumberProject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.cucumber.MavenCucumberProject.PageObject.TitleverifyPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TitleVerifySteps extends AbstractPageDriverStep {

	WebDriver driver = null;

	@Before
	public void testStartUp() {
		driver = super.getDriver();

		System.out.println("Before method executed, Opening your browser!!");
	}

	@After
	public void testShutDown() {
		if (driver != null)
			driver.quit();
		super.driver = null;

		System.out.println("After method executed, closing your browser!!!!!");
	}

	@When("^I navigate to \"([^\"]*)\"$")
	public void shouldnavigateToLink(String link) throws Throwable {
		TitleverifyPage titleverifyPage = new TitleverifyPage(driver);
		titleverifyPage.navigateToLink(link);

	}

	@Then("^I check page title is \"([^\"]*)\"$")
	public void shouldcheckPageTitle(String title) throws Throwable {
		TitleverifyPage titleverifyPage = new TitleverifyPage(driver);
		titleverifyPage.checkPageTitle();

		Assert.assertEquals(titleverifyPage.checkPageTitle(), title);
	}

}

package com.cucumber.MavenCucumberProject;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.MavenCucumberProject.PageObject.FeedbackConfirmPage;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FeedbackConfirmSteps extends AbstractPageDriverStep{

	WebDriver driver = null;

	@Before
	public void testStartUp() {
		driver = super.getDriver();
		
		System.out.println("Before method executed, Opening your browser!!");
	}

	@After
	public void testShutDown() {
		if (driver!=null)
			driver.quit();
		super.driver = null;
		
		System.out.println("After method executed, closing your browser!!!!!");
	}

	@Given("^I navigated to the zero bank website$")
	public void shouldNavigatetoZeroBankWebsite() throws Throwable {
		FeedbackConfirmPage feedbackConfirmPage = new FeedbackConfirmPage(driver);
		feedbackConfirmPage.NavigateToZerobankWebsite();

	}

	@When("^I click on the feedback link$")
	public void shouldClickOnFeedbacklink() throws Throwable {
		FeedbackConfirmPage feedbackConfirmPage = new FeedbackConfirmPage(driver);
		feedbackConfirmPage.clickOnFeedbackLink();

	}

	@And("^populate the feedback form$")
	public void shouldPopulateFeedbackForm(DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		FeedbackConfirmPage feedbackConfirmPage = new FeedbackConfirmPage(driver);
		feedbackConfirmPage.FillFeedbackForm(data);

	}

	@Then("^comfirmation page should appear$")
	public void shouldDisplayConfirmationPage() throws Throwable {
		Assert.assertTrue(driver.getPageSource().contains(
				"They will be reviewed by our Customer Service staff and given the full attention that they deserve"));

	}

	
}

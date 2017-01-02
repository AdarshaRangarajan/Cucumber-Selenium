package com.cucumber.MavenCucumberProject;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty", "html:target/TestResults/html/FeedbackConfirmFeature", "json:target/TestResults/json/FeedbackConfirmFeature"},
		features = {"src/test/resource"})
public class FeedbackRunnerTest {

}

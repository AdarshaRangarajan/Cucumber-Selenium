package com.cucumber.MavenCucumberProject;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"html:target/TestResults/html/TitleVerifyFeature", "json:target/TestResults/json/TitleVerifyFeature"},
		features = {"src/test/resource"})

public class TitleVerifyRunnerTest {

}

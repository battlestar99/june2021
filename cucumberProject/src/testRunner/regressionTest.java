package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/Features"},
		glue = {"stepDef"},
		plugin= {"pretty","html:target/cucumber-reports"}
		
		
		)

public class regressionTest {

}

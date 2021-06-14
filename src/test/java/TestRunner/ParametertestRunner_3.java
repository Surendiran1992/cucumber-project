package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		plugin = { "pretty", 
				"html:target/cucumber-reports/cucumber.html",
				"json:target/cucumber-reports/cucumber.json",
				"html:target/site/cucumber-pretty",
		        "rerun:target/rerun.txt",
		        "json:target/cucumber1.json"},
		monochrome =true,
		features = "src\\test\\java\\Feature\\Parameter.feature",
		glue = { "stepDefinitions" }
		// tags = "@regression"
		)

public class ParametertestRunner_3 extends AbstractTestNGCucumberTests {

}
package TestRunner;
//Just change the tags to run difeerent stepdefinitions file
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
		features = "src\\test\\java\\Feature",
		glue = { "stepDefinitions" },
		tags = "@dataTable and @Withoutheader",  //runs only @withoutheader in @dataTable feature
		//tags ="@dataTable and not @WithExamples", //runs @dataTable feature except @With Examples
		//tags = "@dataTable or @Google",         //this will run datatable and google feature tags
		//tags = "@dataTable",                    //runs only the @dataTable feature
		//tags ="@Google or @dataTable and not @WithExamples",   //runs google and datatable feature except @withExample tag in @datatable feature
		dryRun=true
		//strict = true
		)

public class DataTableRunner extends AbstractTestNGCucumberTests {

}
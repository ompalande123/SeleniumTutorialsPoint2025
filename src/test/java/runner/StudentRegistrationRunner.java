package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", glue = "stepDefinitions", plugin = { "pretty",
		"html:target/cucumber-reports", "rerun:target/rerun.txt" }, tags = "@Student1")

public class StudentRegistrationRunner extends AbstractTestNGCucumberTests {

}

//to run
// mvn test -Dtest=StudentRegistrationRunner
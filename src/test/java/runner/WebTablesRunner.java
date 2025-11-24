package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/resources/features",
		glue="stepDefinitions",
		plugin= {"pretty","html:target/cucumber-reports","rerun:target/rerun.txt"},
		tags="@Access_table_values_1"
		
		
		)




public class WebTablesRunner extends AbstractTestNGCucumberTests {

}

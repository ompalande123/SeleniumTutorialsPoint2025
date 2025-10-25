package runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features="src/test/resources/features",
		glue="stepDefinitions",
		plugin= {"pretty","html:target/cucumber-reports","rerun:target/rerun.txt"},
		tags="@ReadAllfromExcel"
		
		)
@Test
public class TestRunner extends AbstractTestNGCucumberTests {

}

package runner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features="src/test/resources/features",
		glue="stepDefinitions",
		plugin= {"pretty","html:target/cucumber-reports","rerun:target/rerun.txt"},
		tags="@CheckBox1 or @smoke"
		)
@Test
public class TestRunner extends AbstractTestNGCucumberTests {
	
	//For parallel execution of scenarios
	 @Override
	 @DataProvider(parallel=true) public Object[][] scenarios(){ return
	 super.scenarios(); }
	 

}

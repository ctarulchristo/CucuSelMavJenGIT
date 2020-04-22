package ctac.cucuOptions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/ctac/featureFiles", glue = "ctac.stepDefinition", monochrome = true, strict = true,
		// dryRun=true,
		plugin = { "pretty", "html:target/cucumber", "json:target/cucumber.json", "junit:target/cukes.xml" })

public class Runner extends AbstractTestNGCucumberTests {
	// to call needed methods from testgn when triggered via maven

}

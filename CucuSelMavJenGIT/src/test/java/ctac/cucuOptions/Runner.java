package ctac.cucuOptions;
/* Commetns */
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = "src/test/java/ctac/featureFiles",
			glue="stepDefinitions",
			monochrome=true,
			strict=true,
			dryRun=true,
			plugin= {"pretty","json:target/cucumber.json"})
public class Runner {
	

}

package wiki.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = {"Features/"},
		glue = {"wiki.stepdef", "wiki.hooks"},
		plugin = {"pretty"},
		dryRun = false,
		monochrome = true
)

//MUST be extended to "AbstractTestNGCucumberTests" from io.cucumber
public class Wikipedia_FeatureRunner extends AbstractTestNGCucumberTests
{

}
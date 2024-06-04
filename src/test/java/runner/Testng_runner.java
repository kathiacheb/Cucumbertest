package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
			features = {"D:\\eclipse workspaces\\Cucumbertest\\src\\main\\ressources\\Features\\search.feature"},
			glue="step_definition",
			plugin= {
					"pretty",
					"html:D:\\eclipse workspaces\\Cucumbertest\\target\\htmlReport.html",
					"json:D:\\eclipse workspaces\\Cucumbertest\\target\\jsonReport.json",
			},
			monochrome= false,
			dryRun = false
		
		)
public class Testng_runner extends AbstractTestNGCucumberTests{

	
}

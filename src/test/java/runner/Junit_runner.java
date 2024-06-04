package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
	features = {"D:\\eclipse workspaces\\Cucumbertest\\src\\main\\ressources\\Features\\search.feature"},
	glue= "step_definition"	
	
	
)

public class Junit_runner {

}

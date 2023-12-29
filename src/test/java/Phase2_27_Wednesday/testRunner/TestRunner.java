package Phase2_27_Wednesday.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resource/Features", 
	glue = {"Phase2_27_Wednesday/stepDefinitions"})
public class TestRunner {
	
}
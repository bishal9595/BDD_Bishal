package stepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/lesson5"},glue= {"stepDefinition"},tags= {"@SmokeTest"})
public class TestRunner {

}

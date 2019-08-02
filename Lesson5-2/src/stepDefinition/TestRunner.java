package stepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/lesson52"},glue= {"stepDefinition"},tags= {"@End2End"})
public class TestRunner {

}

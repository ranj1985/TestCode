package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\BDD\\src\\test\\resources\\Features\\SwagLabLogin.feature", 
glue= {"StepesDefination"},
plugin = {"pretty","html:target/cucumberjson"})

public class SwagTestRunner {
	
	
}

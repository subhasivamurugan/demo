package runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true,features="features//tag.feature",glue=("stepdef"),plugin=("html:target/cucumber.html"),tags= {"@Smoke"})

public class testrunner {
	

}

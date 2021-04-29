package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
			features="src/test/java/Feature",
			glue= {"StepDefination","utilities"},
			//tags= {"@Upskill1,@Upskill2"},// or executtion
			//tags= {"@Upskill1","@Upskill2"}, // and executtion
			dryRun=false,
			monochrome=true,
			plugin= {"pretty","html:target/htmlReport","json:target/jsonReport","junit:target/junitReport"}
		
		)
public class TestRunner {

}

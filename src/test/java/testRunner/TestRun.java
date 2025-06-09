package testRunner;



import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
       (
		features=
				    ".//src/test/resources/features/createAccount.feature",
		
		
		glue="stepDefinations",
		dryRun=false,
		monochrome = false,
		plugin= {"pretty",
				"html:test-output"
				
		}
		
		
		)


public class TestRun {

}

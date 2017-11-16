package zipongo.qa.automation.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by halleyshort on 3/18/16.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        format={"pretty", "html:target/cucumber-html/smoke", "json:target/cucumber-json-report.json"},
        glue={"zipongo.qa.automation"},
        features={"src/main/resources/features"},
        tags={"@smoke"}
)
public class SmokeRunner {
}

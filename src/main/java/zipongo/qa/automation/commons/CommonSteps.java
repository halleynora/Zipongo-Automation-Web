package zipongo.qa.automation.commons;

import ch.qos.logback.classic.Logger;
import com.zipongo.qa.selenium.commons.BrowserDriver;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import zipongo.qa.automation.util.DataProvider;
import zipongo.qa.automation.util.SpringContextConfiguration;

import java.time.ZoneId;
import java.util.Date;
import java.util.stream.Collectors;

public class CommonSteps extends SpringContextConfiguration {
    private static final Logger log = (Logger) LoggerFactory.getLogger(CommonSteps.class);


    @Autowired
    DataProvider dataProvider;

    @Autowired
    CommonActions commonActions;



    private boolean closeBrowser = true;

    @Before
    public void startScenario(Scenario scenario) {
        commonActions.setScenario(scenario);
    }

    @After
    public void endScenario(Scenario scenario) {
        String scenario_status = scenario.getStatus();

        //Take screenshot and show browser logs
        if (!scenario_status.equals("passed")
                && !scenario_status.equals("skipped"))
        {
            String currentTime = new Date().toInstant()
                                .atZone(ZoneId.of("America/Los_Angeles"))
                                .toString();

            scenario.write("\nLast Screenshot ("+currentTime+"):\n");
            BrowserDriver.screenShot("Failed Scenario");

            scenario.write("\nBrowser Logs:\n");
            scenario.write(getBrowserLogs());
        }

        if (closeBrowser)
            BrowserDriver.close();


        log.info("Finish the scenario: " + scenario.getName());
//
//        String serverInfo = "\nServer info: \n" + getServerInfo();
//        scenario.write(serverInfo);
////        scenario.write("Email Address: " + newUser.getNewUserEmailAddress() + "/ " + newUser.getNewUserPassword());
//        log.info(serverInfo);


    }


    /**
     * Retrieves the list of browser logs and collects them into a string
     * separated with end of line characters
     */
    private String getBrowserLogs()
    {
        return BrowserDriver.getBrowserLogs()
                .stream().collect(Collectors.joining("\n"));
    }

    private String getServerInfo()
    {
        return RestAssured
                .given().relaxedHTTPSValidation()
                .get(dataProvider.getTrialURL()+"/release.txt")
                .prettyPrint();
    }

    @When("^Zipongo trial page is loaded$")
    public void zipongoTrialPageIsLoaded(){
        commonActions.loadSite("");
    }


    @Then("^logout$")
    public void logout() {
        commonActions.logout();
    }
}
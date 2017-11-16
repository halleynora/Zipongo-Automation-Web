package zipongo.qa.automation.account;

import ch.qos.logback.classic.Logger;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import zipongo.qa.automation.commons.CommonActions;
import zipongo.qa.automation.dto.RandomId;
import zipongo.qa.automation.util.SpringContextConfiguration;

public class AccountSteps extends SpringContextConfiguration {
    private static final Logger log = (Logger) LoggerFactory.getLogger(AccountSteps.class);

    @Autowired
    AccountActions accountActions;

    @Autowired
    CommonActions commonActions;

    @Autowired
    RandomId randomId;


    @Then("^log in with Hank McCoy demo account$")
    public void logInWithHankMcCoyDemoAccount() {
        accountActions.logInHankMcCoyTrialAccount();
    }


    @And("^click Log in Here! link$")
    public void clickLogInHereLink() {
        accountActions.clickLogInHereLinkLocator();
    }

    @Then("^log in with Angela Bower demo account$")
    public void logInWithAngelaBowerDemoAccount() {
        accountActions.loginAngelaBowerTrialAccount();
    }
}


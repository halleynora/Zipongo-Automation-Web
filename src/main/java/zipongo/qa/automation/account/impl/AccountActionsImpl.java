package zipongo.qa.automation.account.impl;

import org.springframework.beans.factory.annotation.Autowired;
import zipongo.qa.automation.account.AccountActions;
import zipongo.qa.automation.commons.CommonActions;
import zipongo.qa.automation.util.DataProvider;
import com.zipongo.qa.selenium.commons.BrowserDriver;

import java.util.logging.Logger;


public class AccountActionsImpl implements AccountActions {
    private Logger log = Logger.getLogger(AccountActionsImpl.class.getName());

    @Autowired
    DataProvider dataProvider;

    @Autowired
    CommonActions commonActions;

    @Override
    public void logInHankMcCoyTrialAccount() {
        BrowserDriver.type(emailAddressLocator,dataProvider.getEmailAddress1());
        BrowserDriver.type(passwordLocator,dataProvider.getPassword1());
        BrowserDriver.click(logInButtonLocator);
        BrowserDriver.wait(3000);
        BrowserDriver.screenShot("logged in Hank McCoy");
    }


    @Override
    public void loginAngelaBowerTrialAccount() {
        BrowserDriver.type(emailAddressLocator,dataProvider.getEmailAddress2());
        BrowserDriver.type(passwordLocator,dataProvider.getPassword2());
        BrowserDriver.click(logInButtonLocator);
        BrowserDriver.wait(3000);
        BrowserDriver.screenShot("logged in Angela Bower");
    }

    @Override
    public void clickLogInHereLinkLocator() {
        BrowserDriver.click(logInHereLink);
    }
}

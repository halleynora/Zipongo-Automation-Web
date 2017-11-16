package zipongo.qa.automation.account;

import org.openqa.selenium.By;

public interface AccountActions {

    By logInHereLink = By.cssSelector(".signup-login-switch-link");
    By emailAddressLocator = By.cssSelector(".no-bottom-margin");
    By passwordLocator = By.cssSelector(".no-margins");
    By logInButtonLocator = By.cssSelector(".z-button");

    void logInHankMcCoyTrialAccount();

    void clickLogInHereLinkLocator();

    void loginAngelaBowerTrialAccount();
}

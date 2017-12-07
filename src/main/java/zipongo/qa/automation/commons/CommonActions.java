package zipongo.qa.automation.commons;

import cucumber.api.Scenario;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;


public interface CommonActions {


    By profileSubMenuLocator = By.cssSelector(".has-dropdown");
    By logoutLocator = By.cssSelector(".dropdown > li:nth-child(4) > a:nth-child(1)");



    void loadSite(String... trialURL);

    void openNewBrowserTab();

    void switchBrowserTab();

    void refreshPage();

    void setScenario(Scenario scenario);

    void closeBrowswer();

    void clickBackButtonOnBrowser();

    void closeAnyAlertWindowsOpen();

    void navigateTo(String navigateTo);

    <T> List<T> getNotMatching(List<T> listA, List<T> listB);

    <T> Optional<T> queryObject(Supplier<T> f);

    void clearAllCookies();

    void logout();

    List<String> parseList(String topNavigationList);
}

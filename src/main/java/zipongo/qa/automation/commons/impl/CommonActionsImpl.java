package zipongo.qa.automation.commons.impl;

import com.zipongo.qa.selenium.commons.BrowserDriver;
import cucumber.api.Scenario;
import org.openqa.selenium.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import zipongo.qa.automation.commons.CommonActions;
import zipongo.qa.automation.util.DataProvider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommonActionsImpl implements CommonActions {
    private Logger log = Logger.getLogger(CommonActionsImpl.class.getName());

    @Autowired
    DataProvider dataProvider;



    public void loadSite(String... trailSite) {
        String finalURL = trailSite.length>0
                ?  dataProvider.getTrialURL()+"/"+trailSite[0]
                : dataProvider.getTrialURL();

        log.info("Zipongo URL: " + finalURL);
        BrowserDriver.loadPage(finalURL);
        BrowserDriver.wait(5000);

        BrowserDriver.getCurrentDriver().manage().window().setPosition(new Point(0, 0));
        BrowserDriver.getCurrentDriver().manage().window().setSize(new Dimension(1440, 900));
        log.info(BrowserDriver.getCapabilities());

    }

    @Override
    public void logout() {
        BrowserDriver.wait(2000);
        BrowserDriver.click(profileSubMenuLocator);
        BrowserDriver.click(logoutLocator);
    }

    public void openNewBrowserTab() {
        BrowserDriver.getCurrentDriver().findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
        ArrayList<String> tabs = new ArrayList<> (BrowserDriver.getWindowHandles());
        BrowserDriver.switchToFrame(tabs.get(0));

    }

    public void switchBrowserTab() {
        String currentHandle = BrowserDriver.getCurrentDriver().getWindowHandle();
        ArrayList<String> tabs = new ArrayList<> (BrowserDriver.getWindowHandles());

        tabs.stream().filter(tab->!tab.equals(currentHandle)).findFirst()
            .ifPresent(tab->BrowserDriver.switchToFrame(tab));
    }


    public void refreshPage() {
        if (!dataProvider.getBrowser().equalsIgnoreCase("safari"))
            BrowserDriver.refresh();
    }


    public void embedScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            scenario.write(BrowserDriver.getCurrentDriver().getCurrentUrl());
            BrowserDriver.screenShot("failed scenario: " + scenario);
        }
    }

    public void setScenario(Scenario scenario) {
        if (scenario != null) {
            log.info("Link cucumber scenario to selenium - " + scenario.getName());
            BrowserDriver.setScenario(scenario);
        } else {
            log.info("Scenario is null");
        }
    }

    @Override
    public void closeBrowswer() {
        BrowserDriver.getCurrentDriver().close();
    }

    @Override
    public void clickBackButtonOnBrowser() {
        BrowserDriver.getCurrentDriver().navigate().back();
    }

    @Override
    public void closeAnyAlertWindowsOpen() {
        try {
            Alert alert = BrowserDriver.getCurrentDriver().switchTo().alert();
            if (alert != null)
                alert.accept();
        } catch (Exception ex) {
            log.warning("Could not close alert: " + ex.getMessage());
        }
    }



    @Override
    public void navigateTo(String navigateTo) {
        log.info("navigate to: " + navigateTo);
        BrowserDriver.loadPage(navigateTo);
    }



    /**
     * Returns the inner html of the web element as a string<br>
     * The string is trimmed and all spaces removed
     *
     * @param elem WebElement where the html will come from
     * @return A string of the inner html of the web element
     */
    public String getInnerHTML(WebElement elem)
    {
        return Arrays.stream(elem.getAttribute("innerHTML").trim().split(" "))
                .filter(x->!x.equals(""))
                .reduce((x,y)->x+y)
                .orElseThrow(()->new NotFoundException("Empty inner html"));
    }


    /**
     * Returns a list of elements that do not belong to both listA and listB
     * @param listA List of elements
     * @param listB List of elements
     * @param <T> Type of the list of elements
     * @return List of elements that don't belong to both lists
     */
    public <T> List<T> getNotMatching(List<T> listA, List<T> listB)
    {
        List<T> bothLists =
                Stream.concat(listA.stream(),
                        listB.stream())
                        .distinct().collect(Collectors.toList());

        Stream<T> streamA =
                bothLists.stream()
                        .filter(x->!listA.contains(x));

        Stream<T> streamB =
                bothLists.stream()
                        .filter(x->!listB.contains(x));

        return Stream.concat(streamA,streamB).collect(Collectors.toList());

    }


    public void clearAllCookies()
    {
        BrowserDriver.clearAllCookies();
    }


//    /**
//     * Helper function that returns the result of the query.
//     * If query returns no result (throws exception), return Optional.empty
//     * @param f Supplier function that invokes the query
//     * @return The Optional<query result> or Optional.empty if nothing returned
//     */
    public <T> Optional<T> queryObject(Supplier<T> f)
    {
        try
        {
            return Optional.of(f.get());
        }
        catch(IncorrectResultSizeDataAccessException e)
        {
            return Optional.empty();
        }
    }

    @Override
    public List<String> parseList(String strList) {
        return Stream.of(strList.split(","))
                .map (elem -> new String(elem))
                .collect(Collectors.toList());
    }
}

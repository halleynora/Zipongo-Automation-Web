package zipongo.qa.automation.dashboard.impl;

import com.zipongo.qa.selenium.commons.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;
import zipongo.qa.automation.commons.CommonActions;
import zipongo.qa.automation.dashboard.DashboardActions;

import java.util.List;

public class DashboardActionsImpl implements DashboardActions {

    @Autowired
    CommonActions commonActions;


    @Override
    public void verifyZipongoLogoLInkClickable() {
        BrowserDriver.click(zipongoLogoLocator);
        Assert.assertTrue(BrowserDriver.getCurrentURL().equalsIgnoreCase("https://zipongo.com/home"));
    }

    @Override
    public void verifyAcmeLogoClickable() {
        BrowserDriver.click(acmeLogoLocator);
        Assert.assertTrue(BrowserDriver.getCurrentURL().equalsIgnoreCase("https://zipongo.com/home"));
    }

    @Override
    public void verifyHomeLinkClickable() {
        BrowserDriver.click(homeLinkLocator);
        Assert.assertTrue(BrowserDriver.getCurrentURL().equalsIgnoreCase("https://zipongo.com/home"));
    }

    @Override
    public void verifyCookItNowLinkClickable() {
        BrowserDriver.click(cookItNowLinkLocator);
        Assert.assertTrue(BrowserDriver.getCurrentURL().equalsIgnoreCase("https://zipongo.com/cookitnow"));
    }

    @Override
    public void verifyRecipeslinkClickable() {
        BrowserDriver.click(recipesLinkLocator);
        Assert.assertTrue(BrowserDriver.getCurrentURL().equalsIgnoreCase("https://zipongo.com/recipes/home"));
    }

    @Override
    public void verifyMyCafeLinkClickable() {
        BrowserDriver.click(myCafeLinkLocator);
        Assert.assertTrue(BrowserDriver.getCurrentURL().equalsIgnoreCase("https://zipongo.com/my-cafe"));
    }

    @Override
    public void verifyMyProfileLInkClickable() {
        BrowserDriver.click(myProfileLinkLocator);
        Assert.assertTrue(BrowserDriver.getCurrentURL().equalsIgnoreCase("https://zipongo.com/dashboard"));
    }

    @Override
    public void verifyRewardsLinkClickable() {
        BrowserDriver.click(rewardsLinkLocator);
        Assert.assertTrue(BrowserDriver.getCurrentURL().equalsIgnoreCase("https://zipongo.com/rewards"));
    }

    @Override
    public void verifyGroceryListButtonClickable() {
        BrowserDriver.click(groceryLinkLocator);
        Assert.assertTrue(BrowserDriver.isElementVisible(addItemmToGroceryListTextBoxLocator));
    }

    @Override
    public void verifyWhatsForLunchPod() {
        BrowserDriver.click(whatsForLunchPod);
        Assert.assertTrue(BrowserDriver.getCurrentURL().equalsIgnoreCase("https://zipongo.com/my-cafe"));
        BrowserDriver.getCurrentDriver().navigate().back();
    }

    @Override
    public void verify23AndMePod() {

        if(BrowserDriver.isElementVisible(twentyThreeAndMePod)) {
            BrowserDriver.click(twentyThreeAndMePod);
        }else if (BrowserDriver.isElementVisible(connectTwentyThreeAndMePod)) {
            BrowserDriver.click(connectTwentyThreeAndMePod);
        }
        Assert.assertTrue(BrowserDriver.getCurrentURL().equalsIgnoreCase("https://zipongo.com/connections/twentythree"));
        BrowserDriver.getCurrentDriver().navigate().back();
        BrowserDriver.wait(3000);

    }

    @Override
    public void verifyAddYourBiometricsPod() {
        BrowserDriver.click(addYourBiometricsPod);
        Assert.assertTrue(BrowserDriver.getCurrentURL().equalsIgnoreCase("https://zipongo.com/dashboard"));
        BrowserDriver.getCurrentDriver().navigate().back();
    }

    @Override
    public void verifyDiscoverNewRecipesPod() {
        BrowserDriver.click(discoverNewRecipesPod);
        Assert.assertTrue(BrowserDriver.getCurrentURL().equalsIgnoreCase("https://zipongo.com/recipes/home"));
        BrowserDriver.getCurrentDriver().navigate().back();
        BrowserDriver.wait(3000);
    }

    @Override
    public void verifyViewBreakfastRecipesPod() {
        BrowserDriver.click(viewBreakfastRecipesPod);
        Assert.assertTrue(BrowserDriver.getCurrentURL().equalsIgnoreCase("https://zipongo.com/recipes/category/breakfast"));
        BrowserDriver.getCurrentDriver().navigate().back();
        BrowserDriver.wait(3000);

    }

    @Override
    public void verifyViewThisRecipeOnLunchPod() {
        BrowserDriver.click(viewThisRecipeLunchPod);
        Assert.assertTrue(BrowserDriver.getCurrentURL().equalsIgnoreCase("https://zipongo.com/my-cafe"));
        BrowserDriver.getCurrentDriver().navigate().back();
        BrowserDriver.wait(3000);

    }

    @Override
    public void verifyViewThisRecipeOnDinnerPod() {
        BrowserDriver.click(viewThisRecipeDinnerPod);
        Assert.assertTrue(BrowserDriver.getCurrentURL().contains("https://zipongo.com/recipes/"));
        BrowserDriver.getCurrentDriver().navigate().back();
        BrowserDriver.wait(3000);
        BrowserDriver.scrollIntoView(profileSubMenuLocator);
    }

    @Override
    public void verifyProfileLinkTopPage() {
        BrowserDriver.click(profileLinkTopPageLocator);
        Assert.assertTrue(BrowserDriver.getCurrentURL().equalsIgnoreCase("https://zipongo.com/dashboard"));
        BrowserDriver.getCurrentDriver().navigate().back();
    }
}

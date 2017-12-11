package zipongo.qa.automation.dashboard;

import org.openqa.selenium.By;

public interface DashboardActions {
    By profileSubMenuLocator = By.cssSelector(".has-dropdown");
    By zipongoLogoLocator = By.xpath("//div[@class='header-group']/div/div/nav/ul/div/span/li[1]/a/img");
    By acmeLogoLocator = By.xpath("//div[@class='header-group']/div/div/nav/ul/div/span/li[2]/a/img");
    By homeLinkLocator = By.xpath("//ul[@class='right']//span[.='Home']");
    By cookItNowLinkLocator = By.xpath("//ul[@class='right']//span[.='CookItNow']");
    By recipesLinkLocator = By.xpath("//ul[@class='right']//span[.='Recipes']");
    By myCafeLinkLocator = By.xpath("//ul[@class='right']//span[.='MyCafé']");
    By myProfileLinkLocator = By.xpath("//ul[@class='right']//span[.='My Profile']");
    By rewardsLinkLocator = By.xpath("//ul[@class='right']//span[.='Rewards']");
    By groceryLinkLocator = By.xpath("//div[@class='header-group']/div/div/button");
    By addItemmToGroceryListTextBoxLocator = By.id("add-an-item");
    By whatsForLunchPod = By.cssSelector("div.dash-tools");
    By twentyThreeAndMePod = By.xpath("//div[@class='dash-tools-wrapper']//div[.='See Your 23andMe Results']");
    By connectTwentyThreeAndMePod = By.xpath("//div[@class='dash-tools-wrapper']//div[.='Connect to 23andMe']");

    By addYourBiometricsPod = By.xpath("//div[@class='dash-tools-wrapper']//div[.='Add your Biometrics']");
    By discoverNewRecipesPod = By.xpath("//div[@class='dash-tools-wrapper']//div[.='Discover New Recipes']");
    By viewBreakfastRecipesPod = By.linkText("VIEW BREAKFAST RECIPESrecipes");
    By viewThisRecipeLunchPod = By.xpath("//div[@class='full-width']//button[.='VIEW YOUR CAFE']");
    By viewThisRecipeDinnerPod = By.xpath("//div[@class='full-width']//button[.='VIEW THIS RECIPE']");

    By profileLinkTopPageLocator = By.linkText("profiledashboard");

    void verifyZipongoLogoLInkClickable();

    void verifyAcmeLogoClickable();

    void verifyHomeLinkClickable();

    void verifyCookItNowLinkClickable();

    void verifyRecipeslinkClickable();

    void verifyMyCafeLinkClickable();

    void verifyMyProfileLInkClickable();

    void verifyRewardsLinkClickable();

    void verifyGroceryListButtonClickable();

    void verifyWhatsForLunchPod();

    void verify23AndMePod();

    void verifyAddYourBiometricsPod();

    void verifyDiscoverNewRecipesPod();

    void verifyViewBreakfastRecipesPod();

    void verifyViewThisRecipeOnLunchPod();

    void verifyViewThisRecipeOnDinnerPod();

    void verifyProfileLinkTopPage();
}

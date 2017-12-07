package zipongo.qa.automation.dashboard;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;
import zipongo.qa.automation.commons.CommonActions;
import zipongo.qa.automation.util.SpringContextConfiguration;

import java.util.logging.Logger;

public class DashboardSteps extends SpringContextConfiguration {
    private Logger log = Logger.getLogger(DashboardSteps.class.getName());

    @Autowired
    DashboardActions dashboardActions;

    @Autowired
    CommonActions commonActions;




    @Then("^verify Zipongo logo is clickable$")
    public void verifyZipongoLogoIsClickable() {
        dashboardActions.verifyZipongoLogoLInkClickable();
    }

    @Then("^verify Acme Inc logo is clickable$")
    public void verifyAcmeIncLogoIsClickable() {
        dashboardActions.verifyAcmeLogoClickable();
    }

    @Then("^verify Home link is clickable$")
    public void verifyHomeLinkIsClickable() {
        dashboardActions.verifyHomeLinkClickable();
    }

    @Then("^verify CookItNow link is clickable$")
    public void verifyCookItNowLinkIsClickable() {
        dashboardActions.verifyCookItNowLinkClickable();
    }

    @Then("^verify Recipes link is clickable$")
    public void verifyRecipesLinkIsClickable() {
        dashboardActions.verifyRecipeslinkClickable();
    }

    @Then("^verify MyCafe link is clickable$")
    public void verifyMyCafeLinkIsClickable() {
        dashboardActions.verifyMyCafeLinkClickable();
    }

    @Then("^verify My Profile link is clickable$")
    public void verifyMyProfileLinkIsClickable() {
        dashboardActions.verifyMyProfileLInkClickable();
    }

    @Then("^verify Rewards link is clickable$")
    public void verifyRewardsLinkIsClickable() {
        dashboardActions.verifyRewardsLinkClickable();
    }

    @Then("^verify GroceryLIst button is clickable$")
    public void verifyGroceryLIstButtonIsClickable() {
        dashboardActions.verifyGroceryListButtonClickable();
    }

    @Then("^verify Whats for Lunch pod$")
    public void verifyWhatsForLunchPod() {
        dashboardActions.verifyWhatsForLunchPod();
    }

    @Then("^verify See Your 23andMe Results pod$")
    public void verifySeeYourAndMeResultsPod() {
        dashboardActions.verify23AndMePod();
    }

    @Then("^verify Add your Biometrics pod$")
    public void verifyAddYourBiometricsPod() {
        dashboardActions.verifyAddYourBiometricsPod();
    }

    @Then("^verify Discover new Recipes pod$")
    public void verifyDiscoverNewRecipesPod() {
        dashboardActions.verifyDiscoverNewRecipesPod();
    }

    @Then("^verify View Breakfast Recipes pod$")
    public void verifyViewBreakfastRecipesPod() {
        dashboardActions.verifyViewBreakfastRecipesPod();
    }

    @Then("^verify View This Recipe on lunch pod$")
    public void verifyViewThisRecipeOnLunchPod() {
        dashboardActions.verifyViewThisRecipeOnLunchPod();
    }

    @Then("^verify VIew This Recipe on dinner pod$")
    public void verifyVIewThisRecipeOnDinnerPod() {
        dashboardActions.verifyViewThisRecipeOnDinnerPod();
    }
}

package zipongo.qa.automation.util;

/**
 * Created by halley.short.
 * DataProvider is used to store the entries from driver.properties so that all objects
 * can access this data
 */

public class DataProvider{

    private static final Integer SHORT_WAIT = 3;
    private static final Integer MEDIUM_WAIT = 6;
    private static final Integer LONG_WAIT = 10;

    private String browser;

    private String pathToChrome;

    private String whereToRun;

    private String browserName;

    private String trialURL;

    private String emailAddress1;

    private String password1;

    private String emailAddress2;

    private String password2;


    public String getEmailAddress2() {
        return emailAddress2;
    }

    public void setEmailAddress2(String emailAddress2) {
        this.emailAddress2 = emailAddress2;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public static Integer getShortWait() {
        return SHORT_WAIT;
    }

    public static Integer getMediumWait() {
        return MEDIUM_WAIT;
    }

    public static Integer getLongWait() {
        return LONG_WAIT;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getTrialURL() {
        return trialURL;
    }

    public void setTrialURL(String trialURL) {
        this.trialURL = trialURL;
    }

    public String getEmailAddress1() {
        return emailAddress1;
    }

    public void setEmailAddress1(String emailAddress1) {
        this.emailAddress1 = emailAddress1;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getPathToChrome() {
        return pathToChrome;}

    public void setPathToChrome(String pathToChrome) {
        this.pathToChrome = pathToChrome;
    }

    public String getWhereToRun() {
        return whereToRun;
    }

    public void setWhereToRun(String whereToRun) {
        this.whereToRun = whereToRun;
    }

    public String getBrowserName() {
        return browserName;
    }

    public void setBrowserName(String browserName) {
        this.browserName = browserName;
    }
}


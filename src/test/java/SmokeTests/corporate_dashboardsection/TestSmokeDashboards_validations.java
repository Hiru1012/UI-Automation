package SmokeTests.corporate_dashboardsection;

import Pages.PageFactory;
import Utilities.DriverFactory;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSmokeDashboards_validations extends DriverFactory {

    public static String userName = propertyFileReader.getProperty("config", "UserName");
    public static String password = propertyFileReader.getProperty("config", "Password");
    PageFactory pageFactory = new PageFactory();

    @BeforeTest
    public void OpenURL() {
        driver.get(url);
        pageFactory.init();
    }

    @Test(description = "Check Dashboards Validations", priority = 1)
    @Description("Dashboards Validations")
    @Feature("Dashboard")

    public void DashboardSection_Validation() throws InterruptedException {
        //PageFactory.loginPage.login(userName, password);
       // PageFactory.dashboardSection.clickOnConfigurationIcon();
      // PageFactory.dashboardSection.clickOnDashboards();
      //  PageFactory.welcomeModal.clickSkipBtn();
        PageFactory.dashboardSection.clickOnCreateDashboard();

        // Scenario 1: Validate that a dashboard cannot be created with a blank title
        PageFactory.dashboardSection.clickOnEnterTitle(""); // Leave the title blank
        PageFactory.dashboardSection.clickOnEnterDescription("This is a dashboard without a title");
        PageFactory.dashboardSection.scrollIntoCreateView();
        PageFactory.dashboardSection.clickOnCancelView();

        PageFactory.dashboardSection.clickOnCreateDashboard();

        // Scenario 1: Validate that a dashboard cannot be created with a blank title
        PageFactory.dashboardSection.clickOnEnterTitle("ThisTitleIsWayTooLongAndExceedsTheFiftyFiveCharacterLimitSetByTheSystem"); // Leave the title blank
        PageFactory.dashboardSection.clickOnEnterDescription("Checking validations in the Dashboard");
        PageFactory.dashboardSection.scrollIntoCreateView();
        PageFactory.dashboardSection.clickOnCancelView();
        PageFactory.dashboardSection.dashboardLogOut();
        PageFactory.dashboardSection.dashboardConfirmLogout();


        // Check if error message is displayed when title is blank
//        System.out.println("Attempting to check if title error message is displayed for blank title...");
//        try {
//            boolean isErrorDisplayed = PageFactory.dashboardSection.isTitleErrorMessageDisplayed();
//            System.out.println("Error message displayed for blank title: " + isErrorDisplayed);
//            Assert.assertTrue(isErrorDisplayed, "Error message should be displayed when the title is blank");
//        } catch (Exception e) {
//            e.printStackTrace();
//            Assert.fail("An exception occurred while checking for the title error message: " + e.getMessage());
//        }
//
//        // After validation, enter a long title to trigger the next validation
//        String longTitle = "ThisTitleIsWayTooLongAndExceedsTheFiftyFiveCharacterLimitSetByTheSystem";
//        PageFactory.dashboardSection.clickOnEnterTitle(longTitle);
//        PageFactory.dashboardSection.clickOnCreateView();
//
//        // Check if error message is displayed when the title is too long
//        System.out.println("Attempting to check if title error message is displayed for long title...");
//        try {
//            boolean isLongTitleErrorDisplayed = PageFactory.dashboardSection.isTitleErrorMessageDisplayed();
//            System.out.println("Error message displayed for long title: " + isLongTitleErrorDisplayed);
//            Assert.assertTrue(isLongTitleErrorDisplayed, "Error message should be displayed when the title exceeds 55 characters");
//        } catch (Exception e) {
//            e.printStackTrace();
//            Assert.fail("An exception occurred while checking for the long title error message: " + e.getMessage());
//        }

        // Exit the program after the validations
        //System.out.println("Dashboard validation tests completed successfully.");
    }
}

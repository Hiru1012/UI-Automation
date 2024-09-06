package SmokeTests.corporate_dashboardsection;

import Pages.PageFactory;
import Utilities.DriverFactory;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Random;

public class TestSmokeDashboardView extends DriverFactory {

    public static String userName = propertyFileReader.getProperty("config", "UserName");
    public static String password = propertyFileReader.getProperty("config", "Password");
    PageFactory pageFactory = new PageFactory();

    @BeforeTest
    public void OpenURL() {
        driver.get(url);
        pageFactory.init();
    }

    @Test(description = "Create, Edit, and Delete a Dashboard", priority = 1)
    @Description("Create a Dashboard, Edit it, and then Delete it")
    @Feature("Dashboard View")

    public void   DashboardSection() throws InterruptedException {
        PageFactory.loginPage.login(userName, password);
      //  PageFactory.welcomeModal.clickSkipBtn();
        PageFactory.dashboardSection.clickOnConfigurationIcon();
        PageFactory.dashboardSection.clickOnDashboards();
        PageFactory.dashboardSection.clickOnCreateDashboard();
        PageFactory.dashboardSection.clickOnEnterTitle("Summary View");
        PageFactory.dashboardSection.clickOnEnterDescription("This is the summary dashboard");
        PageFactory.dashboardSection.scrollIntoCreateView();
        PageFactory.dashboardSection.clickOnCreateView();
        PageFactory.dashboardSection.createRandomDashboard();
        PageFactory.dashboardSection.clickOnEditButton();
        PageFactory.dashboardSection.clickOnEditDashboardDetails();
        String uniqueSuffix = " " + generateRandomString();
        PageFactory.dashboardSection.editDashboardForm(uniqueSuffix, " " + uniqueSuffix);
        PageFactory.dashboardSection.clickOnSaveChanges();
        PageFactory.dashboardSection.clickOnDeleteButton();
        PageFactory.dashboardSection.clickOnDeleteButton2();

    }

    private String generateRandomString() {
        int length = 5;
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(rnd.nextInt(characters.length())));
        }
        return sb.toString();
    }

}


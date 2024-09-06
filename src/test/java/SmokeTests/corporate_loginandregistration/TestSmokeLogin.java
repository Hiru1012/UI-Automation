package SmokeTests.corporate_loginandregistration;

import Pages.PageFactory;
import Utilities.AllureListener;
import Utilities.DriverFactory;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({AllureListener.class})
public class TestSmokeLogin extends DriverFactory {

    public static String userName = propertyFileReader.getProperty("config", "UserName");
    public static String password = propertyFileReader.getProperty("config", "Password");

    @BeforeTest
    private void openURL() {
        driver.get(url);
        PageFactory.init();
    }

    @Test(description = "Checking the successful login flow", priority = 5)
    @Description("Testing the successful login with correct credentials and performing logout")
    @Feature("Login")
    public void checkLogin() throws InterruptedException {
        // Login to the application
        PageFactory.loginPage.login(userName, password);

        // Perform logout
        PageFactory.loginPage.clickLogoutButton();
    }
}

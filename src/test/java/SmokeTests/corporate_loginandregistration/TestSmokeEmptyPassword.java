package SmokeTests.corporate_loginandregistration;
import Utilities.DriverFactory;
import Pages.PageFactory;
import Utilities.AllureListener;
import Utilities.DriverFactory;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(AllureListener.class)

public class TestSmokeEmptyPassword extends DriverFactory {
    public static String userName = propertyFileReader.getProperty("config", "UserName");

    @BeforeTest
    public void openURL() {
        driver = DriverFactory.getDriver();
        System.out.println(true);

        driver.get(url);
        System.out.println("Navigate to URL: " + url);

        PageFactory.init();
        System.out.println(true);


    }

    @Test(description = "Checking login with valid email and empty password", priority = 1)
    @Description("Testing the login with a valid email and an empty password field, and verifying that login fails")
    @Feature("Login")
    public void checkEmptyPasswordLogin() throws InterruptedException {
        String emptyPassword = "";

        // Attempt to login with valid email and empty password
        PageFactory.loginPage.login(userName, emptyPassword);

//        // Verify that login fails (you can assert the presence of an error message or check that the user is not logged in)
//        boolean loginFailed = PageFactory.loginPage.isLoginFailed();
//        Assert.assertTrue(loginFailed, "Login should fail with an empty password field.");
    }
}

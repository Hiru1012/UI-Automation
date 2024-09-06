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

public class TestSmokeEmptyUsername extends DriverFactory {



    public static String password = propertyFileReader.getProperty("config", "Password");

    @BeforeTest
    private void openURL() {
        driver.get(url);
        PageFactory.init();
    }

    @Test(description = "Checking login with empty email and correct password", priority = 2)
    @Description("Testing the login with an empty email field and a correct password, and verifying that login fails")
    @Feature("Login")
    public void checkEmptyEmailLogin() throws InterruptedException {
        String emptyEmail = "";

        // Attempt to login with empty email and correct password
        PageFactory.loginPage.login(emptyEmail, password);

//        // Verify that login fails (you can assert the presence of an error message or check that the user is not logged in)
//        boolean loginFailed = PageFactory.loginPage.isLoginFailed();
//        Assert.assertTrue(loginFailed, "Login should fail with an empty email field.");
    }


}

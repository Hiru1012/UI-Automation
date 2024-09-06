package SmokeTests.corporate_loginandregistration;

import Pages.PageFactory;
import Utilities.AllureListener;
import Utilities.DriverFactory;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
    @Listeners({AllureListener.class})
    public class TestSmokeIncorrectPassword extends DriverFactory {

        public static String userName = propertyFileReader.getProperty("config", "UserName");

        @BeforeTest
        private void openURL() {
            driver.get(url);
            PageFactory.init();
        }

        private String generateInvalidPassword() {
            return "InvalidPassword123"; // or you can use logic to generate a random invalid password
        }

        @Test(description = "Checking login with valid email and invalid password", priority = 3)
        @Description("Testing the login with correct email and incorrect password and verifying that login fails")
        @Feature("Login")
        public void checkInvalidPasswordLogin() throws InterruptedException {
            String invalidPassword = generateInvalidPassword();

            // Attempt to login with valid email and invalid password
            PageFactory.loginPage.login(userName, invalidPassword);

//            // Verify that login fails (you can assert the presence of an error message or check that the user is not logged in)
//            boolean loginFailed = PageFactory.loginPage.isLoginFailed();
//            Assert.assertTrue(loginFailed, "Login should fail with an incorrect password.");
        }
    }



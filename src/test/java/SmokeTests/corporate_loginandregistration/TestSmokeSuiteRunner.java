package SmokeTests.corporate_loginandregistration;

import Pages.PageFactory;
import Utilities.DriverFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Utilities.AllureListener;

@Listeners({AllureListener.class})
public class TestSmokeSuiteRunner extends DriverFactory {

    // Instantiate individual test classes
    TestSmokeEmptyPassword testEmptyPassword = new TestSmokeEmptyPassword();
    TestSmokeEmptyUsername testEmptyUsername = new TestSmokeEmptyUsername();
    TestSmokeIncorrectPassword testIncorrectPassword = new TestSmokeIncorrectPassword();
    TestSmokeIncorrectUsername testIncorrectUsername = new TestSmokeIncorrectUsername();
    TestSmokeLogin testLogin = new TestSmokeLogin();


    public void openURL() {
        driver = DriverFactory.getDriver();
        System.out.println(true);

        driver.get(url);
        System.out.println("Navigate to URL: " + url);

        PageFactory.init();
        System.out.println(true);


    }

    @Test(description = "Run all test cases in the suite in a specific order", priority = 1)
    public void runAllTests() throws InterruptedException {
        openURL();
        // Test case: Login with valid email and empty password
        testEmptyPassword.checkEmptyPasswordLogin();

        // Test case: Login with empty email and correct password
        testEmptyUsername.checkEmptyEmailLogin();

        // Test case: Login with valid email and incorrect password
        testIncorrectPassword.checkInvalidPasswordLogin();

        // Test case: Login with random incorrect email
        testIncorrectUsername.checkLoginWithRandomIncorrectEmail();

        // Test case: Successful login with correct credentials
        testLogin.checkLogin();
    }
}

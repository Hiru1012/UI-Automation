package SmokeTests.supplier_Login;

import Pages.PageFactory;
import Utilities.DriverFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Utilities.AllureListener;

@Listeners({AllureListener.class})
public class TestSmokeSuiteRunner_Supplier extends DriverFactory {

    // Instantiate individual test classes
    TestSmoke_SupplierEmptyPassword testEmptyPassword = new TestSmoke_SupplierEmptyPassword();
    TestSmoke_SupplierEmptyUsename testEmptyUsername = new TestSmoke_SupplierEmptyUsename();
    TestSmoke_SupplierIncorrectPassword testIncorrectPassword = new TestSmoke_SupplierIncorrectPassword();
    TestSmoke_SupplierIncorrectUsename testIncorrectUsername = new TestSmoke_SupplierIncorrectUsename();
    TestSmoke_SupplierLogin testLogin = new TestSmoke_SupplierLogin();


    public void openURL() {
        driver = DriverFactory.getDriver();
        System.out.println(true);

        driver.get(supplierURL);
        System.out.println("Navigate to Supplier URL: " + supplierURL);

        PageFactory.init();
        System.out.println(true);


    }

    @Test(description = "Run all test cases in the suite in a specific order", priority = 1)
    public void runAllTests() throws InterruptedException {
        openURL();
        // Test case: Login with valid email and empty password
        testEmptyPassword.checkEmptyPasswordLogin();

        // Test case: Login with empty email and correct password
        testEmptyUsername.checkEmptyEmailsupplierLogin();

        // Test case: Login with valid email and incorrect password
        testIncorrectPassword.checkInvalidPasswordLogin();

        // Test case: Login with random incorrect email
        testIncorrectUsername.checkLoginWithRandomIncorrectEmail();

        // Test case: Successful login with correct credentials
        testLogin.checkLogin();
    }
}

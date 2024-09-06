package SmokeTests.supplier_Login;

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
public class TestSmoke_SupplierIncorrectUsename extends DriverFactory {

    public static String correctPassword = propertyFileReader.getProperty("config", "supplierPassword");
    public static String randomIncorrectEmail = "random" + System.currentTimeMillis() + "@example.com"; // Generate a random incorrect email

    @BeforeTest
    private void openURL() {
        driver.get(supplierURL);
        PageFactory.init();
    }

    @Test(description = "Checking supplier login with random incorrect email", priority = 4)
    @Description("Testing supplier login with a random incorrect email")
    @Feature("Supplier Login")
    public void checkLoginWithRandomIncorrectEmail() throws InterruptedException {
        // Attempt to login with a random incorrect email and correct password
        PageFactory.supplier_login.SupplierLogin(randomIncorrectEmail, correctPassword);

        // Check if the error message element is visible
//        boolean isErrorVisible = PageFactory.loginPage.isErrorMessageVisible();
//        Assert.assertTrue(isErrorVisible, "Error message should be visible on unsuccessful login");

        // Get and assert the error message text
    }
}

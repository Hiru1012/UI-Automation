package SmokeTests.supplier_Login;

import Pages.PageFactory;
import Utilities.AllureListener;
import Utilities.DriverFactory;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({AllureListener.class})
public class TestSmoke_SupplierLogin extends DriverFactory {
    public static String supplierUserName = propertyFileReader.getProperty("config", "supplierUserName");
    public static String supplierPassword = propertyFileReader.getProperty("config", "supplierPassword");

    @BeforeTest
    public void openURL() {
        driver.get(supplierURL);
        PageFactory.init();
    }

    @Test(description = "Checking the successful login flow", priority = 1)
    @Description("Testing the successful supplier login with correct credentials and performing logout")
    @Feature("Login")
    public void checkLogin() throws InterruptedException {
        // Login to the application
        PageFactory.supplier_login.SupplierLogin(supplierUserName, supplierPassword);

        //skip the Joyride
        PageFactory.supplier_login.clickSkipBtn();

        // Perform logout
        PageFactory.supplier_login.logout();
    }
}
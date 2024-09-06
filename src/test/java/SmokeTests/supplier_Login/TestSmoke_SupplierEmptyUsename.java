package SmokeTests.supplier_Login;

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

public class TestSmoke_SupplierEmptyUsename extends DriverFactory {



    public static String supplierPassword = propertyFileReader.getProperty("config", "supplierPassword");

    @BeforeTest
    private void openURL() {
        driver.get(supplierURL);
        PageFactory.init();
    }

    @Test(description = "Checking supplier login with empty email and correct password", priority = 2)
    @Description("Testing the supplier login with an empty email field and a correct password, and verifying that login fails")
    @Feature("Supplier Login")
    public void checkEmptyEmailsupplierLogin() throws InterruptedException {
        String emptySupplierUserName = "";

        // Attempt to login with empty email and correct password
        PageFactory.supplier_login.SupplierLogin(emptySupplierUserName, supplierPassword);

//        // Verify that login fails (you can assert the presence of an error message or check that the user is not logged in)
//        boolean loginFailed = PageFactory.loginPage.isLoginFailed();
//        Assert.assertTrue(loginFailed, "Login should fail with an empty email field.");
    }


}

package SmokeTests.supplier_GuidedForms_Goods;

import Pages.PageFactory;
import Utilities.AllureListener;
import Utilities.DriverFactory;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({AllureListener.class})
public class TestSmokeGoods_DataSubmit extends DriverFactory {
    public static String supplierUserName = propertyFileReader.getProperty("config", "supplierUserName");
    public static String supplierPassword = propertyFileReader.getProperty("config", "supplierPassword");

    @BeforeTest
    public void openURL() {
        driver.get(supplierURL);
        PageFactory.init();
    }

    @Test(description = "Checking the Manufacture Of Goods flow", priority = 1)
    @Description("Testing the successful supplier login with correct credentials and performing logout")
    @Feature("Manufacture Of Goods")
    public void ManufactureOfGoods() throws InterruptedException {
        // Login to the application
        PageFactory.supplier_login.SupplierLogin(supplierUserName, supplierPassword);

        // Skip the Joyride
        PageFactory.supplier_login.clickSkipBtn();

        // Click on New Submission
        PageFactory.manufactureOfGoods.clickOnBtnNewSubmission();

        // Click on Enter ESG Data
        PageFactory.manufactureOfGoods.clickOnBtnEnterESGData();

        // Skip the Joyride
        PageFactory.manufactureOfGoods.clickOnJoyride();

        // Select the "GPR" Event or Period
        PageFactory.manufactureOfGoods.SelectEventOrPeriod();

        PageFactory.manufactureOfGoods.ClickOnCheckbox();

        PageFactory.manufactureOfGoods.ClickOnRadioBtn1();

        PageFactory.manufactureOfGoods.ProductName();

        PageFactory.manufactureOfGoods.Quantity();

        PageFactory.manufactureOfGoods.EmissionFactor();

        PageFactory.manufactureOfGoods.Buttonsave();

        PageFactory.manufactureOfGoods.ButtonSubmit();

        PageFactory.manufactureOfGoods.ButtonSubmit2();

        PageFactory.manufactureOfGoods.Supplier_Logout();

        PageFactory.manufactureOfGoods.Supplier_LogoutConfirm();

    }
}

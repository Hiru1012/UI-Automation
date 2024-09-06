package SmokeTests.supplier_GuidedForms_Goods;

import Pages.PageFactory;
import Utilities.AllureListener;
import Utilities.DriverFactory;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({AllureListener.class})
public class TestSmoke_DataFormClear extends DriverFactory {
    public static String supplierUserName = propertyFileReader.getProperty("config", "supplierUserName");
    public static String supplierPassword = propertyFileReader.getProperty("config", "supplierPassword");

    @BeforeTest
    public void openURL() {
        driver.get(supplierURL);
        PageFactory.init();
    }

    @Test(description = "Checking the Manufacture Of Goods flow", priority = 1)
    @Description("Testing the Goods section data clear part")
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

        // Click on the checkbox and radio button
        PageFactory.manufactureOfGoods.ClickOnCheckbox();
        PageFactory.manufactureOfGoods.ClickOnRadioBtn1();

        // Enter Product Name and Quantity
        PageFactory.manufactureOfGoods.ProductName();
        PageFactory.manufactureOfGoods.Quantity();

        PageFactory.manufactureOfGoods.scrollIntoClearButton();
        PageFactory.manufactureOfGoods.ButtonClear();
        PageFactory.manufactureOfGoods.ButtonClear2();
        PageFactory.manufactureOfGoods.Supplier_Logout();
        PageFactory.manufactureOfGoods.Supplier_LogoutConfirm();

    }
}

package SmokeTests.supplier_GuidedFormsScenario3_Goods;

import Pages.PageFactory;
import Utilities.AllureListener;
import Utilities.DriverFactory;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({AllureListener.class})
public class TestSmoke_Scenario3 extends DriverFactory {
    public static String supplierUserName = propertyFileReader.getProperty("config", "supplierUserName");
    public static String supplierPassword = propertyFileReader.getProperty("config", "supplierPassword");

    @BeforeTest
    public void openURL() {
        driver.get(supplierURL);
        PageFactory.init();
    }

    @Test(description = "Checking the Manufacture Of Goods scenario 3 flow", priority = 1)
    @Description("Scenario 3")
    @Feature("Manufacture Of Goods scenario 3")
    public void ManufactureOfGoods() throws InterruptedException {
        // Login to the application
        PageFactory.supplier_login.SupplierLogin(supplierUserName, supplierPassword);

        // Skip the Joyride
        PageFactory.supplier_login.clickSkipBtn();

        PageFactory.manufactureOfGoods.clickOnBtnNewSubmission();

        // Click on Enter ESG Data
        PageFactory.manufactureOfGoods.clickOnBtnEnterESGData();

        // Skip the Joyride
        PageFactory.manufactureOfGoods.clickOnJoyride();

        // Select the "GPR" Event or Period
        PageFactory.manufactureOfGoods.SelectEventOrPeriod();

        PageFactory.manufactureOfGoods.ClickOnCheckbox();


        // Click on New Submission
        PageFactory.manufactureOfGoods.CalculateCarbonEmission();

        // Click on Enter ESG Data
        PageFactory.manufactureOfGoods.CalculateScopeEmissions();

        // Skip the Joyride
        PageFactory.manufactureOfGoods.inputProductName();

        // Select the "GPR" Event or Period
        PageFactory.manufactureOfGoods.inputQuantity();

        PageFactory.manufactureOfGoods.inputMaterialName();

        PageFactory.manufactureOfGoods.inputMaterialName3();

        PageFactory.manufactureOfGoods.inputRecycledStatus();

        PageFactory.manufactureOfGoods.inputQuantity3();

        PageFactory.manufactureOfGoods.WasteQty();

        PageFactory.manufactureOfGoods.Waste_Type3();

        PageFactory.manufactureOfGoods.qtyOfMaterialTransported();

        PageFactory.manufactureOfGoods.inputOneWayDistance();

        PageFactory.manufactureOfGoods.inputModeOfTransportation();

        PageFactory.manufactureOfGoods.inputFuelType();

        PageFactory.manufactureOfGoods.supplierPostalCode();

        PageFactory.manufactureOfGoods.supplierCountry();

        PageFactory.manufactureOfGoods.inputGBPValue();


    }
}

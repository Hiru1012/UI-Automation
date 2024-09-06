package SmokeTests.supplier_GuidedForms_Goods;

import Pages.PageFactory;
import Utilities.DriverFactory;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static Pages.PageFactory.driver;
import static Utilities.DriverFactory.propertyFileReader;
import static Utilities.DriverFactory.supplierURL;

public class TestSmoke_Scenario2_Validations {

    public static String supplierUserName = propertyFileReader.getProperty("config", "supplierUserName");
    public static String supplierPassword = propertyFileReader.getProperty("config", "supplierPassword");

    @BeforeTest
    public void openURL() {
        driver.get(supplierURL);
        PageFactory.init();
    }

    @Test(description = "Checking the flow for scenario 2 in Manufacture of Goods Section", priority = 1)
    @Description("Testing the flow for scenario 2 in Manufacture of Goods Section")
    @Feature("Manufacture Of Goods scenario 2")
    public void ManufactureOfGoods() throws InterruptedException {

        PageFactory.supplier_login.SupplierLogin(supplierUserName, supplierPassword);
        PageFactory.supplier_login.clickSkipBtn();
        PageFactory.manufactureOfGoods.CustomerDropdown();
        PageFactory.manufactureOfGoods.clickOnBtnNewSubmission();
        PageFactory.manufactureOfGoods.clickOnBtnEnterESGData();
        PageFactory.manufactureOfGoods.clickOnJoyride();
        PageFactory.manufactureOfGoods.SelectEventOrPeriod();
        PageFactory.manufactureOfGoods.ClickOnCheckbox();
        PageFactory.manufactureOfGoods.RadioButton2();
        PageFactory.manufactureOfGoods.RadioButton3();

        // Validations for Scope 1 Emissions field
        WebElement scope1Emissions = PageFactory.manufactureOfGoods.Scope1Emissions();
        scope1Emissions.sendKeys("abc123");
        String scope1EmissionsValue = scope1Emissions.getAttribute("value");
        Assert.assertTrue(scope1EmissionsValue.matches("\\d+"), "Scope 1 Emissions should only contain numeric values.");

        // Validations for Scope 2 Emissions field
        PageFactory.manufactureOfGoods.scrollIntoScope2Emissions();
        WebElement scope2Emissions = PageFactory.manufactureOfGoods.Scope2Emissions();
        scope2Emissions.sendKeys("xyz456");
        String scope2EmissionsValue = scope2Emissions.getAttribute("value");
        Assert.assertTrue(scope2EmissionsValue.matches("\\d+"), "Scope 2 Emissions should only contain numeric values.");

        // Validations for Quantity Scenario 2 field
        WebElement quantityScenario2 = PageFactory.manufactureOfGoods.QuantityScenario2();
        quantityScenario2.sendKeys("quantityABC");
        String quantityScenario2Value = quantityScenario2.getAttribute("value");
        Assert.assertTrue(quantityScenario2Value.matches("\\d+"), "Quantity Scenario 2 should only contain numeric values.");

        // Validations for Quantity Scenario 3 field
        WebElement quantityScenario3 = PageFactory.manufactureOfGoods.Quantity3Scenario();
        quantityScenario3.sendKeys("value123XYZ");
        String quantityScenario3Value = quantityScenario3.getAttribute("value");
        Assert.assertTrue(quantityScenario3Value.matches("\\d+"), "Quantity Scenario 3 should only contain numeric values.");

        // Validations for Distance From Supplier field
        WebElement distanceFromSupplier = PageFactory.manufactureOfGoods.DistanceFromSupplier();
        distanceFromSupplier.sendKeys("distance!@#");
        String distanceFromSupplierValue = distanceFromSupplier.getAttribute("value");
        Assert.assertTrue(distanceFromSupplierValue.matches("\\d+"), "Distance From Supplier should only contain numeric values.");

        // Validations for Value Of Goods field
        WebElement valueOfGoods = PageFactory.manufactureOfGoods.ValueOf_Goods();
        valueOfGoods.sendKeys("valueGoods123ABC");
        String valueOfGoodsValue = valueOfGoods.getAttribute("value");
        Assert.assertTrue(valueOfGoodsValue.matches("\\d+"), "Value Of Goods should only contain numeric values.");

        // Rest of the test steps
        PageFactory.manufactureOfGoods.InputPercentageOfEmissions();
        PageFactory.manufactureOfGoods.ProductName2();
        PageFactory.manufactureOfGoods.MaterialName();
        PageFactory.manufactureOfGoods.RecycleType();
        PageFactory.manufactureOfGoods.Waste();
        PageFactory.manufactureOfGoods.Waste_Type();
        PageFactory.manufactureOfGoods.MaterialQtyTransported();
        PageFactory.manufactureOfGoods.Transpotation();
        PageFactory.manufactureOfGoods.Fuel();
        PageFactory.manufactureOfGoods.Supplier_Postcode();
        PageFactory.manufactureOfGoods.Supplier_Country();
        PageFactory.manufactureOfGoods.Buttonsave2();
        PageFactory.manufactureOfGoods.Button_Submit();
        PageFactory.manufactureOfGoods.Supplier_Logout();
        PageFactory.manufactureOfGoods.Supplier_LogoutConfirm();
    }
}

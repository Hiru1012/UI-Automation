package SmokeTests.supplier_GuidedForms_Goods;
import Pages.PageFactory;
import Utilities.DriverFactory;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSmokeGoods_Scenario2 extends DriverFactory{

    public static String supplierUserName = propertyFileReader.getProperty("config", "supplierUserName");
    public static String supplierPassword = propertyFileReader.getProperty("config", "supplierPassword");

    @BeforeTest
    public void openURL() {
        driver.get(supplierURL);
        PageFactory.init();
    }

    @Test(description = "Checking the flow for scenario 2 in Manufacture of Goods Section", priority = 1)
    @Description("Testing the low for scenario 2 in Manufacture of Goods Section")
    @Feature("Manufacture Of Goods scenario 2 ")
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
        PageFactory.manufactureOfGoods.Scope1Emissions();
        PageFactory.manufactureOfGoods.scrollIntoScope2Emissions();
        PageFactory.manufactureOfGoods.Scope2Emissions();
        PageFactory.manufactureOfGoods.InputPercentageOfEmissions();
        PageFactory.manufactureOfGoods.ProductName2();
        PageFactory.manufactureOfGoods.QuantityScenario2();
      //  PageFactory.manufactureOfGoods.scrollIntoMaterialName();
        PageFactory.manufactureOfGoods.MaterialName();
        PageFactory.manufactureOfGoods.RecycleType();
        PageFactory.manufactureOfGoods.Quantity3Scenario();
        PageFactory.manufactureOfGoods.Waste();
        PageFactory.manufactureOfGoods.Waste_Type();
        PageFactory.manufactureOfGoods.MaterialQtyTransported();
        PageFactory.manufactureOfGoods.DistanceFromSupplier();
        PageFactory.manufactureOfGoods.Transpotation();
        PageFactory.manufactureOfGoods.Fuel();
        PageFactory.manufactureOfGoods.Supplier_Postcode();
        PageFactory.manufactureOfGoods.Supplier_Country();
        PageFactory.manufactureOfGoods.ValueOf_Goods();
        PageFactory.manufactureOfGoods.Buttonsave2();
        PageFactory.manufactureOfGoods.Button_Submit();
        PageFactory.manufactureOfGoods.Supplier_Logout();
        PageFactory.manufactureOfGoods.Supplier_LogoutConfirm();

















    }





}

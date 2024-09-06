package SmokeTests.supplier_GuidedForms_Goods;

import Pages.PageFactory;
import Utilities.AllureListener;
import Utilities.DriverFactory;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

@Listeners({AllureListener.class})
public class TestSmokeGoods_Validations extends DriverFactory {
    public static String supplierUserName = propertyFileReader.getProperty("config", "supplierUserName");
    public static String supplierPassword = propertyFileReader.getProperty("config", "supplierPassword");

    @BeforeTest
    public void openURL() {
        driver.get(supplierURL);
        PageFactory.init();
    }

    @Test(description = "Checking the Manufacture Of Goods flow", priority = 1)
    @Description("Testing the successful supplier login, performing validations on input fields, and submitting the form")
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

        // Validate Quantity supplied to Experienz field
        validateQuantitySuppliedField();

        // Validate Product-specific emission factor field
        validateEmissionFactorField();

        // Save and Submit the form if validations pass
        //PageFactory.manufactureOfGoods.Buttonsave();
        PageFactory.manufactureOfGoods.ButtonSubmit();
        //PageFactory.manufactureOfGoods.ButtonSubmit2();
    }

    private void validateQuantitySuppliedField() throws InterruptedException {
        WebElement quantityField = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[2]/div/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[2]/div/div/div[2]/div[1]/div/div/div/input"));
        //WebElement quantityError = driver.findElement(By.xpath("YOUR_QUANTITY_ERROR_MESSAGE_XPATH_HERE"));

        quantityField.clear();
        quantityField.sendKeys("InvalidQuantity"); // Enter invalid data
        PageFactory.manufactureOfGoods.ButtonSubmit();

        // Check if validation error is displayed
        //Assert.assertTrue(quantityError.isDisplayed(), "Quantity supplied to Experienz validation failed");
    }

    private void validateEmissionFactorField() throws InterruptedException {
        WebElement emissionFactorField = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[2]/div/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[3]/div/div/div[2]/div/div/div/div/input"));
        //WebElement emissionFactorError = driver.findElement(By.xpath("YOUR_EMISSION_FACTOR_ERROR_MESSAGE_XPATH_HERE"));

        emissionFactorField.clear();
        emissionFactorField.sendKeys("InvalidFactor"); // Enter invalid data
        PageFactory.manufactureOfGoods.ButtonSubmit();

        // Check if validation error is displayed
       // Assert.assertTrue(emissionFactorError.isDisplayed(), "Product-specific emission factor validation failed");
    }
}

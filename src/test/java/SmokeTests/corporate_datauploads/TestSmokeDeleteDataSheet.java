package SmokeTests.corporate_datauploads;

import Pages.PageFactory;
import Utilities.DriverFactory;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestSmokeDeleteDataSheet extends DriverFactory {

    public static String userName = propertyFileReader.getProperty("config", "UserName");
    public static String password = propertyFileReader.getProperty("config", "Password");

    @BeforeSuite
    public void OpenURL() {
        driver = DriverFactory.getDriver();
        driver.get(url);
        PageFactory.init();
    }

    @Test(description = "Delete a uploaded Data sheet", priority = 1)
    @Description("Delete a data set ")
    @Feature("deleteESGData")
    public void deleteESGData() {
        try {

//            PageFactory.loginPage.login(userName, password);
//            PageFactory.dataManagement.clickOnConfigurationIcon();
//            PageFactory.dataManagement.clickOnData();
//            PageFactory.dataManagement.hoverOverDataAndClickDelete();
            PageFactory.dataManagement.clickOnDelete();
            PageFactory.dataManagement.clickOnConfirmDelete();
          PageFactory.dataManagement.clickOnButtonLogout();
          PageFactory.dataManagement.clickOnButtonConfirmLogout();


        } catch (Exception e) {
            e.printStackTrace();
            // Log the error and ensure that it does not stop the test execution
        }
    }

}

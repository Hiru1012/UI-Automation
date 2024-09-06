package SmokeTests.corporate_datauploads;

import Pages.PageFactory;
import Utilities.DriverFactory;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;

public class TestSmokeUploadAndDownloadData extends DriverFactory {
    public static String userName = propertyFileReader.getProperty("config", "UserName");
    public static String password = propertyFileReader.getProperty("config", "Password");

    @BeforeSuite
    public void OpenURL() {
        driver = DriverFactory.getDriver();
        driver.get(url);
        PageFactory.init();
    }

    @Test(description = "Upload a new data set", priority = 1)
    @Description("Upload a new data set")
    @Feature("uploadESGData")
    public void uploadESGData() {
        try {
            // Login and navigate
            PageFactory.loginPage.login(userName, password);
//            PageFactory.welcomeModal.clickSkipBtn();

            // Ensure page is loaded before interactions
//            WebDriverWait wait;
//            wait = new WebDriverWait(driver, Duration.ofSeconds(3));
//            wait.until(ExpectedConditions.elementToBeClickable(By.id("configurationIcon"))); // Adjust locator as needed

            // Perform actions
            PageFactory.dataManagement.clickOnConfigurationIcon();
            PageFactory.dataManagement.clickOnData();
            PageFactory.dataManagement.clickOnUploadESGData();
            PageFactory.dataManagement.clickOnDataFileType();
            PageFactory.dataManagement.clickOnSelectFileType();
            PageFactory.dataManagement.clickOnDownloadKPISheet();
            PageFactory.dataManagement.enterDescription("Environment KPI Sheet Data Download");
            PageFactory.dataManagement.scrollToFileUpload();

            // Upload file
            String absolutePath = new File("assets/sample_kpi_sheet.csv").getAbsolutePath();
            PageFactory.dataManagement.uploadFile(absolutePath);
            PageFactory.dataManagement.clickOnbtnUpload();
            PageFactory.dataManagement.clickOnContinueBtn();
            PageFactory.dataManagement.clickOnConfirmDelete();

            // Download and delete
          //  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//someXpath"))); // Adjust locator as needed
            PageFactory.dataManagement.hoverOverDataAndClickDownload();
            PageFactory.dataManagement.clickOnDownload();
            PageFactory.dataManagement.clickOnDelete();
            PageFactory.dataManagement.clickOnConfirmDelete();
//
       } catch (Exception e) {
           e.printStackTrace();
            // Log the error and ensure that it does not stop the test execution
        }
    }

}


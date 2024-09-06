package SmokeTests.corporate_users;

import Pages.PageFactory;
import Utilities.DriverFactory;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Random;

public class TestSmokeEditUser extends DriverFactory {

    public static String userName = propertyFileReader.getProperty("config", "UserName");
    public static String password = propertyFileReader.getProperty("config", "Password");
    PageFactory pageFactory = new PageFactory();

    @BeforeTest
    private void OpenURL() {
        driver.get(url);
        pageFactory.init();
    }

    @Test(description = "Edit User", priority = 1)
    @Description("Edit USer")
    @Feature("EditUser")
    public void EditUser() throws InterruptedException{

//        PageFactory.loginPage.login(userName, password);
//        PageFactory.userManagement.clickOnConfigurationIcon();
//        PageFactory.userManagement.clickOnUsers();
        PageFactory.userManagement.hoverOverUserAndClickEdit();
        PageFactory.userManagement.clickOnEdit();
        PageFactory.userManagement.updateFName("Zayn");
        PageFactory.userManagement.updateLName("Malik");
        PageFactory.userManagement.clickOnUpdate();





    }
}

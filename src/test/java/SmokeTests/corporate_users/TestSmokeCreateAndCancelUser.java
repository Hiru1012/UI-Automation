package SmokeTests.corporate_users;

import Pages.PageFactory;
import Utilities.DriverFactory;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Random;

public class TestSmokeCreateAndCancelUser extends DriverFactory {

    public static String userName = propertyFileReader.getProperty("config", "UserName");
    public static String password = propertyFileReader.getProperty("config", "Password");
    PageFactory pageFactory = new PageFactory();

    @BeforeTest
    private void OpenURL() {
        driver.get(url);
        pageFactory.init();
    }

    @Test(description = "Create and Edit a new user", priority = 1)
    @Description("Create and Edit a new user")
    @Feature("CreateAndEditUser")
    public void CreateAndEditUser() throws InterruptedException {

        //Generate a random number
        Random rand = new Random();
        int randomNumber = rand.nextInt(10000); // Adjust the bound as needed

        // Create a randomized email
        String baseEmail = "Test";
        String randomizedEmail = baseEmail + randomNumber;

        // Step 1: Create a new user
        PageFactory.loginPage.login(userName, password);
//PageFactory.welcomeModal.clickSkipBtn();
        PageFactory.userManagement.clickOnConfigurationIcon();
        PageFactory.userManagement.clickOnUsers();
        PageFactory.userManagement.clickOnCreateANewUser();
        PageFactory.userManagement.enterEmail(randomizedEmail); // Use randomized email
        PageFactory.userManagement.enterFirstName1("Hiruni");
        PageFactory.userManagement.enterLastName2("Yatagama");
        PageFactory.userManagement.enterTempPassword("Abc12345!!!");
        PageFactory.userManagement.clickOnSelectCountryDropdown();
        PageFactory.userManagement.clickOnSelectCountry();
        PageFactory.userManagement.scrollIntoGroupDropdown();
        PageFactory.userManagement.clickOnSelectSearchUserGroupDropdown();
        PageFactory.userManagement.clickOnSelectUserGroups();
        PageFactory.userManagement.clickOnContainer1();
        PageFactory.userManagement.clickOnSelectSearchUserPermissionsDropdown();
        PageFactory.userManagement.clickOnSelectSearchUserPermissions();
        PageFactory.userManagement.clickOnContainer2();
        PageFactory.userManagement.clickOnCreateButton();
        PageFactory.userManagement.clickOnCreateANewUser();
        PageFactory.userManagement.enterEmail("Sahani");
        PageFactory.userManagement.enterFirstName1("Gamage");
        PageFactory.userManagement.enterLastName2("Sgamage");
        PageFactory.userManagement.enterTempPassword("Abc12345!!");
        PageFactory.userManagement.clickOnSelectCountryDropdown();
        PageFactory.userManagement.clickOnSelectCountry();
        PageFactory.userManagement.scrollIntoGroupDropdown();
        PageFactory.userManagement.clickOnSelectSearchUserGroupDropdown();
        PageFactory.userManagement.clickOnSelectUserGroups();
        PageFactory.userManagement.clickOnContainer1();
        PageFactory.userManagement.clickOnSelectSearchUserPermissionsDropdown();
        PageFactory.userManagement.clickOnContainer2();
        PageFactory.userManagement.clickOnCancelButton();


    }
}

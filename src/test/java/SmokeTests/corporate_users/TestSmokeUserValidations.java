package SmokeTests.corporate_users;

import Pages.PageFactory;
import Utilities.DriverFactory;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Random;

public class TestSmokeUserValidations extends DriverFactory {

    public static String userName = propertyFileReader.getProperty("config", "UserName");
    public static String password = propertyFileReader.getProperty("config", "Password");
    PageFactory pageFactory = new PageFactory();

    @BeforeTest
    private void OpenURL() {
        driver.get(url);
        pageFactory.init();
    }

    @Test(description = "Add Validations to the user section", priority = 1)
    @Description("Add Validations")
    @Feature("Add Validations")
    public void UserValidations() throws InterruptedException{

        //Generate a random number
        Random rand = new Random();
        int randomNumber = rand.nextInt(10000); // Adjust the bound as needed

        // Create a randomized email
        String baseEmail = "Thisistoconfirmthatthismailismorethan55charactersandthisisnotvalidtherefore";
        String randomizedEmail = baseEmail + randomNumber ;

        // Step 1: Create a new user
//        PageFactory.loginPage.login(userName, password);
////PageFactory.welcomeModal.clickSkipBtn();
//        PageFactory.userManagement.clickOnConfigurationIcon();
//        PageFactory.userManagement.clickOnUsers();
        PageFactory.userManagement.clickOnCreateANewUser();
        PageFactory.userManagement.enterEmail(randomizedEmail); // Use randomized email
        PageFactory.userManagement.enterFirstName1("");
        PageFactory.userManagement.enterLastName2("");
        PageFactory.userManagement.enterTempPassword("3333333333333333333333333333333");
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
        PageFactory.userManagement.clickOnLogout();
        PageFactory.userManagement.btnConfirmLogout();

    }
}

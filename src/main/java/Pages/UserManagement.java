package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserManagement extends BasePage {

    // User Section Elements
    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/header/div/div[4]/div/button")
    WebElement configurationIcon;

    @FindBy(xpath = "/html/body/div[2]/div[3]/div[2]/a")
    WebElement usersSection;


    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[1]/div/button")
    WebElement btnCreateUser;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[4]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div/input")
    WebElement enterEmail;
    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[4]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div/div/div[2]/form/div[2]/div/input")
    WebElement enterFirstName1;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[4]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div/div/div[2]/form/div[3]/div/input")
    WebElement enterLastName2;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[4]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div/div/div[2]/form/div[3]/div/input")
    WebElement enterFirstName;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[4]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div/div/div[2]/form/div[4]/div/input")
    WebElement enterLastName;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[4]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div/div/div/form/div[4]/div[1]/div/input")
    WebElement enterPassword;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[4]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div/div/div/form/div[4]/div[2]/div/div")
    WebElement selectCountryDropdown;

    @FindBy(xpath = "/html/body/div[4]/div[3]/ul/li[1]")
    WebElement selectCountry;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[4]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div/div/div/form/div[5]/div/div/input")
    WebElement selectSearchUserGroupDropdown;

    @FindBy(xpath = "/html/body/div[4]/div/ul/li[1]")
    WebElement groupsDropdown;

    //*[@id="mui-38987-listbox"]
    @FindBy(xpath = "/html/body/div[4]/div/ul/li[1]")
    WebElement userGroupValues;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[4]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div/div/div/form/div[6]/div/div/input")
    WebElement selectSearchUserPermissionsDropdown;

    @FindBy(xpath = "/html/body/div[4]/div/ul/li[1]")
    WebElement searchUserPermissionsValues;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnCreate;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[4]/div[1]")
    WebElement btncross;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[4]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div/div/div/form/div[10]/button[2]")
    WebElement btnCancel;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/input")
    WebElement searchByUserName;

//edit user sections
    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div[2]/div/div/div/div/table/tbody/tr[1]")
    WebElement firstUserRow;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div[2]/div/div/div/div/table/tbody/tr[1]/td[4]/div/div/button\n")
    WebElement firstUserEditIcon;
    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[4]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/button[2]")
    WebElement btnInactive;
    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[4]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div/div/div/form/div[5]/div/div/input")
    WebElement updateSearchUserGroupDropdown;
    @FindBy(xpath = "/html/body/div[4]/div/ul/li[2]/span/span[1]/input")
    WebElement updateSearchUserGroup;
//
//    @FindBy(xpath = "/html/body/div[4]/div/ul")
//    WebElement groupsDropdown;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnUpdate;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/header/div/div[5]/div/button")
    WebElement btnLogOut;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div[2]/button")
    WebElement btnConfirmLogout;


    public UserManagement(WebDriver driver) {
        super(driver);
    }

    // User Section Methods

    public void clickOnConfigurationIcon() throws InterruptedException {
        addCommonWait();
        clickOnButton(configurationIcon);

    }

    /**
     * Click on the Users section
     *
     * @throws InterruptedException
     */
    public void clickOnUsers() throws InterruptedException {
        addCommonWait();
        addCommonWait();
        clickOnButton(usersSection);

    }

    /**
     * Click on the create new user button
     *
     * @return create user page
     * @throws InterruptedException
     */

    public void clickOnCreateANewUser() throws InterruptedException {
        addCommonWait();
        addCommonWait();
        clickOnButton(btnCreateUser);
    }


    /**
     * This method is for enter the email
     */
    @Step
    public void enterEmail(String email) throws InterruptedException {
        addCommonWait();
        addCommonWait();
        addCommonWait();
        sendKeys(enterEmail, email);
    }
    //
    public void scrollIntoGroupDropdown() throws InterruptedException {
        scrollInToView(selectSearchUserGroupDropdown);
//        clickOnButton(selectSearchUserGroupDropdown);
        addCommonWait();
    }


    /**
     * This method is for enter the first name
     */
    @Step
    public void enterFirstName1(String fName) throws InterruptedException {
        addCommonWait();
        sendKeys(enterFirstName1, fName);
    }

    /**
     * This method is for enter the last name
     */
    @Step
    public void enterLastName2(String lName) throws InterruptedException {
        addCommonWait();
        sendKeys(enterLastName2, lName);
    }

    /**
     * This method is for enter the temporary password
     */
    @Step
    public void enterTempPassword(String password) throws InterruptedException {
        addCommonWait();
        sendKeys(enterPassword, password);
    }

    /**
     * * This method is to click on Select country drop down
     *
     * @throws InterruptedException
     */
    public void clickOnSelectCountryDropdown() throws InterruptedException {
        addCommonWait();
        addCommonWait();
        selectCountryDropdown.click();
    }

    /**
     * * This method is to click on Select country
     *
     * @throws InterruptedException
     */
    public void clickOnSelectCountry() throws InterruptedException {
        addCommonWait();
        selectCountry.click();
    }

    /**
     * * This method is to click on Select Search User Group drop down
     *
     * @throws InterruptedException
     */


    public void clickOnSelectSearchUserGroupDropdown() throws InterruptedException {
        addCommonWait();
        selectSearchUserGroupDropdown.click();
    }

    /**
     * * This method is to click on Select User Groups
     *
     * @throws InterruptedException
     */
    public void clickOnSelectUserGroups() throws InterruptedException {
        addCommonWait();
        userGroupValues.click();
    }

    /**
     * * This method is to click on Select Search User Permission drop down
     *
     * @throws InterruptedException
     */


    public void clickOnSelectSearchUserPermissionsDropdown() throws InterruptedException {
        addCommonWait();
        addCommonWait();
        selectSearchUserPermissionsDropdown.click();
    }

    /**
     * * This method is to click on Select Search User Permission drop down
     *
     * @throws InterruptedException
     */
    public void clickOnSelectSearchUserPermissions() throws InterruptedException {

        searchUserPermissionsValues.click();
        addCommonWait();
        addCommonWait();
    }

    /**
     * * This method is to click on Data Restriction radio button
     *
     * @throws InterruptedException
    //     */
//    public void clickOnDataRestriction() throws InterruptedException {
//        addCommonWait();
//        clickDataRestriction.click();
//    }

    /**
     * This method is to click on Create Button
     *
     * @throws InterruptedException
     */
    public void clickOnCreateButton() throws InterruptedException {
        addCommonWait();
        clickOnButton(btnCreate);
    }


    public void clickOnbtncross() throws InterruptedException {
        addCommonWait();
        addCommonWait();
        clickOnButton(btncross);
        addCommonWait();
    }


    /**
     * This method is to click on Cancel Button
     *
     * @throws InterruptedException
     */
    public void clickOnCancelButton() throws InterruptedException {
        addCommonWait();
        clickOnButton(btnCancel);
    }

    /**
     * This method is to Search users by searchbar
     *
     * @throws InterruptedException
     */
    public void searchUser(String name) throws InterruptedException {
        addCommonWait();
        clickOnButton(searchByUserName);
        sendKeys(searchByUserName, name);
    }

    @Step
    public void clickOnContainer1() throws InterruptedException {
        //groupsDropdown.click();
        groupsDropdown.sendKeys(Keys.ESCAPE);
    }

//Edit user sections


    public void hoverOverUserAndClickEdit() throws InterruptedException {
        //addCommonWait();
        addCommonWait();
        moveToElement(firstUserRow);  // Hover over the user
        addCommonWait();
    }


    public void clickOnEdit() throws InterruptedException {
        addCommonWait();
        addCommonWait();
        // scrollInToView(firstUserEditIcon);
       // moveToElement(firstUserRow);
        clickOnButton(firstUserEditIcon);

    }

    public void updateFName(String Zayn ) throws InterruptedException {
        addCommonWait();
        addCommonWait();
        addCommonWait();
        enterFirstName.clear();
        enterFirstName.sendKeys(Zayn);

    }


    public void updateLName(String malik) throws InterruptedException {
        addCommonWait();
        enterLastName.clear();
        enterLastName.sendKeys(malik);
    }


    public void clickOnInactive() throws InterruptedException {
        addCommonWait();
        addCommonWait();
        clickOnButton(btnInactive);

    }

    /**
     * * This method is to click on Search User Group drop down
     *
     * @throws InterruptedException
     */
    public void clickOnSearchUserGroupDropdown() throws InterruptedException {
        addCommonWait();
        updateSearchUserGroupDropdown.click();
    }

    /**
     * * This method is to click on Search User Group value
     *
     * @throws InterruptedException
     */
    public void clickOnSearchUserGroupValue() throws InterruptedException {
        addCommonWait();
        updateSearchUserGroup.click();
    }

    /**
     * Click on the Update button
     *
     * @throws InterruptedException //
     */


    @Step
    public void clickOnContainer2() throws InterruptedException {
        //groupsDropdown.click();
        groupsDropdown.sendKeys(Keys.ESCAPE);
    }


    public void  scrollIntoUpdate() throws InterruptedException {
        scrollInToView(btnUpdate);
        addCommonWait();
        addCommonWait();
    }


    public void clickOnUpdate() throws InterruptedException {
        addCommonWait();
        clickOnButton(btnUpdate);
    }

    public void clickOnLogout() throws InterruptedException {
        addCommonWait();
        clickOnButton(btnLogOut);
    }

    public void btnConfirmLogout() throws InterruptedException {
        addCommonWait();
        clickOnButton(btnConfirmLogout);
    }

}

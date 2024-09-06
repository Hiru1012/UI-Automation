package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PartnerRegistration extends BasePage{

    @FindBy(xpath = "(//div[@class='Cp'])[1]")
    WebElement invitationEmail;

    @FindBy(xpath = "//a[normalize-space()='Register now']")
    WebElement btnRegisterNow;

    @FindBy(xpath = "//input[@placeholder='Enter company website']")
    WebElement enterCompanyWebsite;

    @FindBy(xpath = "//div[2]/div/div/input")
    WebElement selectCountry;

    @FindBy(xpath = "//li[contains(.,'Aruba')]")
    WebElement selectCountryValue;

    @FindBy(xpath = "//div[2]/div/div[2]/div/div/input")
    WebElement selectSector;

    @FindBy(xpath = "//div[2]/div/ul/li[1]")
    WebElement selectSectorValue;

    @FindBy(xpath = "//input[@placeholder='Enter identfication number']")
    WebElement enterISIN;

    @FindBy(xpath = "//input[@placeholder='Enter contact name']")
    WebElement enterContactName;

    @FindBy(xpath = "//form/div[7]/div[2]/div/div/input")
    WebElement selectBusinessRole;

    @FindBy(xpath = "//div[2]/div/ul/li[1]")
    WebElement selectBusinessRoleValue;

    @FindBy(xpath = "//form/span[1]/span[1]/input")
    WebElement tick;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnRegister;

    public PartnerRegistration(WebDriver driver) {
        super(driver);
    }

    /**
     * This method is to click on Invitation email
     * @throws InterruptedException
     */
    public void clickOnInvitationEmail() throws InterruptedException{
        addCommonWait();
        invitationEmail.click();
    }

    /**
     * This method is to click on Register Now button
     * @throws InterruptedException
     */
    public void clickOnRegisterNow() throws InterruptedException{
        addCommonWait();
        btnRegisterNow.click();
    }

    /**
     * This method is to enter the company website
     * @throws InterruptedException
     */
    public void enterCompany(String companyWebsite) throws InterruptedException{
        addCommonWait();
        sendKeys(enterCompanyWebsite,companyWebsite);
    }

    /**
     * This method is to click on Country Selector drop down
     * @throws InterruptedException
     */
    public void clickOnCountrySelector() throws InterruptedException{
        addCommonWait();
        selectCountry.click();
    }

    /**
     * This method is to click on Country Value from drop down
     * @throws InterruptedException
     */
    public void clickOnCountrySelectorValue() throws InterruptedException{
        addCommonWait();
        selectCountryValue.click();
    }

    /**
     *  * This method is to click on Sector Selector drop down
     * @throws InterruptedException
     */
    public void clickOnSectorSelector() throws InterruptedException{
        addCommonWait();
        selectSector.click();
    }

    /**
     * This method is to click on Country Selector drop down
     * @throws InterruptedException
     */
    public void clickOnSectorSelectorValue() throws InterruptedException{
        addCommonWait();
        selectSectorValue.click();
    }

    /**
     * This method is to enter the company ISIN
     * @throws InterruptedException
     */
    public void enterCompanyISIN(String companyISIN) throws InterruptedException{
        addCommonWait();
        sendKeys(enterISIN,companyISIN);
    }

    /**
     * This method is to enter the contact name
     * @throws InterruptedException
     */
    public void enterContactName(String contactName) throws InterruptedException{
        addCommonWait();
        sendKeys(enterContactName,contactName);
    }

    /**
     * This method is to click on Business Role drop down
     * @throws InterruptedException
     */
    public void clickOnBusinessRole() throws InterruptedException{
        addCommonWait();
        selectBusinessRole.click();
    }

    /**
     * This method is to click on Business Role value from drop down
     * @throws InterruptedException
     */
    public void clickOnBusinessRoleValue() throws InterruptedException{
        addCommonWait();
        selectBusinessRoleValue.click();
    }

    /**
     * This method is to click on Radio Button
     * @throws InterruptedException
     */
    public void clickOnRadio() throws InterruptedException{
        addCommonWait();
        tick.click();
    }

    /**
     * This method is to click on Register button
     * @throws InterruptedException
     */
    public void clickOnRegister() throws InterruptedException{
        addCommonWait();
        btnRegister.click();
    }


}

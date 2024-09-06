package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyEmail extends BasePage{

    @FindBy(xpath = "//input[@id='identifierId']")
    WebElement enterEmail;

    @FindBy(xpath = "//span[normalize-space()='Next']")
    WebElement clickNext;

    @FindBy(xpath = "//input[@name='Passwd']")
    WebElement enterPassword;

    @FindBy(xpath = "(//div[@class='Cp'])[1]")
    WebElement invitationEmail;

    @FindBy(xpath = "//a[normalize-space()='Register now']")
    WebElement btnRegisterNow;


    public VerifyEmail(WebDriver driver) {
        super(driver);
    }
    /**
     * This method is to enter Email for Login
     * @throws InterruptedException
     */
    public void enterEmailForLogin(String email) throws InterruptedException{
        addCommonWait();
        sendKeys(enterEmail,email);
        clickOnButton(clickNext);
    }
    /**
     * This method is to enter Password for Login
     * @throws InterruptedException
     */
    public void enterPasswordForLogin(String emailPassword) throws InterruptedException{
        addCommonWait();
        sendKeys(enterPassword,emailPassword);
        clickOnButton(clickNext);
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








}

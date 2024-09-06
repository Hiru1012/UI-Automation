package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PartnerSingleInvite extends BasePage{

    @FindBy(xpath = "//div[normalize-space()='partners']")
    WebElement partner;

    @FindBy(xpath = "//div[@class='MuiContainer-root MuiContainer-maxWidthLg css-cnms5y-MuiContainer-root']")
    WebElement partnerHeading;

    @FindBy(xpath = "/html/body/div[1]/div/header/div/div[1]/div[2]/div/a[4]/div/div/div[2]")
    WebElement tabSuppliers;

    @FindBy(xpath = "//span[normalize-space()='Add/Invite']")
    WebElement addOrInvite;

    @FindBy(xpath = "//input[@name='companyName']")
    WebElement enterCompanyName;

    @FindBy(xpath = "//input[@name='email']")
    WebElement enterEmail;

    @FindBy(xpath = "//span[normalize-space()='Invite']")
    WebElement btnInvite;

    public PartnerSingleInvite(WebDriver driver) {
        super(driver);
    }

    /**
     * This method is to click on suppliers tab
     * @throws InterruptedException
     */
    public void clickOnSuppliersTab() throws InterruptedException{
        addCommonWait();
        clickOnButton(tabSuppliers);
    }

    /**
     * Click on the add/invite button
     * return the partner page
     * @throws InterruptedException
     */
    public void clickOnAddOrInviteButton() throws InterruptedException{
        if(addOrInvite.isDisplayed() == true){
            clickOnButton(addOrInvite);
            scrollInToView(enterCompanyName);
            addCommonWait();
        }
    }

    /**
     * This method is to enter the company name
     * @throws InterruptedException
     */
    public void enterCompanyName(String name) throws InterruptedException{
        addCommonWait();
        sendKeys(enterCompanyName,name);
    }

    /**
     * This method is to enter the email
     * @throws InterruptedException
     */
    public void enterEmail(String email) throws InterruptedException{
        addCommonWait();
        sendKeys(enterEmail,email);
    }

    /**
     * This method is to verify the Invite button
     * @throws InterruptedException
     */
    public void clickOnInviteButton() throws InterruptedException{
        addCommonWait();
        clickOnButton(btnInvite);
    }


}

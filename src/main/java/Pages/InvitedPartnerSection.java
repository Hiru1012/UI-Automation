package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InvitedPartnerSection extends BasePage{
    @FindBy(xpath = "//button[@id='mui-p-13118-T-Invited Partners']")
    WebElement invitedPartner;

    public InvitedPartnerSection(WebDriver driver) {
        super(driver);
    }

    public void moveToInvitedPartnerSection() throws InterruptedException{
        if(invitedPartner.isDisplayed()==true){
            clickOnButton(invitedPartner);
            addCommonWait();
        }
    }
}

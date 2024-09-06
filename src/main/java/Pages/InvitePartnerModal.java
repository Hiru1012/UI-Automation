package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InvitePartnerModal extends BasePage{

    @FindBy(xpath = "(//span[text()='Invite'])[2]")
    WebElement inviteButton;

    public InvitePartnerModal(WebDriver driver) {
        super(driver);
    }

    /**
     * This method is to confirm the invitation
     * @throws InterruptedException
     */
    public void SingleInviteModal() throws InterruptedException{
        addCommonWait();
        clickOnButton(inviteButton);
    }
}

package SmokeTests.corporate_other;

import Pages.PageFactory;
import Utilities.AllureListener;
import Utilities.DriverFactory;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({AllureListener.class})
public class TestSmokeSingleInvite extends DriverFactory {
    public static String userName = propertyFileReader.getProperty("config", "UserName");
    public static String password = propertyFileReader.getProperty("config", "Password");

    PageFactory pageFactory = new PageFactory();

    @BeforeTest
    private void OpenURL() {
        driver.get(url);
        pageFactory.init();
    }

    @Test(description = "Checking the Single invitation", priority = 1)
    @Description("Checking the single invite")
    @Feature("Single Invitation")
    public void SingleInvite() throws InterruptedException{
        PageFactory.loginPage.login(userName, password);
        //PageFactory.welcomeModal.clickSkipBtn();
        PageFactory.partnerSingleInvite.clickOnSuppliersTab();
        PageFactory.partnerSingleInvite.clickOnAddOrInviteButton();
        PageFactory.partnerSingleInvite.enterCompanyName("ExperienzTeam1");
        PageFactory.partnerSingleInvite.enterEmail("tempmailautomation@gmail.com");
        PageFactory.partnerSingleInvite.clickOnInviteButton();
        PageFactory.invitePartnerModal.SingleInviteModal();
    }


}

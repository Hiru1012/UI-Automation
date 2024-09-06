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
public class TestSmokeVerifyEmail extends DriverFactory {
    PageFactory pageFactory = new PageFactory();
    @BeforeTest
    private void OpenURL() {
        driver.get(emailURL);
        pageFactory.init();
    }

    @Test(description = "Verifying the single invite mail", priority = 1)
    @Description("Verify Single Invitation")
    @Feature("SingleInvitation")
    public void EmailVerification() throws InterruptedException{
        PageFactory.verifyEmail.enterEmailForLogin("tempmailautomation@gmail.com");
//        System.out.println("Please complete the CAPTCHA manually and press Enter.");
//        new Scanner(System.in).nextLine();
        PageFactory.verifyEmail.enterPasswordForLogin("Abc@1234");
        PageFactory.verifyEmail.clickOnInvitationEmail();
        PageFactory.verifyEmail.clickOnRegisterNow();
    }
}

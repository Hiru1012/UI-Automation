package SmokeTests.corporate_events;

import Pages.PageFactory;
import Utilities.AllureListener;
import Utilities.DriverFactory;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({AllureListener.class})
public class TestSmokeValidateCalender extends DriverFactory {


    public static String userName = propertyFileReader.getProperty("config", "UserName");
    public static String password = propertyFileReader.getProperty("config", "Password");
    public static String eventName = propertyFileReader.getProperty("config", "eventName");

    PageFactory pageFactory = new PageFactory();

    @BeforeTest
    private void OpenURL() {
        driver.get(url);
        pageFactory.init();
    }

    @Test(description = "Checking the calender Validation", priority = 5)
    @Description("Checking the calender Validation")
    @Feature("calender Validation")


    public void ValidateCalender() throws InterruptedException {
//        PageFactory.loginPage.login(userName, password);
//        PageFactory.eventManagement.clickOnSettings();
//        PageFactory.eventManagement.clickOnManageEvent();
        PageFactory.eventManagement.clickOnCreateEventButton();

        //capture the event name
        PageFactory.eventManagement.enterRandomEventName(eventName);
        PageFactory.eventManagement.enterDescription("This is an automation testing");
        PageFactory.eventManagement.clickOnCalendar();
        PageFactory.eventManagement.selectDate();
        PageFactory.eventManagement.clickOnOkayButton();
        PageFactory.eventManagement.endEventDate();
        PageFactory.eventManagement.selectEndEventDate();
        PageFactory.eventManagement.ClickOnOkayButton();
        PageFactory.eventManagement.clickOnCreateButton();
        PageFactory.eventManagement.clickOnCrossButton();
        PageFactory.eventManagement.EventSectionLogout();
        PageFactory.eventManagement.confirmEventSectionLogout();

    }
}

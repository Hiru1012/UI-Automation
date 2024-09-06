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
    public class TestSmokeCreateAndEditEvent extends DriverFactory {


        public static String userName = propertyFileReader.getProperty("config", "UserName");
        public static String password = propertyFileReader.getProperty("config", "Password");
        public static String eventName = propertyFileReader.getProperty("config", "eventName");

        PageFactory pageFactory = new PageFactory();

        @BeforeTest
        private void OpenURL() {
            driver.get(url);
            pageFactory.init();
        }

        @Test(description = "Checking the event creation", priority = 5)
        @Description("Checking the event creation")
        @Feature("EventCreation")


        public void CreateEvent() throws InterruptedException {
            PageFactory.loginPage.login(userName, password);
            PageFactory.eventManagement.clickOnSettings();
            PageFactory.eventManagement.clickOnManageEvent();
            PageFactory.eventManagement.clickOnCreateEventButton();

            //capture the event name
            PageFactory.eventManagement.enterRandomEventName(eventName);
            PageFactory.eventManagement.enterDescription("This is an automation testing");
            PageFactory.eventManagement.clickOnCreateButton();
            PageFactory.eventManagement.clickOnConfirmButton();
            PageFactory.eventManagement.clickOnCrossButton();



            // edit the created event

            PageFactory.eventManagement.hoverOverEventAndClickEdit();
            PageFactory.eventManagement.clickOnEditIcon();
            String editedEventName = "Automation Test1";
            PageFactory.eventManagement.clickOnEditEventName(editedEventName);
            PageFactory.eventManagement.editEventDescription("Testing 1");
            PageFactory.eventManagement.scrollIntoUpdateButton();
            PageFactory.eventManagement.clickOnUpdateButton();
            //search for the created event
            boolean isEventFound = PageFactory.eventManagement.searchEvent(editedEventName);
            //Assert.assertTrue(isEventFound, "Event not found");


        }
    }

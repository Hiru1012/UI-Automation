package SmokeTests.corporate_events;

import Pages.PageFactory;
import Utilities.DriverFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Utilities.AllureListener;

@Listeners({AllureListener.class})
public class TestSmokeSuiteRunner extends DriverFactory {

    // Instantiate individual test classes
    TestSmokeCreateAndEditEvent testSmokeCreateAndEditEvent = new TestSmokeCreateAndEditEvent();
    TestSmokeValidateCalender testSmokeValidateCalender = new TestSmokeValidateCalender();



    public void openURL() {
        driver = DriverFactory.getDriver();
        System.out.println(true);

        driver.get(url);
        System.out.println("Navigate to URL: " + url);

        PageFactory.init();
        System.out.println(true);


    }

    @Test(description = "Run all test cases in the suite in a specific order", priority = 1)
    public void runAllTests() throws InterruptedException {
        openURL();
        // Test case: Login with valid email and empty password
        testSmokeCreateAndEditEvent.CreateEvent();
        testSmokeValidateCalender.ValidateCalender();



    }
}

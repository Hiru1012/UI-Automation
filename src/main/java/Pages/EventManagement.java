package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Calendar;

public class EventManagement extends BasePage {

//    @FindBy(xpath = "//span[text()='Event']")
//    WebElement pageHeader;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/header/div/div[4]/div/button")
    WebElement dropdown;


    @FindBy(xpath = "/html/body/div[2]/div[3]/div[5]/a")
    WebElement manageEvent;
    //click on the event section in the dropdown

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[1]/div[1]/div/div[1]/button")
    WebElement createEventButton;
    //clicking on the +create event  button

    @FindBy(xpath = "//input[@name='name']")
    WebElement enterEventName;

    @FindBy(xpath = "//textarea[@name='description']")
    WebElement enterDescription;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[3]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/form/div/div[3]/div/div/div/div[8]/div/input")
    WebElement clickOnCalendar;

    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div[1]/div/div[2]/div/div[2]/div/div[2]/div/div[3]/div[4]/button")
    WebElement selectDate;

    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div[2]/button[2]")
    WebElement clickOnOkayButton;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[3]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/form/div/div[3]/div/div/div/div[10]/div/input")
    WebElement endEventDate;

    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div[1]/div/div[2]/div/div[2]/div/div[2]/div/div[1]/div[5]/button")
    WebElement selectEndEventDate;

    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div[2]/button[2]")
    WebElement ClickOnOkayButton;

    @FindBy(xpath = "//span[text()='Create']")
    WebElement createButton;

    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div[3]/button[1]")
    WebElement btnConfirm;


    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[3]/div[1]/button")
    WebElement btnCross;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[1]/div[1]/div/div[2]/div[2]/div/input")
    WebElement searchBarText;

    @FindBy(xpath = "//table//td[2]//p")
    WebElement getText;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[1]/div[1]/div/div[2]/div[2]/div/div[2]/div/svg")
    WebElement btnSearchCross;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/header/div/div[4]/div/button/span[1]")
    WebElement configurationIcon;


    @FindBy(xpath = "/html/body/div[2]/div[3]/div[5]/a")
    WebElement eventSection;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div[1]/table/tbody/tr[1]")
    WebElement firstUserRow;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div[1]/table/tbody/tr[1]/td[4]/div/div/button")
    WebElement btneditIcon;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[3]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/form/div/div[3]/div/div/div/div[2]/div/input")
    WebElement btnEditEventName;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[3]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/form/div/div[3]/div/div/div/div[4]/div/textarea")
    WebElement updateEventDescription;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnUpdate;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[1]/div[1]/div/div[2]/div[2]/div/input")
    WebElement searchBar;


    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/header/div/div[5]/div/button")
    WebElement EventSectionLogout;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div[2]/button")
    WebElement confirmEventSectionLogout;

    public EventManagement(WebDriver driver) {
        super(driver);
    }

    public void clickOnSettings() throws InterruptedException {
        addCommonWait();
        clickOnButton(dropdown);
    }

    /**
     * This for click on the create event button
     *
     * @throws InterruptedException
     */
    @Step
    public void clickOnManageEvent() throws InterruptedException {
        addCommonWait();
        clickOnButton(manageEvent);
    }


    /**
     * Click on the create event button
     *
     * @return create event page
     * @throws InterruptedException
     */
    public void clickOnCreateEventButton() throws InterruptedException {
        addCommonWait();
        addCommonWait();
        clickOnButton(createEventButton);
    }

    /**
     * This method is for enter the event name
     *
     * @return
     */
    @Step
    public String enterRandomEventName(String s) throws InterruptedException {
        addCommonWait();
        String randomEventName = genarateRandomEventName();
        sendKeys(enterEventName, randomEventName);
        return randomEventName;
    }

    public void enterEventName(String qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq) throws InterruptedException {
        addCommonWait();
        clickOnButton(enterEventName);

    }


    private String genarateRandomEventName() {

        String baseName = "Automation";
        int randomNum = (int) (Math.random() * 10000);// generates a random number between 0 and 9999
        return baseName + randomNum;

    }

    /**
     * This method is for enter the event description
     */
    @Step
    public void enterDescription(String description) throws InterruptedException {
        addCommonWait();
        sendKeys(enterDescription, description);
    }

    /**
     * This for click on the create event button
     *
     * @throws InterruptedException
     */

    public void clickOnCalendar() throws InterruptedException {
        addCommonWait();
        clickOnButton(clickOnCalendar);
    }

    public void selectDate() throws InterruptedException {
        addCommonWait();
        clickOnButton(selectDate);
    }

    public void clickOnOkayButton() throws InterruptedException {
        addCommonWait();
        clickOnButton(clickOnOkayButton);
    }

    public void endEventDate() throws InterruptedException {
        addCommonWait();
        clickOnButton(endEventDate);
    }

    public void selectEndEventDate() throws InterruptedException {
        addCommonWait();
        clickOnButton(selectEndEventDate);
    }

    public void ClickOnOkayButton() throws InterruptedException {
        addCommonWait();
        clickOnButton(ClickOnOkayButton);
    }


    @Step
    public void clickOnCreateButton() throws InterruptedException {
        addCommonWait();
        clickOnButton(createButton);
    }

    /**
     * This method is to search an event
     */
    @Step
    public void clickOnConfirmButton() throws InterruptedException {
        addCommonWait();
        clickOnButton(btnConfirm);
    }


    @Step
    public void clickOnCrossButton() throws InterruptedException {
        addCommonWait();
        clickOnButton(btnCross);
    }


//    @Step
//    public boolean verifyHeader(String actualValue) throws InterruptedException {
//        return verifyPageHeader(pageHeader, actualValue);
//    }


    public void hoverOverEventAndClickEdit() throws InterruptedException {
        //addCommonWait();
        addCommonWait();
        //scrollInToView(firstUserRow);
        moveToElement(firstUserRow);  // Hover over the user
        addCommonWait();
    }

    public void clickOnEditIcon() throws InterruptedException {
        addCommonWait();
        addCommonWait();
        clickOnButton(btneditIcon);

    }


    public void clickOnEditEventName(String name) throws InterruptedException {
        addCommonWait();
        addCommonWait();
        sendKeys(btnEditEventName, name);


    }

    /**
     * * This method is to click on Search User Group value
     *
     * @throws InterruptedException
     */
    public void editEventDescription(String name) throws InterruptedException {
        addCommonWait();
        addCommonWait();
        sendKeys(updateEventDescription, name);


    }

    public void scrollIntoUpdateButton() throws InterruptedException {
        scrollInToView(btnUpdate);
        addCommonWait();
    }

    public void clickOnUpdateButton() throws InterruptedException {

        addCommonWait();
        clickOnButton(btnUpdate);

    }


    public boolean searchEvent(String name) throws InterruptedException {
        addCommonWait();

        clickOnButton(searchBarText);
        sendKeys(searchBarText, name);

        //wait for the search results to be displayed
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(getText));

        //Retrieve the text of the first event in the search results
        String text = getTextValue(getText);
        addCommonWait();
        addCommonWait();

        //Compare the text with the expected event name
        return text.equals(name);

    }

    public void clickOnRandomEventName() {
    }

    public void EventSectionLogout() throws InterruptedException {

        addCommonWait();
        clickOnButton(EventSectionLogout);

    }

    public void confirmEventSectionLogout() throws InterruptedException {

        addCommonWait();
        clickOnButton(confirmEventSectionLogout);

    }






}


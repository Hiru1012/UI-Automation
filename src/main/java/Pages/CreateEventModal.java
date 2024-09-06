//package Pages;
//
//import io.qameta.allure.Step;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//
//public class CreateEventModal extends BasePage{
//
//    @FindBy(xpath = "(//span[text()='Create'])[2]")
//    WebElement createButton;
//
//    @FindBy(xpath = "//h2[text()='Confirm Creation']")
//    WebElement pageHeader;
//
//    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div[3]/div[1]/button")
//    WebElement btnCancel;
//
//    public CreateEventModal(WebDriver driver) {
//        super(driver);
//    }
//
//    /**
//     * This for click on the create event button
//     * @throws InterruptedException
//     */
//    @Step
//    public void clickOnCreateButtonModal() throws InterruptedException {
//        clickOnButton(createButton);
//    }
//
//
//    /**
//     * This for click on the cancel button
//     * @throws InterruptedException
//     */
//    @Step
//    public void clickOnCancelButtonModal() throws InterruptedException {
//        clickOnButton(btnCancel);
//    }
//}

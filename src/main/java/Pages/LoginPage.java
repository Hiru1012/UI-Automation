package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "/html/body/div/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/form/div[1]/div[1]/div/input")
    private WebElement clickOnBtnEmail;

    @FindBy(xpath = "/html/body/div/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/form/div[1]/div[2]/div/input")
    private WebElement clickOnBtnPassword;

    @FindBy(xpath = "/html/body/div/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/form/button")
    private WebElement logInBtn;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/header/div/div[5]/div/button")
    private WebElement clickOnLogoutBtn;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div[2]/button")
    private WebElement clickOnLogout;

    @FindBy(xpath = "/html/body/div/div[2]/div/div/div/div/div")
    private WebElement errorMessageElement;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Step("Entering the email: {0}")
    public void enterEmail(String email) throws InterruptedException {
        sendKeys(clickOnBtnEmail, email);
    }

    @Step("Entering the password")
    public void enterPassword(String password) throws InterruptedException {
        sendKeys(clickOnBtnPassword, password);
    }

    @Step("Clicking on the login button")
    public void clickLoginButton() throws InterruptedException {
        clickOnButton(logInBtn);
    }

    @Step("Logging in with email: {0} and password: {1}")
    public DashboardSection login(String email, String password) throws InterruptedException {
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
        addCommonWait();
        addCommonWait();
        addCommonWait();
        return new DashboardSection(driver);
    }

    @Step("Clicking on the logout button in the dashboard")
    public void clickLogoutButton() throws InterruptedException {
        addCommonWait();
        clickOnButton(clickOnLogoutBtn);
    }

    @Step("Confirming the logout action")
    public void confirmLogout() throws InterruptedException {
        addCommonWait();
        clickOnButton(clickOnLogout);
    }

    @Step("Logging out of the dashboard")
    public void logout() throws InterruptedException {
        addCommonWait();
        addCommonWait();
        clickLogoutButton();
        confirmLogout();
    }

    @Step("Getting the error message")
    public String getErrorMessage() {
        return errorMessageElement.getText();
    }

    @Step("Checking if error message element is visible")
    public boolean isErrorMessageVisible() {
        return errorMessageElement.isDisplayed();
    }

    public boolean isLoginFailed() {


        return false;
    }

}

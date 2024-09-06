// Supplier_Login.java
package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Supplier_Login extends BasePage {

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[1]/div[2]/div/div/div/div/div/div/div/div/form/div[1]/div[1]/div/input")
    private WebElement emailInput;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[1]/div[2]/div/div/div/div/div/div/div/div/form/div[1]/div[2]/div/input")
    private WebElement passwordInput;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[1]/div[2]/div/div/div/div/div/div/div/div/form/button")
    private WebElement loginButton;

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[3]/button[1]")
    private WebElement JoyrisdeSkipButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/header/div/div[4]/span/div/div/button")
    private WebElement logoutButton;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/div[2]/button")
    private WebElement confirmLogoutButton;

//    @FindBy(xpath = "//div[@class='error-message']")
//    private WebElement errorMessageElement;




    private final WebDriverWait wait;

    public Supplier_Login(WebDriver driver) {
        super(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust the timeout as needed
    }

    @Step("Entering the email: {0}")
    public void enterEmail(String email) throws IllegalArgumentException, InterruptedException {

        sendKeys(emailInput, email);
    }

    @Step("Entering the password")
    public void enterPassword(String password) throws InterruptedException {
        sendKeys(passwordInput, password);
    }

    @Step("Clicking on the login button")
    public void clickLoginButton() throws InterruptedException {
        clickOnButton(loginButton);
    }

    @Step("Logging in with email: {0} and password: {1}")
    public void SupplierLogin(String email, String password) throws InterruptedException {
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
        addCommonWait();
        addCommonWait();
        addCommonWait();
        new DashboardSection(driver);
    }

    @Step("Clicking on skip button")
    public void clickSkipBtn() throws InterruptedException {
        addCommonWait();
        clickOnButton(JoyrisdeSkipButton);
    }

    @Step("Clicking on the logout button in the dashboard")
    public void clickLogoutButton() throws InterruptedException {
        addCommonWait();
        clickOnButton(logoutButton);
    }

    @Step("Confirming the logout action")
    public void confirmLogout() throws InterruptedException {
        addCommonWait();
        clickOnButton(confirmLogoutButton);
    }

    @Step("Logging out of the dashboard")
    public void logout() throws InterruptedException {
        addCommonWait();
        addCommonWait();
        clickLogoutButton();
        confirmLogout();
    }


    public boolean isLoginFailed() {


        return false;
    }


}


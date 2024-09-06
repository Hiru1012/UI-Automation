package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class DashboardSection extends BasePage {
    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/header/div/div[4]/div/button")
    WebElement configurationIcon;

    @FindBy(xpath = "/html/body/div[2]/div[3]/div[3]/a")
    WebElement btnDashboard;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[1]/button\n")
    WebElement btnCreateNewDashboard;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/form/div[1]/div/input")
    WebElement inputEnterTitle;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/form/div[2]/div[2]/div/div[1]")
    WebElement inputDescription;


    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/form/div[3]/button[1]\n")
    WebElement btnCreateView;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/form/div[3]/button[2]")
    WebElement btnCancel;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[3]/div/div/div[2]/div/button[2]")
    WebElement btnedit;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[1]/button[1]")
    WebElement btnEditDashboardDetails;


    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[1]/button[2]")
    WebElement btnSaveChanges;


    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[3]/div/div/div[2]/div/button[1]")
    WebElement btndelete;

    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div[3]/button[1]")
    WebElement confirmDelete2;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/header/div/div[5]/div/button")
    WebElement dashboardLogOut;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div[2]/button")
    WebElement dashboardConfirmLogout;


    public DashboardSection(WebDriver driver) {
        super(driver);
    }

    /**
     * Click on the configuration icon
     *
     * @throws InterruptedException
     */
    public void clickOnConfigurationIcon() throws InterruptedException {
        addCommonWait();
        clickOnButton(configurationIcon);

    }

    /**
     * Click on the Users section
     *
     * @throws InterruptedException
     */

    public void clickOnDashboards() throws InterruptedException {
        addCommonWait();
        addCommonWait();
        addCommonWait();
        clickOnButton(btnDashboard);

    }

    public void clickOnCreateDashboard() throws InterruptedException {
        addCommonWait();
        addCommonWait();
        clickOnButton(btnCreateNewDashboard);

    }

    public void clickOnEnterTitle(String name ) throws InterruptedException {
        addCommonWait();
        //addCommonWait();
      sendKeys(inputEnterTitle, name);

    }

    public void clickOnEnterDescription(String name ) throws InterruptedException {
        addCommonWait();
        addCommonWait();
        sendKeys(inputDescription, name);

    }

    public void scrollIntoCreateView() throws InterruptedException {
        addCommonWait();
        addCommonWait();
        scrollUntilVisible(btnCreateView);

    }
//
    public void clickOnCreateView() throws InterruptedException {
        addCommonWait();
        clickOnButton(btnCreateView);
    }

    public void clickOnCancelView() throws InterruptedException {
        addCommonWait();
        addCommonWait();
        clickOnButton(btnCancel);
        addCommonWait();
    }

    public void clickOnEditButton() throws InterruptedException {
        addCommonWait();
        clickOnButton(btnedit);

    }


    public void clickOnEditDashboardDetails() throws InterruptedException {
        addCommonWait();
        clickOnButton(btnEditDashboardDetails);

    }

    public void editDashboardForm(String additionalTitle, String additionalDescription) throws InterruptedException {
        addCommonWait();
        inputEnterTitle.sendKeys(additionalTitle);
        inputDescription.sendKeys(additionalDescription);
        clickOnCreateView();
    }

    public void clickOnSaveChanges() throws InterruptedException {
        addCommonWait();
        addCommonWait();
        //addCommonWait();
        clickOnButton(btnSaveChanges);

    }


    public void clickOnDeleteButton() throws InterruptedException {
        addCommonWait();
        addCommonWait();
        clickOnButton(btndelete);
        addCommonWait();

    }


    public void clickOnDeleteButton2() throws InterruptedException {
        addCommonWait();
        clickOnButton(confirmDelete2);
        addCommonWait();

    }

    public void dashboardLogOut() throws InterruptedException {
        addCommonWait();
        clickOnButton(dashboardLogOut);
        addCommonWait();

    }

    public void dashboardConfirmLogout() throws InterruptedException {
        addCommonWait();
        clickOnButton(dashboardConfirmLogout);
        addCommonWait();

    }

    public void logOut() {
    }

    // Utility method to generate a random string
    private String generateRandomString() {
        int length = 5;
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(rnd.nextInt(characters.length())));
        }
        return sb.toString();
    }

    public void createRandomDashboard() throws InterruptedException {
        String randomString = generateRandomString();
        String title = "Summary View " + randomString;
        String description = "This is the summary dashboard " + randomString;
        clickOnEnterTitle(title);
        clickOnEnterDescription(description);
        scrollIntoCreateView();
        clickOnCreateView();
    }



    public void deleteDashboard() throws InterruptedException {
        clickOnDeleteButton();
    }

    public boolean isTitleErrorMessageDisplayed() {


        return false;
    }
}



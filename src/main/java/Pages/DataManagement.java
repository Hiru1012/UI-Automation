package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DataManagement extends BasePage {

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/header/div/div[4]/div/button")
    WebElement configurationIcon;

    @FindBy(xpath = "/html/body/div[2]/div[3]/div[4]/a")
    WebElement dataSection;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div/div/div[1]/div/div[1]/div/button")
    WebElement uploadESGData;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/form/div[1]/div/div/div/div/div")
    WebElement selectdataFileTypeDropdown;

    @FindBy(xpath = "/html/body/div[4]/div[3]/ul/li[1]")
    WebElement selectFileType;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/form/div[2]/button")
    WebElement btnDownloadKPISheet;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/form/div[3]/div[1]/div/textarea[1]")
    WebElement enterDescription;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/form/div[3]/div[2]/div/div/div/div/input")
    WebElement hiddenFileInput;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/form/div[4]/button[1]")
    WebElement btnuploadFile;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[4]/button[1]")
    WebElement btnContinue;
    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/div/div/div/div[1]/div[2]/div/div/div/div/table/tbody/tr[1]")
    WebElement firstDataRow;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/div/div/div/div[1]/div[2]/div/div/div/div/table/tbody/tr[1]/td[4]/div/div/a")
    WebElement firstDataDownloadIcon;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/div/div/div/div[1]/div[2]/div/div/div/div/table/tbody/tr[1]/td[4]/div/div/button")
    WebElement deleteIcon;

    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div[3]/button[1]")
    WebElement btnConfirmDelete;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/header/div/div[5]/div/button")
    WebElement btnLogOut;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div[2]/button")
    WebElement btnConfirmLogout;



    public DataManagement(WebDriver driver) {
        super(driver);
    }

    public void clickOnConfigurationIcon() throws InterruptedException {
        addCommonWait();
        clickOnButton(configurationIcon);
    }

    public void clickOnData() throws InterruptedException {
        addCommonWait();
        clickOnButton(dataSection);
    }

    public void clickOnUploadESGData() throws InterruptedException {
        addCommonWait();
        clickOnButton(uploadESGData);
    }

    @Step
    public void clickOnDataFileType() throws InterruptedException {
        addCommonWait();
        clickOnButton(selectdataFileTypeDropdown);
    }

    public void clickOnSelectFileType() throws InterruptedException {
        addCommonWait();
        selectFileType.click();
    }

    public void clickOnDownloadKPISheet() throws InterruptedException {
        addCommonWait();
        clickOnButton(btnDownloadKPISheet);
    }

    public void enterDescription(String description) throws InterruptedException {
        addCommonWait();
        sendKeys(enterDescription, description);
    }

    public void scrollToFileUpload() throws InterruptedException {
        addCommonWait();
        scrollInToView(hiddenFileInput);
    }

    public void uploadFile(String filePath) throws InterruptedException {
        addCommonWait();
        hiddenFileInput.sendKeys(filePath);
    }

    public void clickOnbtnUpload() throws InterruptedException {
        addCommonWait();
        clickOnButton(btnuploadFile);
    }

    public void clickOnContinueBtn() throws InterruptedException {
        addCommonWait();
        clickOnButton(btnContinue);
    }

    public void hoverOverDataAndClickDownload() throws InterruptedException {
        addCommonWait();
        scrollInToView(firstDataRow); // Ensure the element is in view
        Actions actions = new Actions(driver);
        actions.moveToElement(firstDataRow).perform(); // Hover over the first data row
        addCommonWait();
    }

    public void clickOnDownload() throws InterruptedException {
        addCommonWait();
        scrollInToView(firstDataDownloadIcon); // Ensure the download icon is in view
        clickOnButton(firstDataDownloadIcon);
    }


    public void hoverOverDataAndClickDelete() throws InterruptedException {
        addCommonWait();
        scrollInToView(firstDataRow); // Ensure the element is in view
        Actions actions = new Actions(driver);
        actions.moveToElement(firstDataRow).perform(); // Hover over the first data row
        addCommonWait();
    }

    public void clickOnDelete() throws InterruptedException {
        addCommonWait();
        moveToElement(firstDataRow);
        clickOnButton(deleteIcon);
    }

    public void clickOnConfirmDelete() throws InterruptedException {
        addCommonWait();
        addCommonWait();
        addCommonWait();
        clickOnButton(btnConfirmDelete);
    }

    public void clickOnButtonLogout() throws InterruptedException {
        addCommonWait();
        addCommonWait();
        clickOnButton(btnLogOut);
    }

    public void clickOnButtonConfirmLogout() throws InterruptedException {
        addCommonWait();
        clickOnButton(btnConfirmLogout);
    }



}

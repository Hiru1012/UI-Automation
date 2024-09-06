package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.Random;

public class ManufactureOfGoods extends BasePage {

    @FindBy(xpath = "/html/body/div[1]/div[2]/header/div/div[3]/div/div/div/input")
    WebElement SelectCustomer;

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[2]")
    WebElement SelectSpecificCustomer;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[1]/div/div/div/div[2]/button")
    WebElement BtnNewSubmission;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[2]/p[2]")
    WebElement BtnEnterESGData;

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[3]/button[1]")
    WebElement JoyrideSkipButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[2]/div/div/div/input")
    WebElement SelectEventOrPeriod;

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[1]") // Locator for the 'GPR' event
    WebElement SelectSpecificEvent;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[3]/div/div/div[1]/label/span[1]/input")
    WebElement checkbox;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[1]/div/div/div/div[2]/div/div/div/label[1]/span[1]/span[1]/input")
    WebElement radioBtn1;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[2]/div/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[1]/div/div/div[2]/div/div/div/div/input")
    WebElement InputProductName;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[2]/div/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[2]/div/div/div[2]/div[1]/div/div/div/input")
    WebElement InputQuantity;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[2]/div/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[3]/div/div/div[2]/div/div/div/div/input")
    WebElement InputEmissionFactor;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[2]/div/div[2]/button[1]")
    WebElement BtnSave;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[2]/div/div[2]/button[2]")
    WebElement BtnSubmit;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/div[3]/button[1]")
    WebElement BtnConfirmSubmit;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[2]/div/div[1]/button")
    WebElement BtnClearSection;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/div[3]/button[1]")
    WebElement BtnClearSection2;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[1]/div/div/div/div[2]/div/div/div/label[2]/span[1]/span[1]/input")
    WebElement BtnOption2RadioButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[2]/div/div/div/div[2]/div/div/div/label[1]/span[1]/span[1]/input")
    WebElement BtnOption2RadioButton2;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[3]/div/div/div/div[2]/div/div/div/input")
    WebElement InputScope1Emissions;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[4]/div/div/div/div[2]/div/div/div/input")
    WebElement InputScope2Emissions;


    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[5]/div/div/div/div[2]/div/div/div/input")
    WebElement PercentageOfEmissions;


    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[6]/div/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[1]/div/div/div[2]/div/div/div/div/input")
    WebElement ProductNameScenario2;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[6]/div/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[2]/div/div/div[2]/div[1]/div/div/div/input")
    WebElement InputProductQuantity;

 @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[7]/div/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[1]/div/div/div[2]/div/div/div/div/div/input")
 WebElement InputMaterialName;

 @FindBy(xpath = "/html/body/div[3]/div/ul/li[1]")
 WebElement InputMaterialNameType;


 @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[7]/div/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[2]/div/div/div[2]/div/div/div/div/div/input")
 WebElement RecycledDropdown;

 @FindBy(xpath = "/html/body/div[3]/div/ul/li[1]")
 WebElement RecycledType;

 @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[7]/div/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[3]/div/div/div[2]/div/div/div/div/input")
 WebElement Quantity3;

 @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[8]/div/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[1]/div/div/div[2]/div/div/div/div/input")
 WebElement InputWasteLandfill;

 @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[8]/div/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[2]/div/div/div[2]/div/div/div/div/div/input")
 WebElement WasteTypeDropdown;

 @FindBy(xpath = "/html/body/div[3]/div/ul/li[1]")
 WebElement WasteType;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[9]/div/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[1]/div/div/div[2]/div/div/div/div/input")
    WebElement QtyOfMaterial;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[9]/div/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[2]/div/div/div[2]/div/div/div/div/input")
    WebElement OneWayDistanceFromSupplier;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[9]/div/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[3]/div/div/div[2]/div/div/div/div/div/input")
    WebElement ModeOfTranspotation;

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[1]")
    WebElement TranspotationType;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[9]/div/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[4]/div/div/div[2]/div/div/div/div/div/input")
    WebElement InputFuel;

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[1]")
    WebElement FuelType;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[9]/div/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[5]/div/div/div[2]/div/div/div/div/input")
    WebElement SupplierPostcode;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[9]/div/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[6]/div/div/div[2]/div/div/div/div/input")
    WebElement SupplierCountry;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[10]/div/div/div/div[2]/div/div/div/input")
    WebElement ValueOfGoods;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[2]/div/div[2]/button[1]")
    WebElement BtnSave2;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[2]/div/div[2]/button[1]")
    WebElement BtnConfirm;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[2]/div/div[1]/button")
    WebElement ButtonClearSection;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/div[3]/button[2]")
    WebElement BtnCancel;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[2]/div/div[2]/button[1]")
    WebElement BtnConfirmClearSection;

    @FindBy(xpath = "/html/body/div[1]/div[2]/header/div/div[4]/span/div/div/button")
    WebElement Supplier_logout;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[2]/div/div[2]/button[1]")
    WebElement Supplier_logoutconfirm;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[1]/div/div/div/div[2]/div/div/div/label[2]/span[1]/span[1]/input")
    WebElement btnCalculateCarbonEmission;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[2]/div/div/div/div[2]/div/div/div/label[2]/span[1]/span[1]/input")
    WebElement btnCalculateScopeEmissions;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[1]/div/div/div[2]/div/div/div/div/input")
    WebElement inputProductName;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[2]/div/div/div[2]/div[1]/div/div/div/input")
    WebElement inputQuantity;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[4]/div/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[1]/div/div/div[2]/div/div/div/div/div/input")
    WebElement inputMaterialName;

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[1]")
    WebElement SelectMaterialType;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[4]/div/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[2]/div/div/div[2]/div/div/div/div/div/input")
    WebElement inputRecycledStatus;

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[1]")
    WebElement recycledStatusType;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[4]/div/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[3]/div/div/div[2]/div/div/div/div/input")
    WebElement inputQuantity3;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[5]/div/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[1]/div/div/div[2]/div/div/div/div/input")
    WebElement WasteQty;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[5]/div/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[2]/div/div/div[2]/div/div/div/div/div/input")
    WebElement inputWaste;

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[1]")
    WebElement inputWasteType;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[6]/div/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[1]/div/div/div[2]/div/div/div/div/input")
    WebElement qtyOfMaterialTransported;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[6]/div/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[2]/div/div/div[2]/div/div/div/div/input")
    WebElement inputOneWayDistance;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[6]/div/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[3]/div/div/div[2]/div/div/div/div/div/input")
    WebElement inputModeOfTransportation;

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[1]")
    WebElement transpotationType;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[6]/div/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[4]/div/div/div[2]/div/div/div/div/div/input")
    WebElement inputFuelType;

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[1]")
    WebElement FuelType3;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[6]/div/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[5]/div/div/div[2]/div/div/div/div/input")
    WebElement supplierPostalCode;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[6]/div/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[6]/div/div/div[2]/div/div/div/div/input")
    WebElement supplierCountry;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[4]/div[3]/div/form/div/div[3]/div[7]/div/div/div/div[2]/div/div/div/input")
    WebElement inputGBPValue;


    public ManufactureOfGoods(WebDriver driver) {
        super(driver);
    }

    public void CustomerDropdown() throws InterruptedException {

        addCommonWait();
        SelectCustomer.click(); // Click to open the dropdown
        addCommonWait();
        SelectSpecificCustomer.click();

    }

    public void clickOnBtnNewSubmission() throws InterruptedException {
        addCommonWait();
        BtnNewSubmission.click();
    }

    public void clickOnBtnEnterESGData() throws InterruptedException {
        addCommonWait();
        BtnEnterESGData.click();
    }

    public void clickOnJoyride() throws InterruptedException {
        addCommonWait();
        JoyrideSkipButton.click();
    }

    public void SelectEventOrPeriod() throws InterruptedException {
        addCommonWait();
        SelectEventOrPeriod.click(); // Click to open the dropdown
        addCommonWait();
        SelectSpecificEvent.click(); // Click on the 'GPR' event
    }

    public void ClickOnCheckbox() throws InterruptedException {
        addCommonWait();
        checkbox.click();
    }

    public void ClickOnRadioBtn1() throws InterruptedException {
        addCommonWait();
        radioBtn1.click();
    }

    public void ProductName() throws InterruptedException {
        addCommonWait();
        Random random = new Random();
        String[] names = {"bottles", "plastic bags", "Cans", "Tins", "Paper"};
        String randomName = names[random.nextInt(names.length)];
        InputProductName.clear();
        InputProductName.sendKeys(String.valueOf(randomName));

    }

    public void Quantity() throws InterruptedException {
        addCommonWait();
        Random random = new Random();
        int randomNumber = random.nextInt(10000);
        InputQuantity.clear();
        InputQuantity.sendKeys(String.valueOf(randomNumber));

    }

    public void  scrollIntoClearButton() throws InterruptedException {
        scrollInToView(BtnClearSection);
        addCommonWait();
        addCommonWait();
    }

    public void EmissionFactor() throws InterruptedException {
        addCommonWait();
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        InputEmissionFactor.clear();
        InputEmissionFactor.sendKeys(String.valueOf(randomNumber));

    }

    public void Buttonsave() throws InterruptedException {
        addCommonWait();
        BtnSave.click();
    }

    public void ButtonSubmit() throws InterruptedException {
        addCommonWait();
        BtnSubmit.click();
    }

    public void ButtonSubmit2() throws InterruptedException {
        addCommonWait();
        BtnConfirmSubmit.click();
    }


    public void ButtonClear() throws InterruptedException {
        addCommonWait();
        BtnClearSection.click();
    }

    public void ButtonClear2() throws InterruptedException {
        addCommonWait();
        BtnClearSection2.click();
    }

    public void  RadioButton2() throws InterruptedException {
        addCommonWait();
        BtnOption2RadioButton.click();
    }

    public void  RadioButton3() throws InterruptedException {
        addCommonWait();
        BtnOption2RadioButton2.click();
    }

    public WebElement Scope1Emissions() throws InterruptedException {
        addCommonWait();
        Random random = new Random();
        int randomNumber = random.nextInt(100000);
        InputScope1Emissions.clear();
        InputScope1Emissions.sendKeys(String.valueOf(randomNumber));


        return null;
    }

    public void  scrollIntoScope2Emissions() throws InterruptedException {
        scrollInToView(InputScope2Emissions);
        addCommonWait();
        addCommonWait();
    }

    public WebElement Scope2Emissions() throws InterruptedException {
        addCommonWait();
        Random random = new Random();
        int randomNumber = random.nextInt(100000);
        InputScope2Emissions.clear();
        InputScope2Emissions.sendKeys(String.valueOf(randomNumber));

        return null;
    }

    public void  InputPercentageOfEmissions() throws InterruptedException {
        addCommonWait();
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        PercentageOfEmissions.clear();
        PercentageOfEmissions.sendKeys(String.valueOf(randomNumber));

    }


    public void ProductName2() throws InterruptedException {
        addCommonWait();
        Random random = new Random();
        String[] names = {"bottles", "plastic bags", "Cans", "Tins", "Paper"};
        String randomName = names[random.nextInt(names.length)];
        ProductNameScenario2.clear();
        ProductNameScenario2.sendKeys(String.valueOf(randomName));

    }

    public WebElement QuantityScenario2() throws InterruptedException {
        addCommonWait();
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        InputProductQuantity.clear();
        InputProductQuantity.sendKeys(String.valueOf(randomNumber));

        return null;
    }

    public void  scrollIntoMaterialName() throws InterruptedException {
        scrollInToView(InputMaterialName);
        addCommonWait();
        addCommonWait();
    }


public void MaterialName() throws InterruptedException {

    addCommonWait();
    InputMaterialName.click(); // Click to open the dropdown
    addCommonWait();
    InputMaterialNameType.click(); // Click on the 'GPR' event
}

    public void RecycleType() throws InterruptedException {

        addCommonWait();
        RecycledDropdown.click(); // Click to open the dropdown
        addCommonWait();
        RecycledType.click(); // Click on the 'GPR' event
    }

    public WebElement Quantity3Scenario() throws InterruptedException {
        addCommonWait();
        Random random = new Random();
        int randomNumber = random.nextInt(10000);
        Quantity3.clear();
        Quantity3.sendKeys(String.valueOf(randomNumber));

        return null;
    }

    public void  Waste() throws InterruptedException {
        addCommonWait();
        Random random = new Random();
        int randomNumber = random.nextInt(1000);
        InputWasteLandfill.clear();
        InputWasteLandfill.sendKeys(String.valueOf(randomNumber));

    }


    public void Waste_Type() throws InterruptedException {

        addCommonWait();
        WasteTypeDropdown.click(); // Click to open the dropdown
        addCommonWait();
        WasteType.click(); // Click on the 'GPR' event
    }

    public void  MaterialQtyTransported() throws InterruptedException {
        addCommonWait();
        Random random = new Random();
        int randomNumber = random.nextInt(1000);
        QtyOfMaterial.clear();
        QtyOfMaterial.sendKeys(String.valueOf(randomNumber));

    }

    public WebElement DistanceFromSupplier() throws InterruptedException {
        addCommonWait();
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        OneWayDistanceFromSupplier.clear();
        OneWayDistanceFromSupplier.sendKeys(String.valueOf(randomNumber));

        return null;
    }

    public void Transpotation() throws InterruptedException {

        addCommonWait();
        ModeOfTranspotation.click(); // Click to open the dropdown
        addCommonWait();
        TranspotationType.click(); // Click on the 'GPR' event
    }

    public void Fuel() throws InterruptedException {

        addCommonWait();
        InputFuel.click(); // Click to open the dropdown
        addCommonWait();
        FuelType.click(); // Click on the 'GPR' event
    }

    public void  Supplier_Postcode() throws InterruptedException {
        addCommonWait();
        Random random = new Random();
        int randomNumber = random.nextInt(10000);
        SupplierPostcode.clear();
        SupplierPostcode.sendKeys(String.valueOf(randomNumber));

    }


    public void Supplier_Country() throws InterruptedException {
        addCommonWait();
        Random random = new Random();
        String[] names = {"United Kingdom", "USA", "Srilanka", "India", "China"};
        String randomName = names[random.nextInt(names.length)];
        SupplierCountry.clear();
        SupplierCountry.sendKeys(String.valueOf(randomName));

    }

    public WebElement ValueOf_Goods() throws InterruptedException {
        addCommonWait();
        Random random = new Random();
        int randomNumber = random.nextInt(100000);
        ValueOfGoods.clear();
        ValueOfGoods.sendKeys(String.valueOf(randomNumber));

        return null;
    }


    public void Buttonsave2() throws InterruptedException {
        addCommonWait();
        addCommonWait();
        addCommonWait();
        BtnSave2.click();
    }


    public void Button_Clear() throws InterruptedException {
        addCommonWait();
        addCommonWait();
        ButtonClearSection.click();
    }

    public void Button_Clear2() throws InterruptedException {
        addCommonWait();
        addCommonWait();
        ButtonClearSection.click();
    }




    public void Button_Cancel() throws InterruptedException {
        addCommonWait();
        addCommonWait();
        BtnCancel.click();
    }

    public void Button_Submit() throws InterruptedException {
        addCommonWait();
        addCommonWait();
        BtnConfirmClearSection.click();
    }

    public void Supplier_Logout() throws InterruptedException {
        addCommonWait();
        addCommonWait();
        addCommonWait();
        Supplier_logout.click();
    }

    public void Supplier_LogoutConfirm() throws InterruptedException {
        addCommonWait();
        addCommonWait();
        Supplier_logoutconfirm.click();
    }

    public void CalculateCarbonEmission() throws InterruptedException {
        addCommonWait();
        clickOnButton(btnCalculateCarbonEmission);
    }

    public void CalculateScopeEmissions() throws InterruptedException {
        addCommonWait();
        clickOnButton(btnCalculateScopeEmissions);
    }

    public void inputProductName() throws InterruptedException {
        addCommonWait();
        Random random = new Random();
        String[] names = {"bottles", "plastic bags", "Cans", "Tins", "Paper"};
        String randomName = names[random.nextInt(names.length)];
        inputProductName.clear();
        inputProductName.sendKeys(String.valueOf(randomName));

    }

    public WebElement inputQuantity() throws InterruptedException {
        addCommonWait();
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        inputQuantity.clear();
        inputQuantity.sendKeys(String.valueOf(randomNumber));

        return null;
    }

    public void  inputMaterialName() throws InterruptedException {
        scrollInToView(inputMaterialName);
        addCommonWait();
        addCommonWait();
    }


    public void inputMaterialName3() throws InterruptedException {

        addCommonWait();
        inputMaterialName.click(); // Click to open the dropdown
        addCommonWait();
        SelectMaterialType.click(); // Click on the 'GPR' event
    }

    public void inputRecycledStatus() throws InterruptedException {

        addCommonWait();
        inputRecycledStatus.click(); // Click to open the dropdown
        addCommonWait();
        recycledStatusType.click(); // Click on the 'GPR' event
    }

    public WebElement inputQuantity3() throws InterruptedException {
        addCommonWait();
        Random random = new Random();
        int randomNumber = random.nextInt(10000);
        inputQuantity3.clear();
        inputQuantity3.sendKeys(String.valueOf(randomNumber));

        return null;
    }

    public WebElement WasteQty() throws InterruptedException {
        addCommonWait();
        Random random = new Random();
        int randomNumber = random.nextInt(10000);
        WasteQty.clear();
        WasteQty.sendKeys(String.valueOf(randomNumber));

        return null;
    }


    public void Waste_Type3() throws InterruptedException {

        addCommonWait();
        inputWaste.click(); // Click to open the dropdown
        addCommonWait();
        inputWasteType.click(); // Click on the 'GPR' event
    }

    public void  qtyOfMaterialTransported() throws InterruptedException {
        addCommonWait();
        Random random = new Random();
        int randomNumber = random.nextInt(1000);
        qtyOfMaterialTransported.clear();
        qtyOfMaterialTransported.sendKeys(String.valueOf(randomNumber));

    }

    public WebElement inputOneWayDistance() throws InterruptedException {
        addCommonWait();
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        inputOneWayDistance.clear();
        inputOneWayDistance.sendKeys(String.valueOf(randomNumber));

        return null;
    }

    public void inputModeOfTransportation() throws InterruptedException {

        addCommonWait();
        inputModeOfTransportation.click(); // Click to open the dropdown
        addCommonWait();
        transpotationType.click(); // Click on the 'GPR' event
    }

    public void inputFuelType() throws InterruptedException {

        addCommonWait();
        inputFuelType.click(); // Click to open the dropdown
        addCommonWait();
        FuelType3.click(); // Click on the 'GPR' event
    }

    public void  supplierPostalCode() throws InterruptedException {
        addCommonWait();
        Random random = new Random();
        int randomNumber = random.nextInt(10000);
        supplierPostalCode.clear();
        supplierPostalCode.sendKeys(String.valueOf(randomNumber));

    }


    public void supplierCountry() throws InterruptedException {
        addCommonWait();
        Random random = new Random();
        String[] names = {"United Kingdom", "USA", "Srilanka", "India", "China"};
        String randomName = names[random.nextInt(names.length)];
        supplierCountry.clear();
        supplierCountry.sendKeys(String.valueOf(randomName));

    }

    public WebElement inputGBPValue() throws InterruptedException {
        addCommonWait();
        Random random = new Random();
        int randomNumber = random.nextInt(100000);
        inputGBPValue.clear();
        inputGBPValue.sendKeys(String.valueOf(randomNumber));

        return null;
    }

}
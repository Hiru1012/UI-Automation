/*
 * Project: dynamedics-test-automation
 * Created Date: Thursday March 31st 2022
 * Author: pabeywickrama
 * -----
 * Last Modified: Tuesday May 10th 2022 4:55:19 pm
 * Modified By: pabeywickrama at pabeywickrama@mitrai.com
 * -----
 * Copyright (c) 2022 Mitra Sparks
 * -----
 * HISTORY:
 */
package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class OrganizationHealthPage extends BasePage {

    @FindBy(xpath = "//h4[contains(@class,'MuiTypography-root MuiTypography-h4 MuiTypography-gutterBottom')]")
    WebElement pageHeader;

    @FindBy(xpath = "//*[local-name()='svg' and @data-testid='TuneIcon']/*[local-name()='path']")
    WebElement filterButton;

    @FindBy(xpath = "//*[local-name()='svg' and @data-testid='ArrowDropDownIcon']/*[local-name()='path']")
    WebElement arrowDropDownButton;

    @FindBy(xpath = "//input[contains(@class,'MuiOutlinedInput-input MuiInputBase-input MuiInputBase-inputAdornedEnd MuiAutocomplete-input MuiAutocomplete')]")
    WebElement textFieldLocation;

    @FindBy(xpath = "//*[local-name()='svg' and @data-testid='CloseIcon']/*[local-name()='path']")
    WebElement closeButton;

    @FindBy(xpath = "//div[@role='presentation']//following::li")
    List<WebElement> selectValue;

    @FindBy(xpath = "//li[@id='mui-42739-option-1']")
    WebElement selectValueOne;

    @FindBy(xpath = "//span[text()='Apply Filter']")
    WebElement applyFilterButton;

    @FindBy(xpath = "//p[text()='Physical And Emotional Wellbeing']//following::strong")
    WebElement physicalAndEmotionalWellbeing;

    @FindBy(xpath = "//p[text()='Environment And Ways Of Working']//following::strong")
    WebElement environmentAndWaysOfWorking;

    @FindBy(xpath = "//p[text()='Career Wellbeing']//following::strong")
    WebElement careerWellbeing;

    @FindBy(xpath = "//p[text()='Leadership And Culture']//following::strong")
    WebElement leadershipAndCulture;

    @FindBy(xpath = "//p[text()='Rewards And Benefits']//following::strong")
    WebElement rewardsAndBenefits;

    @FindBy(xpath = "//span[text()='Organisational Health By Diversity']")
    WebElement organisationHealthHeader;

    @FindBy(xpath = "//span[text()='Organisational Health By Department']")
    WebElement organisationDepartmentHeader;

    @FindBy(xpath = "//div[@id='Department']")
    WebElement dropDownUnderOrganizationHealth;

    @FindBy(xpath = "//div[@id='Department']//following::li")
    WebElement dropDownUnderOrganizationHealthValue;

    @FindBy(xpath = "(//*[local-name()='svg']/*[local-name()='g'])[1]")
    WebElement summerySectionGraph;

    @FindBy(xpath = "(//*[local-name()='svg']/*[local-name()='g'])[3]")
    WebElement polygon;

    @FindBy(xpath = "(//*[local-name()='svg' and @data-testid='TuneIcon']/*[local-name()='path']//..//..//..//..)[1]")
    WebElement selectedDepartmentText;

    @FindBy(xpath = "//span[contains(text(),' (Previous)')]")
    WebElement getPreviousText;

    @FindBy(xpath = "//input[@type='checkbox']//following::span[1]")
    WebElement getRedioButton;


    public OrganizationHealthPage(WebDriver driver) {
        super(driver);
    }

    /**
     * This method is use for  verify the page header
     *
     * @param actualValue value that we can see in the page load
     * @return true or false base on the results
     * @throws InterruptedException
     */
    @Step
    public boolean verifyHeader(String actualValue) throws InterruptedException {
        if (verifyPageHeader(pageHeader, actualValue) == true) {
            return true;
        }
        return false;
    }

    @Step
    public void clickOnFilter() throws InterruptedException {
        clickOnButton(filterButton);
        //Thread.sleep(6000);
        addCommonWait();
    }

    @Step
    public int getListSize() {
        textFieldLocation.click();
        List<WebElement> list = selectValue;
        int size = list.size();
        return size;
    }

    @Step
    public void clickOnApplyButton() throws InterruptedException {
        addCommonWait();
        clickOnButton(applyFilterButton);
    }


    @Step
    public ArrayList getValuesBefourApplyFilter() {
        String getPhysicalAndEmotionalWellbeing = getTextValue(physicalAndEmotionalWellbeing);
        String getEnvironmentAndWaysOfWorking = getTextValue(environmentAndWaysOfWorking);
        String getCareerWellbeing = getTextValue(careerWellbeing);
        String getLeadershipAndCulture = getTextValue(leadershipAndCulture);
        String getRewardsAndBenefits = getTextValue(rewardsAndBenefits);

        ArrayList listBefoureAddFilter = new ArrayList();
        listBefoureAddFilter.add(getPhysicalAndEmotionalWellbeing);
        listBefoureAddFilter.add(getEnvironmentAndWaysOfWorking);
        listBefoureAddFilter.add(getCareerWellbeing);
        listBefoureAddFilter.add(getLeadershipAndCulture);
        listBefoureAddFilter.add(getRewardsAndBenefits);
        return listBefoureAddFilter;
    }

    @Step
    public ArrayList getValuesAfterApplyFilter() {
        String getPhysicalAndEmotionalWellbeing = getTextValue(physicalAndEmotionalWellbeing);
        String getEnvironmentAndWaysOfWorking = getTextValue(environmentAndWaysOfWorking);
        String getCareerWellbeing = getTextValue(careerWellbeing);
        String getLeadershipAndCulture = getTextValue(leadershipAndCulture);
        String getRewardsAndBenefits = getTextValue(rewardsAndBenefits);

        ArrayList listAfterAddFilter = new ArrayList();
        listAfterAddFilter.add(getPhysicalAndEmotionalWellbeing);
        listAfterAddFilter.add(getEnvironmentAndWaysOfWorking);
        listAfterAddFilter.add(getCareerWellbeing);
        listAfterAddFilter.add(getLeadershipAndCulture);
        listAfterAddFilter.add(getRewardsAndBenefits);
        return listAfterAddFilter;
    }

    @Step
    public boolean verifyTheValuesInListAreChanging() {
        if (!getValuesBefourApplyFilter().equals(getValuesAfterApplyFilter())) {
            return true;
        } else
            return false;
    }

    @Step
    public boolean verifyOrganisationHealthHeader(String actualValue) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-850)", "");
        if (verifyPageHeader(organisationHealthHeader, actualValue) == true) {
            return true;
        }
        return false;
    }

    @Step
    public boolean verifyTheHeaderOrganisationDepartmentHeader(String actualValue) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,650)", "");
        if (verifyPageHeader(organisationDepartmentHeader, actualValue) == true) {
            return true;
        }
        return false;
    }

    @Step
    public boolean verifyTheHeaderOrganisationDivercityHeader(String actualValue) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,650)", "");
        if (verifyPageHeader(organisationHealthHeader, actualValue) == true) {
            return true;
        }
        return false;
    }

    @Step
    public void clickOnZCloseButton() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(closeButton).perform();
        action.click().perform();

    }

    @Step
    public String getDropDownValues() throws InterruptedException {

        String getDropDownValue = getTextValue(dropDownUnderOrganizationHealth);
        return getDropDownValue;
    }

    @Step
    public void clickOnDropDownAfterVerify() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,750)", "");
        //scrollInToView(dropDownUnderOrganizationHealth);
        addCommonWait();
        clickOnButton(dropDownUnderOrganizationHealth);
        addCommonWait();
        clickOnButton(dropDownUnderOrganizationHealthValue);
    }

    /**
     * This method used to verify the graph is creating in summery section when we change the filter
     *
     * @return true or false base on the result
     * @throws InterruptedException
     */
    @Step
    public boolean verifyGraphInSummery() throws InterruptedException {
        if (verifyGraphVisibility(summerySectionGraph) == true) {
            return true;
        } else
            return false;
    }

    /**
     * This method used to verify the Polygon is creating in Organisational Health By Department section when we change
     * the filter
     *
     * @return true or false base on the result
     * @throws InterruptedException
     */
    @Step
    public boolean verifyPolygon() throws InterruptedException {
        addCommonWait();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,550)", "");
        if (verifyGraphVisibility(polygon) == true) {
            scrollInToView(pageHeader);
            return true;
        } else
            return false;
    }

    /**
     * This method is used to verify the data are changing when we change the department dropdown values check graph are
     * visible and the selected drop down value is equal to the Organisational Health By Department dropdown value
     *
     * @return true or false base on the results
     * @throws InterruptedException
     */
    @Step
    public boolean verifyTheValuesAreChangingInPage() throws InterruptedException {
        ArrayList getListBefourList = getValuesBefourApplyFilter();
        clickOnFilter();
        textFieldLocation.click();
        List<WebElement> list = selectValue;
        for (int i = 0; i < list.size(); i++) {
        selectDropDownValue(selectValue,i);
        clickOnApplyButton();
        String department[] = getSelectedDepartment().split("-", 2);
        String valueOFDepartment = department[1].replaceFirst(" ", "");
        ArrayList getListAfterList = getValuesAfterApplyFilter();
        if (!getListBefourList.equals(getListAfterList)) {
            verifyGraphInSummery();
            clickOnDropDownAfterVerify();
            String getDropDownValue = getTextValue(dropDownUnderOrganizationHealth);
            if (valueOFDepartment.equals(getDropDownValue)) {
                //clickOnButton(getRedioButton);
                verifyPolygon();
                clickOnFilter();
                textFieldLocation.click();
                clickOnZCloseButton();
            } else {
                break;
            }
        } else {
            break;
        }
    }
        return true;
    }

    public String getSelectedDepartment() {
        String department = getTextValue(selectedDepartmentText);
        return department;
    }
}






/*
 * Project: dynamedics-test-automation
 * Created Date: Thursday March 31st 2022
 * Author: pabeywickrama
 * -----
 * Last Modified: Tuesday May 10th 2022 4:55:42 pm
 * Modified By: pabeywickrama at pabeywickrama@mitrai.com
 * -----
 * Copyright (c) 2022 Mitra Sparks
 * -----
 * HISTORY:
 */

package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomeModal extends BasePage {

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div/div/div/div[2]/div/button")
    WebElement skipButton;
    @FindBy(xpath = "//div[@title='experienz']//following::span[1]")
    WebElement pageHeader;

    public WelcomeModal(WebDriver driver) {
        super(driver);
    }

    @Step
    public void  clickSkipBtn() throws InterruptedException {
        addCommonWait();

//        if (verifyElementExists(skipButton) == true) {
//            clickOnButton(skipButton);
//        }

        /*Thread.sleep(600);*/
        clickOnButton(skipButton);

    }

    private boolean verifyElementExists(WebElement skipButton) {
        if (skipButton.isDisplayed()) {
            return true;
        }
        return false;
    }

    @Step
    public boolean verifyHeader(String actualValue) throws InterruptedException {

        if (verifyPageHeader(pageHeader, actualValue) == true) {
            return true;
        }
        return false;
    }

    @Step
    public long getStartTimeWelcomeModal() {
        long startTimeWelcomeModal = getStartTime();
        return startTimeWelcomeModal;

    }

}

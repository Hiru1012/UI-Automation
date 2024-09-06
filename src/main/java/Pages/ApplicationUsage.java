/*
 * Project: dynamedics-test-automation
 * Created Date: Tuesday July 26th 2022
 * Author: pabeywickrama
 * -----
 * Last Modified: Tuesday July 26th 2022 11:55:01 am
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

public class ApplicationUsage extends BasePage {

    @FindBy(xpath = "//h4[text()='Application Usage & Contribution']")
    WebElement pageHeader;


    public ApplicationUsage(WebDriver driver) {super(driver);}

    @Step
    public boolean verifyHeader(String actualValue) throws InterruptedException {

        if (verifyPageHeader(pageHeader, actualValue) == true) {
            return true;
        }
        return false;
    }
}

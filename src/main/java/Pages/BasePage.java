/*
 * Project: dynamedics-test-automation
 * Created Date: Monday April 25th 2022
 * Author: pabeywickrama
 * -----
 * Last Modified: Tuesday May 10th 2022 4:52:12 pm
 * Modified By: pabeywickrama at pabeywickrama@mitrai.com
 * -----
 * Copyright (c) 2022 Mitra Sparks
 * -----
 * HISTORY:
 */

package Pages;


import Utilities.PropertyFileReader;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class BasePage {


    public final WebDriver driver;

    PropertyFileReader propertyFileReader = new PropertyFileReader();
    public int time = Integer.parseInt(propertyFileReader.getProperty("config", "Longwait"));

    public BasePage(WebDriver driver) {
        this.driver = driver;

    }

    public void sendKeys(WebElement locator, String text) throws InterruptedException {
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(locator));
        locator.clear();
        locator.sendKeys(text);
    }

    public void clickOnButton(WebElement locator) throws InterruptedException {

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
            wait.until(ExpectedConditions.elementToBeClickable(locator));

        } catch (Exception e) {
            System.out.println(e);
        }
        locator.click();

    }

    @Step
    public void hoverOverElement(WebElement locator) throws InterruptedException {
        Actions actions = new Actions(driver);
        Thread.sleep(1000); // Wait for the edit button to appear
        if (locator.isDisplayed()) {
            clickOnButton(locator);
            scrollInToView(locator);
            addCommonWait();
        }
    }

    public String getPageHeader(WebElement locator) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
            wait.until(ExpectedConditions.visibilityOf(locator));
        } catch (Exception e) {
            System.out.println(e);

        }
        String header = locator.getText();
        return header;
    }

    public boolean verifyPageHeader(WebElement locator, String actualValue) throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
            wait.until(ExpectedConditions.visibilityOf(locator));
        } catch (Exception e) {
            System.out.println(e);

        }
        String getpageHeader = getPageHeader(locator);
        if (getpageHeader.equals(actualValue)) {
            return true;
        }
        return false;
    }

    public String getTextValue(WebElement locator) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
            wait.until(ExpectedConditions.visibilityOf(locator));
        } catch (Exception e) {
            System.out.println(e);

        }
        String header = locator.getText().toString();
        return header;
    }

    public boolean verifyText(WebElement locator, String actualValue) throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
            wait.until(ExpectedConditions.visibilityOf(locator));
        } catch (Exception e) {
            System.out.println(e);

        }
        String getTextValue = getTextValue(locator);
        if (getTextValue.equals(actualValue)) {
            return true;
        }
        return false;
    }

    public void addCommonWait() throws InterruptedException {
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        Thread.sleep(3000);

    }


    public void handelWindow() {
        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();
        Iterator<String> iterator = s.iterator();
        while (iterator.hasNext()) {

            String child = iterator.next();
            if (!parent.equals(child)) {
                driver.switchTo().window(child);

            }
        }

    }

    public long getStartTime() {
        long startTime = System.currentTimeMillis();
        return startTime;
    }

    public long getEndTime() {
        long endTime = System.currentTimeMillis();
        return endTime;
    }

    public long calculateTotalTime() {
        long totalTime =getEndTime()-getStartTime();
        return totalTime;

    }
    public void sendKeysAndHitEnter(WebElement locator, String text) throws InterruptedException {
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(locator));
        locator.clear();
        locator.sendKeys(text);
        locator.sendKeys(Keys.ENTER);
    }
    public void scrollInToView(WebElement locator) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", locator);
    }

    public boolean verifyGraphVisibility(WebElement locator) throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
            wait.until(ExpectedConditions.visibilityOf(locator));
        } catch (Exception e) {
            System.out.println(e);

        }
        if (locator.isDisplayed()) {
            return true;
        }
        return false;
    }

    public void selectDropDownValue(List<WebElement> locator,int index) {
        List<WebElement> list = locator;
            Actions action = new Actions(driver);
            action.moveToElement(list.get(index)).perform();
            action.click().perform();

    }

    public void moveToElement(WebElement locator) {
        Actions action = new Actions(driver);
        action.moveToElement(locator).perform();
    }

    public void scrollUntilVisible(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        int timeoutInSeconds = 0;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));

        while (true) {
            try {
                wait.until(ExpectedConditions.visibilityOf(element));
                break;
            } catch (TimeoutException e) {
                js.executeScript("window.scrollBy(0,250)", ""); // scroll down a bit
            }
        }
    }








    }



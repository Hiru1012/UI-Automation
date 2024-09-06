/*
 * Project: dynamedics-test-automation
 * Created Date: Tuesday May 31st 2022
 * Author: pabeywickrama
 * -----
 * Last Modified: Tuesday May 31st 2022 4:37:55 pm
 * Modified By: pabeywickrama at pabeywickrama@mitrai.com
 * -----
 * Copyright (c) 2022 Mitra Sparks
 * -----
 * HISTORY:
 */

package Utilities;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class AllureListener implements ITestListener {
    private static String getTestMethodName(ITestResult iTestResult) {
        return iTestResult.getMethod().getConstructorOrMethod().getName();

    }

    @Attachment
    public byte[] saveFailureScreenShot(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

    }

    @Attachment(value = "{0}", type = "text/plain")
    public static String saveTextLog(String message) {

        return message;
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("I as in onStart method" + iTestContext.getName());
        iTestContext.setAttribute("WebDriver", DriverFactory.getDriver());
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("I am in onFinish method" + iTestContext.getName());

    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("I am in onTestStart method" + iTestResult.getName() + "Start");

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("I am in onTestSuccess method" + getTestMethodName(iTestResult) + "Success");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("*** Test execution " + result.getMethod().getMethodName() + " failed...");
        System.out.println(result.getMethod().getMethodName() + " failed!");

        Object testClass = result.getInstance();
        WebDriver driver = DriverFactory.getDriver();

        if (driver instanceof WebDriver) {
            System.out.println("Screen shot captured for test case:" + getTestMethodName(result));
            saveFailureScreenShot(driver);
        }
        saveTextLog(getTestMethodName(result));

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("I am in onTestSkipped method" + getTestMethodName(iTestResult) + "Skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        System.out.println("I am in onTestFailedButWithSuccessPercentage method" + getTestMethodName(iTestResult));

    }

}

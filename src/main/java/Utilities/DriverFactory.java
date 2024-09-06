/*
 * Project: dynamedics-test-automation
 * Created Date: Thursday April 21st 2022
 * Author: pabeywickrama
 * -----
 * Last Modified: Tuesday May 10th 2022 4:55:53 pm
 * Modified By: pabeywickrama at pabeywickrama@mitrai.com
 * -----
 * Copyright (c) 2022 Mitra Sparks
 * -----
 * HISTORY:
 */

package Utilities;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverFactory {
    public static WebDriver driver;
    public static PropertyFileReader propertyFileReader = new PropertyFileReader();
    public static String browser = propertyFileReader.getProperty("config", "BROWSER");
    public static String url = propertyFileReader.getProperty("config", "Url");
    public static String supplierURL = propertyFileReader.getProperty("config", "supplierURL");
    public static String emailURL = propertyFileReader.getProperty("config", "emailURL");

    public static String partnerURL = propertyFileReader.getProperty("config", "partnerURL");

    @BeforeSuite
    public void setDrivers() {

        // Uses chrome driver by default
        if (browser == null) {
            ChromeDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        } else {

            switch (browser) {
                case "Chrome":
                    ChromeDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();

                    break;
                case "Headless":
                    ChromeDriverManager.chromedriver().setup();
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("--headless");
                    driver = new ChromeDriver(chromeOptions);

                    break;
                case "Firefox":
                    FirefoxDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                case "HeadlessFirefox":
                    FirefoxDriverManager.firefoxdriver().setup();
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    firefoxOptions.addArguments("--headless");
                    driver = new FirefoxDriver(firefoxOptions);
                    break;

                default:
                    ChromeDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
            }


        }
    }

    public static WebDriver getDriver() {
        driver.manage().window().maximize();
        return driver;
    }

    @AfterSuite
    public void TearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}

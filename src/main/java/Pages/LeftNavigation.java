///*
// * Project: dynamedics-test-automation
// * Created Date: Thursday June 9th 2022
// * Author: pabeywickrama
// * -----
// * Last Modified: Monday July 4th 2022 9:52:37 am
// * Modified By: pabeywickrama at pabeywickrama@mitrai.com
// * -----
// * Copyright (c) 2022 Mitra Sparks
// * -----
// * HISTORY:
// */
//
//package Pages;
//
//import org.asynchttpclient.request.body.multipart.Part;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//
//public class LeftNavigation extends BasePage{
//
//    @FindBy(xpath="//div[text()='Organisational Health']")
//    WebElement organizationHealth;
//
//    @FindBy(xpath="//div[text()='dashboard']")
//    WebElement dashBord;
//
//    @FindBy(xpath="/html/body/div[1]/div/header/div/div[3]/div/button")
//    WebElement btnSettings;
//
//    @FindBy(xpath="//div[text()='events']")
//    WebElement events;
//
//    @FindBy(xpath="//div[text()='partners']")
//    WebElement partners;
//
//    public LeftNavigation(WebDriver driver) {
//        super(driver);
//    }
//
//
////    /**
////     * Click on the organization health page
////     * @return organization health page
////     * @throws InterruptedException
////     */
////    public OrganizationHealthPage clickOnOranizationHealth() throws InterruptedException {
////        clickOnButton(organizationHealth);
////        return new OrganizationHealthPage(driver);
////    }
//
////    /**
////     * Click on the dash bord page
////     * @return  dash bord page
////     * @throws InterruptedException
////     */
////    public DashBordPage clickOnDashBord() throws InterruptedException {
////        clickOnButton(dashBord);
////        addCommonWait();
////        return new DashBordPage(driver);
////    }
//    /**
//     * Click on the settings icon
//     * @throws InterruptedException
//     */
//    public void clickOnSettings() throws InterruptedException{
//        clickOnButton(btnSettings);
//        addCommonWait();
//    }
//    /**
//     * Click on the event page
//     * @return  event page
//     * @throws InterruptedException
//     */
//    public EventPage clickOnEvents() throws InterruptedException{
//        clickOnButton(events);
//        addCommonWait();
//        return new EventPage(driver);
//    }
//
//    /**
//     * Click on the partners page
//     * @return  partners page
//     * @throws InterruptedException
//     */
//    public PartnerSingleInvite clickOnPartners() throws InterruptedException{
//        clickOnButton(partners);
//        addCommonWait();
//        return new PartnerSingleInvite(driver);
//    }
//
//
//}

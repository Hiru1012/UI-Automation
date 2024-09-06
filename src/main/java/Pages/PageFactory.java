/*
 * Project: dynamedics-test-automation
 * Created Date: Monday April 25th 2022
 * Author: pabeywickrama
 * -----
 * Last Modified: Tuesday May 10th 2022 4:55:29 pm
 * Modified By: pabeywickrama at pabeywickrama@mitrai.com
 * -----
 * Copyright (c) 2022 Mitra Sparks
 * -----
 * HISTORY:
 */
package Pages;

import Utilities.DriverFactory;
import io.netty.handler.codec.http.multipart.FileUpload;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class PageFactory extends org.openqa.selenium.support.PageFactory {

    public static WebDriver driver;
    public static LoginPage loginPage;
    public static WelcomeModal welcomeModal;
    //public static DashBordPage dashBordPage;
    public static OrganizationHealthPage organizationHealthPage;
    public static ApplicationUsage applicationUsage;
    public static PartnerSingleInvite partnerSingleInvite;
    public static InvitePartnerModal invitePartnerModal;
    public static InvitedPartnerSection invitedPartnerSection;
    public static VerifyEmail verifyEmail;
    public static PartnerRegistration partnerRegistration;


    public static DashboardSection dashboardSection;


    public static UserManagement userManagement;

    public static EventManagement eventManagement;

    public static DataManagement dataManagement;

    public static Supplier_Login supplier_login;

    public static ManufactureOfGoods manufactureOfGoods;


    @BeforeSuite
    public static void init() {
        driver = DriverFactory.getDriver();
        if (driver == null) {
            throw new IllegalStateException("Driver not initialized");
        }

        loginPage = PageFactory.initElements(driver, LoginPage.class);
        welcomeModal = PageFactory.initElements(driver, WelcomeModal.class);

        partnerSingleInvite=PageFactory.initElements(driver,PartnerSingleInvite.class);
        invitePartnerModal=PageFactory.initElements(driver,InvitePartnerModal.class);
        invitedPartnerSection=PageFactory.initElements(driver,InvitedPartnerSection.class);
        verifyEmail=PageFactory.initElements(driver,VerifyEmail.class);
        partnerRegistration=PageFactory.initElements(driver,PartnerRegistration.class);
        dashboardSection=PageFactory.initElements(driver, DashboardSection.class);
        userManagement=PageFactory.initElements(driver, UserManagement.class);
        eventManagement=PageFactory.initElements(driver, EventManagement.class);
        dataManagement=PageFactory.initElements(driver, DataManagement.class);
        supplier_login=PageFactory.initElements(driver,Supplier_Login.class);
        manufactureOfGoods=PageFactory.initElements(driver,ManufactureOfGoods.class);


    }
}

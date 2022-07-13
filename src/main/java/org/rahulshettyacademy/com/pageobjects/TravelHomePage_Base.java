package org.rahulshettyacademy.com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.rahulshettyacademy.com.base.DriverFactory;
import org.rahulshettyacademy.com.base.TestBase;
import org.rahulshettyacademy.com.pagecomponents.FooterNavigation;
import org.rahulshettyacademy.com.pagecomponents.HeaderNavigation;


/**
 * SRP - Single Responsibility Pattern
 * Super Class which will redirect to child classes
 */

public class TravelHomePage_Base extends TestBase {

    By footerElement=By.id("traveller-home");

    By headerElement=By.id("buttons");

    WebDriver driver;



    public HeaderNavigation getHeaderNavigationBar(){
        return new HeaderNavigation(DriverFactory.getInstance().getDriverThreadLocal(), headerElement);
    }

    public FooterNavigation getFooterNavigationBar(){
        return new FooterNavigation(DriverFactory.getInstance().getDriverThreadLocal(), footerElement);
    }


}

package org.rahulshettyacademy.com.pagecomponents;

import com.aventstack.extentreports.Status;
import org.apache.poi.ss.extractor.ExcelExtractor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.rahulshettyacademy.com.abstractcomponents.AbstractComponent;
import org.rahulshettyacademy.com.report.ExtentFactory;

public class HeaderNavigation extends AbstractComponent {

    By headerFlights = By.cssSelector("a[title='Flights'] > .text-label");
    By headerLinks = By.cssSelector("a");

    public HeaderNavigation(WebDriver driver, By headerElement) {
        super(driver, headerElement);
    }

    public void selectHeaderFlights() {
        findElement(headerFlights).getAttribute("class");
        ExtentFactory.getInstance().getExtent().log(Status.PASS, "Header class has been found; ");

    }

    public void getHeaderLinks() {
        findElements(headerLinks).size();
        ExtentFactory.getInstance().getExtent().log(Status.PASS, "Number of Header Links have been retrieved; ");
    }
}


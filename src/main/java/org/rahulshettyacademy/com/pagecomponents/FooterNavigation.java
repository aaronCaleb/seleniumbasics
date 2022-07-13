package org.rahulshettyacademy.com.pagecomponents;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.rahulshettyacademy.com.abstractcomponents.AbstractComponent;
import org.rahulshettyacademy.com.report.ExtentFactory;

public class FooterNavigation extends AbstractComponent {

    //method to handle flights
    //when selenium executes any method in this class -scope of selenium should be only in the footer navigation class

    WebDriver driver;


    By footerFlights=By.cssSelector("[title='Flights']");
    By footerLinks=By.cssSelector("a");

    //When you inherit a super class, you should invoke super class constructor in the child class (here)
    //super method will help to execute the super class
    public FooterNavigation(WebDriver driver, By footerElement) {
        super(driver, footerElement);
    }

    public void selectFooterFlights(){
       System.out.println(findElement(footerFlights).getAttribute("class"));
        ExtentFactory.getInstance().getExtent().log(Status.PASS, "Footer class has been found; ");
    }

    public void getFooterLinks(){
        System.out.println(findElements(footerLinks).size());
        ExtentFactory.getInstance().getExtent().log(Status.PASS, "Number of Footer Links retrieved; ");
    }
}

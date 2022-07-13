package testcases;

import org.rahulshettyacademy.com.base.TestBase;
import org.rahulshettyacademy.com.pageobjects.TravelHomePage_Base;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(org.rahulshettyacademy.com.utility.TestNGListeners.class)

public class HeaderElementNavigationTest_001 extends TestBase {

    @Test
    public void footerFlightsNavigationTest(){

        logger=extentReports.createTest("HeaderFlightsTest");
        TravelHomePage_Base travelHomePage_base=new TravelHomePage_Base();
        travelHomePage_base.getHeaderNavigationBar().selectHeaderFlights();
        travelHomePage_base.getHeaderNavigationBar().getHeaderLinks();

    }
}

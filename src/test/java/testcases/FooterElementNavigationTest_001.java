package testcases;

import com.aventstack.extentreports.Status;
import org.apache.poi.ss.formula.functions.T;
import org.rahulshettyacademy.com.base.TestBase;
import org.rahulshettyacademy.com.pageobjects.TravelHomePage_Base;
import org.rahulshettyacademy.com.report.ExtentFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(org.rahulshettyacademy.com.utility.TestNGListeners.class)

public class FooterElementNavigationTest_001 extends TestBase {

    @Test
    public void footerFlightsNavigationTest(){

        logger=extentReports.createTest("FooterFlightsTest");
        TravelHomePage_Base travelHomePage_base=new TravelHomePage_Base();
        travelHomePage_base.getFooterNavigationBar().selectFooterFlights();
        travelHomePage_base.getFooterNavigationBar().getFooterLinks();

    }
}

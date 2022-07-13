package testcases;

import org.openqa.selenium.By;
import org.rahulshettyacademy.com.base.TestBase;
import org.rahulshettyacademy.com.pageobjects.TravelHomePage_Base;
import org.testng.annotations.Test;

public class FlightBookingStrategyTest_001 extends TestBase {

    By sectionElement=By.id("flightSearchContainer");
    @Test
    public void flightBooking(){
        TravelHomePage_Base travelHomePage_base=new TravelHomePage_Base();
        travelHomePage_base.setBookingStrategy("roundTrip");


    }



}

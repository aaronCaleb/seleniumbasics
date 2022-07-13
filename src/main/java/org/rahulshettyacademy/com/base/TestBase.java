package org.rahulshettyacademy.com.base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.rahulshettyacademy.com.report.ExtentManager;
import org.rahulshettyacademy.com.utility.ReadConfigProperties;
import org.testng.annotations.*;

import java.time.Duration;

public class TestBase {

    BrowserFactory browserFactory=new BrowserFactory();
    public static ExtentReports extentReports;
    public static ExtentTest logger;

    @BeforeMethod
    public void launchBrowser() throws Exception {
        String browser= ReadConfigProperties.getPropertyValueByKey("browser");
        String url=ReadConfigProperties.getPropertyValueByKey("url");

        DriverFactory.getInstance().setDriverThreadLocal(browserFactory.createBrowserInstance(browser));

        DriverFactory.getInstance().getDriverThreadLocal().manage().window().maximize();
        DriverFactory.getInstance().getDriverThreadLocal().get(url);

        extentReports= ExtentManager.getExtentReport();
    }

    @AfterMethod
    public void tearDown(){
        DriverFactory.getInstance().closeBrowser();
        extentReports.flush();
    }
}

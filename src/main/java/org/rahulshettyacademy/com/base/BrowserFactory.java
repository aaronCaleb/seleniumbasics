package org.rahulshettyacademy.com.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;

public class BrowserFactory {

    //Create WebDriver Object for a given Browser;
    public WebDriver createBrowserInstance(String browser) throws MalformedURLException {

        RemoteWebDriver remoteDriver =null;

        if(browser.equalsIgnoreCase("Chrome")){
            WebDriverManager.chromedriver().setup();
           // System.setProperty("WebDriver.chrome.silenceOutput", "true");

            ChromeOptions options=new ChromeOptions();
            options.addArguments("--incognito");
            options.setAcceptInsecureCerts(true);
            options.setCapability("browserVersion", "103");
            options.setCapability("platformName", "Windows 11");
            remoteDriver=new ChromeDriver();

        } else if (browser.equalsIgnoreCase("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            remoteDriver=new FirefoxDriver();

        }else {
            WebDriverManager.edgedriver().setup();
            remoteDriver=new EdgeDriver();
        }

        return remoteDriver;
    }
}

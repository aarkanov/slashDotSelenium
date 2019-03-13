package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Driver extends BaseSetup {

    protected WebDriver webDriver;

    public Driver(String browser, String BaseUrl) throws MalformedURLException {
        super(browser, BaseUrl);
        this.webDriver = getWebDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor)webDriver;
        js.executeScript("return document.readyState").toString().equals("complete");
        webDriver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
        webDriver.manage().deleteAllCookies();
    }
}

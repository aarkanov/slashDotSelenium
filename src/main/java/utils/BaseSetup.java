package utils;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public abstract class BaseSetup {

    public static RemoteWebDriver webDriver = null;
    public String browser;
    public String BaseUrl;

    @Parameters({"browser", "BaseUrl"})
    public BaseSetup(String browser, String BaseUrl) {
        this.browser = browser;
        this.BaseUrl = BaseUrl;
        initBrowser(browser);
    }

    public static RemoteWebDriver getWebDriver() {
        return webDriver;
    }

    private RemoteWebDriver initBrowser(@Optional("chromelocal") String browser) {
        System.out.println("Testing on the following browser: " + browser);
        if (browser.contains("local")) {
            webDriver = new ChromeDriver();
            return webDriver;
        }
        return null;
    }
}

package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.util.*;

public class HomePage_UI extends Base_UI<HomePage_UI.HomePageUI_Objects>{

    public HomePage_UI(String browser, String BaseUrl) throws MalformedURLException {
        super(browser, BaseUrl);
        ui_elements = new HomePageUI_Objects();
        PageFactory.initElements(webDriver, getUi_elements());
    }

    public class HomePageUI_Objects extends Base_UI.PageObjects {
        @FindBy(xpath = "//*[@class='topic']/a/img")
        public List<WebElement> icons;
    }

    public void printUniqueIcons() {
        List<WebElement> iconList = webDriver.findElements(By.xpath("//*[@class='topic']/a/img"));
        LinkedHashSet<WebElement> uniqueIconList = new LinkedHashSet<>(iconList);
        for(WebElement uniqueIcon:uniqueIconList) {
            System.out.println(uniqueIcon.getAttribute("src")); }

        }
    }



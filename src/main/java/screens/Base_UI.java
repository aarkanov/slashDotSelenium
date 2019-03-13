package screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import utils.Driver;

import java.net.MalformedURLException;
import java.util.List;

public abstract class  Base_UI<T extends Base_UI.PageObjects> extends Driver {

    public T ui_elements;

    public T getUi_elements() {
        return ui_elements;
    }

    public Base_UI(String browser, String BaseUrl) throws MalformedURLException {
        super(browser, BaseUrl);
    }

    public class PageObjects {

        @FindBy(css = "#firehoselist>article")
        public List<WebElement> allArticles;

        @FindBy(id = "firehoselist")
        public List<WebElement> allStories;

    }

    public void navigateTo(String url) {
        webDriver.get(url);
    }


    public void quit() {
        webDriver.quit();
    }

    public void scrollToElement(WebElement element) {
        Actions actions = new Actions(webDriver);
        actions.moveToElement(element).perform();
    }

}

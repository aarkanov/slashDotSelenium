package screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.util.List;

public class PollPage_UI extends Base_UI<PollPage_UI.PollPage_UI_Objects> {

    public PollPage_UI(String browser, String BaseUrl) throws MalformedURLException {
        super(browser, BaseUrl);
        ui_elements = new PollPage_UI_Objects();
        PageFactory.initElements(webDriver, getUi_elements());
    }

    public class PollPage_UI_Objects extends Base_UI.PageObjects {
        @FindBy(xpath = "//*[@id=\"pollBooth\"]/label[1]/input")
        public WebElement firstRadioButton;

        @FindBy(xpath = "//*[@id=\"pollBooth\"]/div/button")
        public WebElement voteButton;

        @FindBy(xpath = "/html/body/section[1]/div[4]/div/div/div/div[1]/div/div[1]/div[2]")
        public WebElement firstResult;
    }
}

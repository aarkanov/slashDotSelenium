package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import screens.HomePage_UI;
import screens.PollPage_UI;
import java.net.MalformedURLException;


public class ID01_slashDotTests {

    String browser;
    String BaseUrl;

    @Parameters({"browser", "BaseUrl"})
    @BeforeClass
    public void setup(@Optional("chromelocal") String browser, @Optional("https://slashdot.org/") String BaseUrl) {
        this.browser = browser;
        this.BaseUrl = BaseUrl;
    }


    @Test
    public void a_NumberOfStories() throws MalformedURLException {
        HomePage_UI homePage_ui = new HomePage_UI(browser, BaseUrl);
        homePage_ui.navigateTo(BaseUrl);
        System.out.println("The number of stories for today is: " + homePage_ui.getUi_elements().allArticles.size());
        homePage_ui.quit();
        }

    @Test
    public void b_NumberOfIcons() throws MalformedURLException {
        HomePage_UI homePage_ui = new HomePage_UI(browser, BaseUrl);
        homePage_ui.navigateTo(BaseUrl);
        homePage_ui.printUniqueIcons();
        homePage_ui.quit();
    }

    @Test
    public void c_voteOnRandomPoleAndReturnNumberOfPeopleVoted() throws MalformedURLException {
        PollPage_UI pollPage_ui = new PollPage_UI(browser, BaseUrl);
        pollPage_ui.navigateTo(BaseUrl+"polls");
        pollPage_ui.getUi_elements().firstRadioButton.click();
        pollPage_ui.getUi_elements().voteButton.click();
        System.out.println("the number of people that voted for the same thing are: " + pollPage_ui.getUi_elements().firstResult.getText());
        pollPage_ui.quit();
    }


    }

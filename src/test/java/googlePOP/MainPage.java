package googlePOP;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MainPage extends BasePage{

    @FindBy(name = "q")
    WebElement searchInput;

    @FindBy(css = "button[data-ved]>div[role]")
    List<WebElement> gdprButtons;

    public MainPage() {
        PageFactory.initElements(driver, this);
    }

    public static MainPage open() {
        driver.get("https://www.google.com/");
        mainPage = new MainPage();
        return mainPage;
    }


    public MainPage declineGDPR() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        gdprButtons.get(2).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.invisibilityOf(gdprButtons.get(2)));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return this;
    }

    public void searchFor(String text) {
        searchInput.sendKeys(text + Keys.ENTER);
        allResultsPage = new AllResultsPage();
    }
}

import googlePOP.BasePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {

    @BeforeClass
    public void setupBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        BasePage.driver = new ChromeDriver(options);
        BasePage.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterClass
    public void tearDown() {
        BasePage.driver.quit();
    }
}

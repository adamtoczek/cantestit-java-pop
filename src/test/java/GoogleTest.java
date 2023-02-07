import googlePOP.MainPage;
import org.testng.annotations.Test;

import static googlePOP.BasePage.*;
import static org.testng.Assert.assertTrue;


public class GoogleTest extends BaseTest {

//    @Test
//    public void shouldReturnInFirstResult() {
//        driver.get("https://www.google.com/");
//
//        List<WebElement> gdprButtons = driver.findElements(By.cssSelector("button[data-ved]>div[role]"));
//        gdprButtons.get(2).click();
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
//        wait.until(ExpectedConditions.invisibilityOf(gdprButtons.get(2)));
//
//        WebElement searchInput = driver.findElement(By.name("q"));
//        searchInput.sendKeys("cantestit"+ Keys.ENTER);
//
//        String firstTitle =  driver.findElement(By.cssSelector("#rso>div:first-of-type div.g div.g h3")).getText();
//
//        assertTrue(firstTitle.contains("CanTest IT"));
//    }

    @Test
    public void googlePOPTest() {
        MainPage.open();
        mainPage.declineGDPR().searchFor("cantestit");
//        mainPage.searchFor("cantestit");
        assertTrue(allResultsPage.getFirstResultTitle().contains("CanTest IT"));
    }
}

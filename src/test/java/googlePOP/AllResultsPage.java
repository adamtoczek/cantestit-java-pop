package googlePOP;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllResultsPage extends BasePage{

    @FindBy(css = "#rso>div:first-of-type div.g div.g h3")
    WebElement firstTitle;

    public AllResultsPage() {
        PageFactory.initElements(driver, this);
    }

    public String getFirstResultTitle() {
        return firstTitle.getText();
    }
}

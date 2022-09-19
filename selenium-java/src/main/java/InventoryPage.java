import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class InventoryPage extends BasePage {

    private static final By INVENTORY_LIST = By.cssSelector("inventory_list");

    public InventoryPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isLoaded() {
        return getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(INVENTORY_LIST)).isDisplayed();
    }
}

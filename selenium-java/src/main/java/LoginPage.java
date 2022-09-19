import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private static final By USERNAME = By.id("user-name");
    private static final By PASSWORD = By.id("password");
    private static final By LOGIN_BUTTON = By.id("login-button");

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void open() {
        getWebDriver().get("https://www.saucedemo.com/");
    }

    public boolean isLoaded() {
        return findElement(USERNAME).isDisplayed();
    }

    public InventoryPage login(String username, String password) {
        fillTextInElement(USERNAME, username);
        fillTextInElement(PASSWORD, password);
        click(LOGIN_BUTTON);
        return new InventoryPage(getWebDriver());
    }
}

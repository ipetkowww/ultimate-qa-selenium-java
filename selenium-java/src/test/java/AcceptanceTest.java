import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class AcceptanceTest {

    private WebDriver webDriver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }

    @Test
    public void shouldOpen() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.open();
        assertTrue(loginPage.isLoaded());
    }

    @Test
    public void shouldLogin() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.open();
        assertTrue(loginPage.isLoaded());

        InventoryPage inventoryPage = loginPage.login("standard_user", "secret_sauce");
        assertTrue(inventoryPage.isLoaded());
    }

    @After
    public void tearDown() {
        webDriver.quit();
    }
}

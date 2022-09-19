import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {

    private final WebDriver webDriver;
    private final WebDriverWait wait;

    protected BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        wait = new WebDriverWait(getWebDriver(), Duration.ofSeconds(10));
    }

    protected WebElement findElement(By locator) {
        return webDriver.findElement(locator);
    }

    protected void fillTextInElement(By locator, String text) {
        findElement(locator).clear();
        findElement(locator).sendKeys(text);
    }

    protected void click(By locator) {
        findElement(locator).click();
    }

    protected WebDriver getWebDriver() {
        return webDriver;
    }

    protected WebDriverWait getWait() {
        return wait;
    }
}

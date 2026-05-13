package selenium.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
        driver.manage().window().maximize();

        driver.findElement(By.id("reveal")).click();

        WebDriverWait wb = new WebDriverWait(driver, Duration.ofSeconds(20));
        wb.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("revealed")))).click();

        driver.findElement(By.id("revealed")).sendKeys("Test Data");
    }
}

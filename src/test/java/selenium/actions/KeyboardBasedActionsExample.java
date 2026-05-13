package selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyboardBasedActionsExample {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='✕']")).click();
        WebElement textBox = driver.findElement(By.name("q"));

        Actions a = new Actions(driver);
        a.moveToElement(textBox)
                .click(textBox)
                .keyDown(Keys.SHIFT)
                .sendKeys("tshirt")
                .pause(Duration.ofSeconds(5))
                .keyUp(Keys.SHIFT)
                .sendKeys(Keys.ENTER)
                .perform();
    }
}

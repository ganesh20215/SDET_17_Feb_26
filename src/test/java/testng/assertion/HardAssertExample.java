package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {

    @Test
    public void verifySauceDemoHomePage() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
        WebElement e1 = driver.findElement(By.xpath("//div[text()='Swag Labs']"));
        WebElement e2 = driver.findElement(By.xpath("//span[text()='Products']"));
        Assert.assertTrue(e1.isSelected());
        Assert.assertTrue(e2.isDisplayed());
        driver.close();
    }
}

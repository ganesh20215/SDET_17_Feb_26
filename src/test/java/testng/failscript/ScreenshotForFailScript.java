package testng.failscript;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotForFailScript implements ITestListener {

    public static WebDriver driver;

    @AfterMethod
    public void onTestFailure(ITestResult result) {
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(f, new File("D:\\classes\\Screenshot"+ timestamp + ".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        driver.close();
    }

    @Test
    public void testZ() throws InterruptedException {
        SoftAssert sf = new SoftAssert();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
        WebElement e1 = driver.findElement(By.xpath("//div[text()='Swag Labs']"));
        WebElement e2 = driver.findElement(By.xpath("//span[text()='Products']"));
        sf.assertTrue(e1.isSelected(), "swag labs validation");
        sf.assertTrue(e2.isSelected(), "Products validation");
        sf.assertAll();

    }

    @Test
    public void testAB() throws InterruptedException {
        SoftAssert sf = new SoftAssert();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
        WebElement e1 = driver.findElement(By.xpath("//div[text()='Swag Labs']"));
        WebElement e2 = driver.findElement(By.xpath("//span[text()='Products']"));
        sf.assertAll();

    }

}

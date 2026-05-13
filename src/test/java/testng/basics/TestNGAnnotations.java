package testng.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotations {
    public static WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }

    @Test
    public void t1(){
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
    }

    @Test
    public void t2(){
        driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();
    }

}

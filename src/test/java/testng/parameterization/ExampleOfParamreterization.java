package testng.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ExampleOfParamreterization {
    public static WebDriver driver;

    @Parameters({"browserName"})
    @BeforeMethod
    public void setup(String browserName) {
        if (browserName.equalsIgnoreCase(browserName)) {
            driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();
        }
    }


    @Parameters({"username", "password"})
    @Test
    public void verifySauceLabLogin(String username, String password) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
        driver.close();
    }
}

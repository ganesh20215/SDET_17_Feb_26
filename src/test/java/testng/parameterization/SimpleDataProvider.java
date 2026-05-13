package testng.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SimpleDataProvider {

    @DataProvider(name = "test-data")
    public Object[][] getDataProviderFunction() {
        return new Object[][]{{"standard_user", "secret_sauce"}, {"standard_user", "test"},
                {"test", "secret_sauce"}, {"test", "test"}
        };
    }


    @Test(dataProvider = "test-data")
    public void verifySauceLabLogin(String username, String password) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
    }
}

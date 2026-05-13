package testng.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FirstProgramWithTestNG {

    @Test(enabled = false)
    public void testLetsCodeIt() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        driver.close();
    }

    @Parameters({"", ""})
    @Test
    public void testEdso() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.edso.in");
        driver.manage().window().maximize();
        driver.close();
    }

    @Test
    public void testPeopleNexusAi() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        //driver.close();
    }
}

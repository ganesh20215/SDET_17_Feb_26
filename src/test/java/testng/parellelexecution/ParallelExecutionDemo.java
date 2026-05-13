package testng.parellelexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExecutionDemo {

    @Test
    public void verifyEdso(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.edso.in/");
        driver.close();
    }

    @Test
    public void verifytcs(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tcs.com");
        driver.close();
    }

    @Test
    public void verifyAmazon(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.close();
    }

    @Test
    public void verifyFlipKart(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.close();
    }

    @Test
    public void verifyPeopleNexusAI(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.peoplenexusai.com/");
        driver.close();
    }
}

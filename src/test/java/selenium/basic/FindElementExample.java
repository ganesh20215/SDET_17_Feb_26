package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementExample {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        //to locate single web element
        //Return type of findElement() is WebElement
        //Throws an NoSuchElementException exception

        WebElement e = driver.findElement(By.id("log"));
        e.sendKeys("Krushana");

    }
}

package selenium.iframedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class IFrameExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

             /*   List<WebElement> elements = driver.findElements(By.tagName("iframe"));
        System.out.println(elements.size());*/

        //Iframe with an Index
        //driver.switchTo().frame(0);

        //By Name or Id
        //driver.switchTo().frame(0);

        //By Name or Id
        //driver.switchTo().frame("iframe");

        //By Web Element
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

        driver.findElement(By.xpath("//input[@id='datepicker']")).click();

        driver.switchTo().parentFrame();

        WebElement e1 = driver.findElement(By.xpath("//h1[text()='Datepicker']"));
        System.out.println(e1.isDisplayed());

    }
}

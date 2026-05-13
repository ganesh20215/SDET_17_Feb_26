package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class XpathAxesLiveExample {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

        driver.findElement(By.id("datepicker")).click();

        Thread.sleep(2000);

        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//child::a"));

        for (WebElement e : allDates) {
            Thread.sleep(500);
            if (e.getText().equals("25")) {
                e.click();
                break;
            }
        }
    }
}

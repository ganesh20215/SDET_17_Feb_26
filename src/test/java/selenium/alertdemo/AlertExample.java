package selenium.alertdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();

   /*     WebElement element = driver.findElement(By.id("alertbtn"));
        element.click();

        Alert a = driver.switchTo().alert();
        System.out.println(a.getText());
        a.dismiss();

        driver.findElement(By.id("bmwcheck")).click();*/

        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();

        driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();

        Alert a = driver.switchTo().alert();
        System.out.println(a.getText());
        a.accept();
        //a.sendKeys("Hello All");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
        driver.switchTo().alert().sendKeys("Tesing Demo");
    }
}

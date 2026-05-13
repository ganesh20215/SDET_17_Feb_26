package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement radiBtn = driver.findElement(By.id("bmwradio"));

        System.out.println(radiBtn.isSelected());    //false
        radiBtn.click();
        System.out.println(radiBtn.isSelected());    //true

        driver.close();
    }
}

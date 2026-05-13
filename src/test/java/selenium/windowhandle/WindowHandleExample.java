package selenium.windowhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandleExample {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        driver.findElement(By.id("openwindow")).click();

        //to get single window id where webdriver focused
        //String is the return type of getWindowHandle
        String parentWindowId = driver.getWindowHandle();
        System.out.println(parentWindowId);

        //To get all windows id we have to use getWindowHandles
        //return parent window id and all child window id
        //getWindowHandles method has Set<String> is the return type
        Set<String> allWindowId = driver.getWindowHandles();
        System.out.println(allWindowId);

        for (String e : allWindowId){
            if (!e.equals(parentWindowId)){
                driver.switchTo().window(e);
                Thread.sleep(2000);
                driver.findElement(By.linkText("INTERVIEW")).click();
                Thread.sleep(2000);
                driver.findElement(By.linkText("SUPPORT")).click();
                Thread.sleep(2000);
                System.out.println(driver.getTitle());
                driver.close();
            }
        }

        driver.switchTo().window(parentWindowId);
        driver.findElement(By.id("bmwcheck")).click();
        Thread.sleep(2000);
        driver.close();
    }
}

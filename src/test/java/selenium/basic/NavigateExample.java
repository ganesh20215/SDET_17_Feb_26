package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateExample {
    public static void main(String[] args) throws InterruptedException {
            /*navigate() : It is used to navigate to a particular URL or to move forward, backward or refresh the page.
            It has the following methods:
            1. to(String url) : It is used to navigate to a particular URL.
            2. forward() : It is used to move forward in the browser history.
            3. back() : It is used to move backward in the browser history.
            4. refresh() : It is used to refresh the current page.*/

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().forward();
        Thread.sleep(2000);

        driver.navigate().refresh();
        Thread.sleep(2000);
    }
}

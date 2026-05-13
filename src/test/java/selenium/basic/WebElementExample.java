package selenium.basic;

import com.google.errorprone.annotations.ThreadSafe;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementExample {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        //Sendkeys()
        /*WebElement e1 = driver.findElement(By.id("login1"));
        e1.sendKeys("Anisha");
        Thread.sleep(2000);*/

        //clear()
        /*e1.clear();
        Thread.sleep(2000);*/

        //submit()
        WebElement e2 = driver.findElement(By.className("signin-btn"));
        //e2.submit();

        //getText()
        //System.out.println(e2.getText());

        //getTagName
        //System.out.println(e2.getTagName());
    }
}

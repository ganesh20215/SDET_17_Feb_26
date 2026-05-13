package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        //to locate multiple web element
        //Return type of findElement() is  List<WebElement>
        //It's not throws an exception it simple return zero list of array

        List<WebElement> elements = driver.findElements(By.tagName("in"));
        System.out.println(elements.size());
        for (WebElement e : elements){
            System.out.println(e);
        }

    }
}

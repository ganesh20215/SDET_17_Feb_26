package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorStretegy {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        //By Id
        //driver.findElement(By.id("login1")).sendKeys("Harsh");

        //By name
        //driver.findElement(By.name("login")).sendKeys("Ravi");

        //By classname
        //driver.findElement(By.className("email-input")).sendKeys("Rohan");

        //By linkText
        //driver.findElement(By.linkText("Get a new Rediffmail ID")).click();

        //By partialLinkText
        //driver.findElement(By.partialLinkText("Rediffmail ID")).click();

        //By tagName
        //List<WebElement> allElements = driver.findElements(By.tagName("a"));
        //System.out.println(allElements.size());

        //cssSelector with Id Attribute
        //driver.findElement(By.cssSelector("input[id='login1']")).sendKeys("Samarth");
        //driver.findElement(By.cssSelector("input#login1")).sendKeys("Samarth");

        //cssSelector with class name Attribute
        //driver.findElement(By.cssSelector("input[class='email-input']")).sendKeys("Shital");
        //driver.findElement(By.cssSelector("input.email-input")).sendKeys("Sumit");

        //xpath

        //Absolute xpath
        //driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[3]/form/div[1]/div/input")).sendKeys("Swati");//

        //Relative xpath
        //driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Kalyani");

        //text() function in xpath
        //driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();

        //text() function in xpath
        //driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();

        //and/or in xpath
        //driver.findElement(By.xpath("//input[@id='password' and @name='passwd']")).sendKeys("Kalyani");
        //driver.findElement(By.xpath("//input[@id='password' or @name='pass']")).sendKeys("Kalyani");

        //Xpath Starts-with
        //driver.findElement(By.xpath("//a[starts-with(text(),'Get a new')]")).click();
        //driver.findElement(By.xpath("//input[starts-with(@id,'log')]")).sendKeys("Test Data");

        //Contains()
        //driver.findElement(By.xpath("//input[contains(@id,'in1')]")).sendKeys("Happy");
        //driver.findElement(By.xpath("//a[contains(text(),'password')]")).click();

        //following xpath axes
        //h1[contains(@class,'_Omnvo')]//following::a

        //ancestor xpath axes
        //h1[contains(@class,'_Omnvo')]//ancestor::div

        //following-sibling
        //div[@class='IHPEN6']//following-sibling::div
    }
}

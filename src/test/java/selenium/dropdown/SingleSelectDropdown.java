package selenium.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SingleSelectDropdown {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement dp = driver.findElement(By.id("carselect"));

        Select s = new Select(dp);

        //Get All Options from dropdown
        /*List<WebElement> allOption =  s.getOptions();
        for (WebElement e : allOption){
            System.out.println(e.getText());
        }*/

        Thread.sleep(2000);
        s.selectByIndex(2);

        Thread.sleep(2000);
        s.selectByValue("benz");

        Thread.sleep(2000);
        s.selectByVisibleText("BMW");


        //driver.close();
    }
}

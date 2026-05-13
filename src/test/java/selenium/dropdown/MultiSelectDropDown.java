package selenium.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultiSelectDropDown {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement dp = driver.findElement(By.id("multiple-select-example"));

        Select s = new Select(dp);

        Thread.sleep(2000);
        s.selectByIndex(2);

        Thread.sleep(2000);
        s.selectByValue("orange");

        Thread.sleep(2000);
        s.selectByVisibleText("Apple");

        //Get All Options from dropdown
    /*    List<WebElement> allOption =  s.getAllSelectedOptions();
        for (WebElement e : allOption){
            System.out.println(e.getText());
        }*/

/*        Thread.sleep(2000);
        s.deselectByIndex(2);

        Thread.sleep(2000);
        s.deselectByValue("orange");

        Thread.sleep(2000);
        s.deselectByVisibleText("Apple");*/

        s.deselectAll();
    }
}

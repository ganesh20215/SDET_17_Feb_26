package selenium.screenshot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TakeAScreenshotExample {

    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.edso.in/");
        driver.manage().window().maximize();

        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

        File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(f, new File("D:\\classes\\Screenshot"+ timestamp + ".png"));

        driver.close();
    }
}

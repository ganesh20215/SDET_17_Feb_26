package selenium.basic;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroductionOfSelenium {

    public static void main(String[] args) {

        //WebDriver : Interface
        //driver : Reference variable
        //new : keyword to create an object
        //ChromeDriver() : Constructor
        //WebDriver driver = new FirefoxDriver();
        //WebDriver driver = new EdgeDriver();


      /*  ChromeDriver driver = new ChromeDriver();
        FirefoxDriver driver2 = new FirefoxDriver();
        EdgeDriver driver3 = new EdgeDriver();*/

        WebDriver driver = new ChromeDriver();
//        driver = new FirefoxDriver();
//        driver = new EdgeDriver();
        driver.get("https://www.edso.in/");
        driver.manage().window().maximize();    //maximize()

        //getTitle()
        //String title = driver.getTitle();
        //System.out.println(title);

        //getPageSource()
        //System.out.println(driver.getPageSource());

        //getCurrentURL
        System.out.println(driver.getCurrentUrl());

        driver.close();
    }
}

package selenium.cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class CookieExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.infosys.com/");
        driver.manage().window().maximize();

        //Add own cookie
        Cookie ac = new Cookie("company", "Edso Services");
        driver.manage().addCookie(ac);

        //get all cookies
        Set<Cookie>  allCookies = driver.manage().getCookies();
        for (Cookie c : allCookies){
            System.out.println(c);
        }

        //cookie according to name
        //System.out.println(driver.manage().getCookieNamed("company"));

        //delete cookie by name
        //driver.manage().deleteCookieNamed("company");

        //delete all cookies
        driver.manage().deleteAllCookies();

        System.out.println();
        System.out.println();
        System.out.println("----------Delete specific cookie----------");
        Set<Cookie>  allCookies2 = driver.manage().getCookies();
        for (Cookie c : allCookies2){
            System.out.println(c);
        }

        driver.close();
    }
}

package testng.basics;

import org.testng.annotations.*;

public class SecondAnnotationsExample {

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

    @BeforeMethod
    public void newSetup() {
        System.out.println("Before Method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterMethod
    public void newCloseBrowser() {
        System.out.println("After Method");
    }

    @Test
    public void tc1() {
        System.out.println("tc1");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }
}

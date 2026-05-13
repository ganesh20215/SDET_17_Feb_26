package testng.basics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodExample {

    @Test
    public void verifyLogin(){
        Assert.assertTrue(true, "verify login");
        Assert.assertTrue(true, "verify account balance");
        Assert.assertTrue(true, "verify home page logo");
        Assert.assertTrue(true, "verify card information");
        System.out.println("Verify Login");
    }

    @Test(dependsOnMethods = {"verifyLogin"})
    public void verifyAccountStatement(){
        System.out.println("Verify Statement");
    }

    @Test
    public void verifyAccountCreation(){
        System.out.println("Verify Account Creation");
    }
}

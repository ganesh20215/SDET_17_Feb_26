package testng.basics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroups {

    @Test(groups = "smoke")
    public void verifyAccountCreation(){
        Assert.assertTrue(false);
        System.out.println("Verify Account Creation");
    }

    @Test(dependsOnGroups = {"smoke"})
    public void verifyNewUserLogin(){
        System.out.println("Verify New User Login");
        System.out.println("testing");
    }

    @Test
    public void verifyAddToCart(){
        System.out.println("Verify Add To Cart");
        System.out.println("Hello Everyone.... Good Morning");
    }
}

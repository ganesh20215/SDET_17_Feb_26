package testng.failscript;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTestCheck {

   @Test
    public void testA(){
        System.out.println("Test A");
    }

   @Test
    public void testZ(){
        Assert.assertTrue(false);
        System.out.println("Test Z");
    }

   @Test
    public void testM(){
        System.out.println("Test M");
    }
}

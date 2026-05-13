package testng.basics;

import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority = 'A')
    public void testX(){
        System.out.println("Test X");
    }

    @Test(priority = 2, groups = "smoke")
    public void testA(){
        System.out.println("Test A");
    }

    @Test(priority = -5, groups = "sanity")
    public void testZ(){
        System.out.println("Test Z");
    }
}

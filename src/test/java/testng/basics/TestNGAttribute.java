package testng.basics;

import org.testng.annotations.Test;

public class TestNGAttribute {

    @Test(invocationCount = 10000, invocationTimeOut = 1)
    public void addition() {
        System.out.println(10 + 20);
    }
}

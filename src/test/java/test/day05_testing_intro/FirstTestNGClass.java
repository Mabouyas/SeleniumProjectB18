package test.day05_testing_intro;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTestNGClass {
    @BeforeMethod
    public void setup() {
        System.out.println("Before method running...");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("After method is running...");
    }
    @Test
    public void test1(){
        System.out.println("Test is running...");
    }
    @Test
    public void test2(){
        System.out.println("Test2 is running...");
    }
}

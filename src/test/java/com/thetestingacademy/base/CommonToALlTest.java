package com.thetestingacademy.base;

import com.thetestingacademy.drivers.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonToALlTest {


    @BeforeMethod
    public void setup(){
        DriverManager.init();

    }

    @AfterMethod
    public void tearDown(){
        DriverManager.down();
    }
}

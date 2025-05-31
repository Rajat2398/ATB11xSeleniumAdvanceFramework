package com.thetestingacademy.tests.pagefactory;

import com.thetestingacademy.base.CommonToALlTest;
import com.thetestingacademy.pages.pageFactory.VWO.LoginPage_PF;
import com.thetestingacademy.utils.PropertiesReader;
import org.apache.logging.log4j.LogManager;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.apache.logging.log4j.Logger;

import static com.thetestingacademy.drivers.DriverManager.driver;

public class TestVWOLogin_PF extends CommonToALlTest {



    private static final Logger logger = (Logger) LogManager.getLogger(TestVWOLogin_PF.class);

    @Test
    public void testLoginNegativeVWO_PF() {
        logger.info("Starting the Testcases Page Factory");
        LoginPage_PF loginPage_PF = new LoginPage_PF(driver);
        String error_msg = loginPage_PF.loginToVWOInvalidCreds();
        logger.info("Error msg I got "+ error_msg);
        logger.info("Finished the Testcases Page Factory");
        logger.debug("Finished the Testcases Page Factory");
        logger.error("Finished the Testcases Page Factory");
        logger.fatal("Fatal error - code is dead!");
        Assert.assertEquals(error_msg, PropertiesReader.readKey("error_message"));
    }

}

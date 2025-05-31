package com.thetestingacademy.pages.pageObjectModel.Normal_Pom;

import com.thetestingacademy.utils.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoardPage {
    WebDriver driver;

    public DashBoardPage(WebDriver driver2) {
        this.driver = driver2;
    }

    private By userNameOnDashboard = By.cssSelector("[data-qa=\"lufexuloga\"]");
    // Page Actions
    public String loggedInUserName(){
        WaitHelpers.waitJVM(10000);
        driver.get("https://app.vwo.com/#/dashboard");
        return driver.findElement(userNameOnDashboard).getText();
    }


}

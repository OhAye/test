package com.Ceridian.Pages;

import com.Ceridian.com.Helper;
import com.frameworkium.core.ui.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Saahme on 20/07/2016.
 */
public class PaySlipsPage extends BasePage<PaySlipsPage> {

    @FindBy(id = "tdAllID")
    private WebElement payAndAllowances;


    Helper helper = new Helper();
    public void checkMyPayslips() {
        driver.switchTo().defaultContent();
        wait.until(ExpectedConditions.visibilityOf(payAndAllowances));
        payAndAllowances.click();
    }



}

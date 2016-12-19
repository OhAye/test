package com.Ceridian.Pages;

import com.Ceridian.com.Helper;
import com.frameworkium.core.ui.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Saahme on 19/07/2016.
 */
public class MessagesPage extends BasePage<MessagesPage> {

    @FindBy(id = "lnkRequestsIn")
    WebElement requestsInLink;

    @FindBy(id = "MessageGrid_MessageSection")
    WebElement firstRequest;

    @FindBy(id = "RFAControl_btnAccept")
    WebElement acceptButton;

    Helper helper = new Helper();


    public void acceptFirstRequest() {
        driver.switchTo().frame("ContainerFrame");
        driver.switchTo().frame("frameMessageDetails");
        wait.until(ExpectedConditions.visibilityOf(firstRequest));
        helper.sleep();
        firstRequest.click();
        driver.switchTo().frame("FORMCONTAINER");
        wait.until(ExpectedConditions.visibilityOf(acceptButton));
        acceptButton.click();

    }



}

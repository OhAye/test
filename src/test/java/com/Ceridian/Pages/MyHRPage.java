package com.Ceridian.Pages;

import com.Ceridian.com.Helper;
import com.frameworkium.core.ui.pages.BasePage;
import com.frameworkium.core.ui.pages.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Saahme on 19/07/2016.
 */
public class MyHRPage extends BasePage<MyHRPage> {

    @FindBy(css = "li:nth-child(1).NoBullet.jms-bullet> h3>a[href^='javascript:ShowSelectedAddInScreen']")
    WebElement newStarterLink;

    @FindBy(css = "li:nth-child(2).NoBullet.jms-bullet> h3>a[href^='javascript:ShowSelectedAddInScreen']")
    WebElement processLeaverLink;



    Helper helper = new Helper();

    public NewStartPage clickNewStarter() {
        driver.switchTo().frame("ContainerFrame");
        driver.switchTo().frame("iframeCommunityContainer");
        wait.until(ExpectedConditions.visibilityOf(newStarterLink));
        helper.sleep();
        newStarterLink.click();
        driver.switchTo().defaultContent();
        return PageFactory.newInstance(NewStartPage.class);

    }

    public NewStartPage clickProcessLeaver() {
        driver.switchTo().frame("ContainerFrame");
        driver.switchTo().frame("iframeCommunityContainer");
        wait.until(ExpectedConditions.visibilityOf(processLeaverLink));
        processLeaverLink.click();
        driver.switchTo().defaultContent();
        return PageFactory.newInstance(NewStartPage.class);
    }

}

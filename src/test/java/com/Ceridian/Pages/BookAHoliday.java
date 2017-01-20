package com.Ceridian.Pages;

import com.Ceridian.com.Helper;
import com.frameworkium.core.ui.pages.BasePage;
import com.frameworkium.core.ui.pages.PageFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Saahme on 19/07/2016.
 */
public class BookAHoliday extends BasePage<BookAHoliday> {

    @FindBy(css = "li:nth-child(3).NoBullet.jms-bullet> h3>a[href^='javascript:ShowSelectedAddInScreen']")
    WebElement myMobilityLink;

    @FindBy(id = "Communities")
    WebElement HRTab;

    @FindBy(id = "StartDate_txtInput")
    WebElement firstDayOfLeaveInput;

    @FindBy(id = "EndDate_txtInput")
    WebElement lastDayofLeaveInput;

    @FindBy(id = "StandardFooterToolbar_StandardFooterToolbarSubmit")
    WebElement submitButton;

    @FindBy(id = "LogoutIcon")
    WebElement logoutIcon;

    Helper helper = new Helper();

    public HomePage clickHR() {
        driver.switchTo().defaultContent();
        helper.switchToFrontPageFrame();
        HRTab.click();
        return PageFactory.newInstance(HomePage.class);
    }

    public HomePage completeHolidayFormAndSubmit(String firstDate, String lastDate) {
        helper.switchToMainFrame();
        firstDayOfLeaveInput.sendKeys(firstDate);
        lastDayofLeaveInput.sendKeys(lastDate);

        submitButton.click();


        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();
        wait.until(ExpectedConditions.visibilityOf(logoutIcon));
        logoutIcon.click();

        return PageFactory.newInstance(HomePage.class);
    }




}

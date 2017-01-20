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
public class Navigation extends BasePage<Navigation> {

    @FindBy(css = "li:nth-child(1).NoBullet.jms-bullet> h3>a[href^='javascript:ShowSelectedAddInScreen']")
    WebElement myDetailsLink;

    @FindBy(css = "li:nth-child(2).NoBullet.jms-bullet> h3>a[href^='javascript:ShowSelectedAddInScreen']")
    WebElement holidayLink;

    @FindBy(css = "li:nth-child(2).NoBullet.jms-bullet> h3>a[href^='javascript:ShowSelectedAddInScreen']")
    WebElement myPensionsLink;

    @FindBy(id = "HoverToggle")
    WebElement burgerMenu;

    @FindBy (id = "TabsToggle")
    WebElement pinMenu;

    @FindBy (id = "MessagesIcon")
    WebElement messagesIcon;

    @FindBy (id = "LogoutIcon")
    WebElement logoutIcon;

    @FindBy (id = "Home")
    WebElement homeBurgerMenu;

    @FindBy (id = "HR")
    WebElement hrBurgerMenu;

    @FindBy (id = "Manager")
    WebElement managerBurgerMenu;

    @FindBy (id = "MyTraining")
    WebElement trainingBurgerMenu;

    @FindBy (id = "Set-upWizard")
    WebElement setUpWizardBurgerMenu;

    @FindBy (id = "System")
    WebElement systemBurgerMenu;

    @FindBy (id = "Navigator")
    WebElement navigatorBurgerMenu;

    @FindBy (id = "Subscribe")
    WebElement subscribeBurgerMenu;

    @FindBy (id = "Unsubscribe")
    WebElement unsubscribeBurgerMenu;

    @FindBy (id = "Documents")
    WebElement documentsBurgerMenu;

    @FindBy (css = "li.CommunitiesAndAnnouncementsNoBulletNoDescription.jms-web > h3 > a")
    WebElement myPayslipsLink;

    Helper helper = new Helper();

    public Navigation clickBurgerMenu() {
        driver.switchTo().defaultContent();
        wait.until(ExpectedConditions.elementToBeClickable(burgerMenu));
        helper.sleep();
        burgerMenu.click();
        return this;
    }

    public BookAHoliday clickHolidayLink() {
        helper.switchToFrontPageFrame();
        wait.until(ExpectedConditions.visibilityOf(holidayLink));
        holidayLink.click();
        return PageFactory.newInstance(BookAHoliday.class);
    }

    public PersonalDetailsPage clickMyDetailsImage() {
        helper.switchToFrontPageFrame();
        wait.until(ExpectedConditions.visibilityOf(myDetailsLink));
        myDetailsLink.click();
        return PageFactory.newInstance(PersonalDetailsPage.class);
    }

    public Navigation pinBurgerMenu() {
        wait.until(ExpectedConditions.visibilityOf(pinMenu));
        return this;
    }

    public Navigation clickMessagesIcon() {
        wait.until(ExpectedConditions.visibilityOf(messagesIcon));
        return this;
    }

    public Navigation clickLogoutIcon() {
        wait.until(ExpectedConditions.visibilityOf(logoutIcon));
        return this;
    }

    public Navigation clickHome() {
        wait.until(ExpectedConditions.visibilityOf(homeBurgerMenu));
        return this;
    }

    public MyHRPage clickHR() {
        wait.until(ExpectedConditions.visibilityOf(hrBurgerMenu));
        helper.sleep(); //element to be clickable doesn't work here
        hrBurgerMenu.click();
        return PageFactory.newInstance(MyHRPage.class);
    }

    public Navigation clickManager() {
        wait.until(ExpectedConditions.visibilityOf(managerBurgerMenu));
        return this;
    }

    public PaySlipsPage clickMyPayslips() {
        helper.switchToFrontPageFrame();
        wait.until(ExpectedConditions.visibilityOf(myPayslipsLink));
        myPayslipsLink.click();
        helper.sleep();
        helper.sleep();
        helper.sleep();
        helper.switchTabs();

        return PageFactory.newInstance(PaySlipsPage.class);
    }


}

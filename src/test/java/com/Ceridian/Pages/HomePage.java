package com.Ceridian.Pages;

import com.Ceridian.com.Helper;
import com.frameworkium.core.ui.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


/**
 * Created by Saahme on 19/07/2016.
 */
public class HomePage extends BasePage<HomePage> {

    @FindBy(css = "li:nth-child(1).NoBullet.jms-bullet> h3>a[href^='javascript:ShowSelectedAddInScreen']")
    WebElement updateMyDetailsLink;

    @FindBy(id = "ctl00_MCPH_MainLogin_UserNameTextBox")
    WebElement usernameInput;

    @FindBy(id = "txtUserName")
    WebElement usernameInputNotPortal;

    @FindBy(id = "ctl00_MCPH_MainLogin_PasswordTextBox")
    WebElement passwordInput;

    @FindBy(id = "txtPassword")
    WebElement passwordInputNotPortal;

    @FindBy(id = "ctl00_MCPH_MainLogin_LoginButton")
    WebElement loginButton;

    @FindBy(id = "btnLogin")
    WebElement loginButtonNotPortal;

    @FindBy(id = "MessagesIcon")
    WebElement messagesIcon;
    Helper helper = new Helper();



    public HomePage openPage(String URL) {
        driver.navigate().to(URL);
        driver.manage().window().maximize();
        return PageFactory.initElements(driver, HomePage.class);
    }

    public HomePage logIn(String username, String password) {


        wait.until(ExpectedConditions.visibilityOf(usernameInputNotPortal));
//        usernameInput.sendKeys(username);
        usernameInputNotPortal.sendKeys(username);
//        passwordInput.sendKeys(password);
        passwordInputNotPortal.sendKeys(password);
//        loginButton.click();
        loginButtonNotPortal.click();
        return PageFactory.initElements(driver, HomePage.class);
    }


    public MessagesPage clickMessages() {
        driver.switchTo().defaultContent();
        wait.until(ExpectedConditions.visibilityOf(messagesIcon));
        messagesIcon.click();
        return PageFactory.initElements(driver, MessagesPage.class);

    }

    public PersonalDetailsPage clickUpdateMyDetails() {
        updateMyDetailsLink.click();
        return PageFactory.initElements(driver, PersonalDetailsPage.class);
    }


}

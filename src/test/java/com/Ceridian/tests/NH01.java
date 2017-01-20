package com.Ceridian.tests;

import com.Ceridian.Pages.*;
import com.Ceridian.com.ExcelUtils;
import com.Ceridian.com.Helper;
import com.frameworkium.core.ui.pages.PageFactory;
import com.frameworkium.core.ui.tests.BaseTest;
import org.testng.annotations.Test;

/**
 * Created by Saahme on 19/07/2016.
 */
public class NH01 extends BaseTest {

    @Test(description = "Enter and Submit a new hire")
    public void CD03() {

        Helper helper =  PageFactory.newInstance(Helper.class);
        ExcelUtils excelUtils = new ExcelUtils();
        String[] excelArray = excelUtils.readLoginInformation();

        HomePage homePage = new HomePage();
        homePage
                .openPage(excelArray[2])
                .logIn(excelArray[0], excelArray[1]);
        String firstName = helper.generateRandomName(5);
        String lastName = helper.generateRandomName(5);
        Navigation navigation = PageFactory.newInstance(Navigation.class);
        navigation
                .clickBurgerMenu()
                .clickHR()
                .clickNewStarter()
                .addNewStarter()
                .completePersonalAddressDetails(firstName, lastName, "04/06/2017", "NONE",
                        "04/05/1985", "123 boombastic avenue", "G412LQ")
                .completeContractJobDetails("06/09/2017","01/01/2017", "30000","40")
                .completeSalaryDetails("80,000", "40")
                .completeNewStarter();

        MyHRPage myHRPage = PageFactory.newInstance(MyHRPage.class);
        myHRPage.clickNewStarter();

        NewStartPage newStartPage = PageFactory.newInstance(NewStartPage.class);
        newStartPage
                .assertNewStarterComplete(firstName, lastName);
//        HomePage homePage1 = PageFactory.newInstance(HomePage.class);
//        homePage1.clickMessages();
//        MessagesPage messagesPage = PageFactory.newInstance(MessagesPage.class);
//        messagesPage.acceptFirstRequest();


    }
}

package com.Ceridian.tests;

import com.Ceridian.Pages.BookAHoliday;
import com.Ceridian.Pages.HomePage;
import com.Ceridian.Pages.Navigation;
import com.Ceridian.com.ExcelUtils;
import com.frameworkium.core.ui.pages.PageFactory;
import com.frameworkium.core.ui.tests.BaseTest;
import org.testng.annotations.Test;

/**
 * Created by Saahme on 19/07/2016.
 */
public class HB01 extends BaseTest {

    @Test(description = "Submit Holiday booking")
    public void CD01() {
        HomePage homePage = new HomePage();
        ExcelUtils excelUtils = new ExcelUtils();
        String[] excelArray = excelUtils.readLoginInformation();
        homePage

//                .logIn("fulladmin", "Brexit?1$")
                .openPage(excelArray[2])
                .logIn("1000483", "password9!");

        Navigation navigation = PageFactory.newInstance(Navigation.class);
        navigation.
                clickHolidayLink();

        BookAHoliday bookAHoliday = PageFactory.newInstance(BookAHoliday.class);
        bookAHoliday
                .completeHolidayFormAndSubmit("12/05/2016", "15/05/2016");


    }

    @Test(dependsOnMethods = "CD01", alwaysRun = true, description = "Accept Holiday Booking")

    public void CD02() {

        HomePage homePage = new HomePage();
        ExcelUtils excelUtils = new ExcelUtils();
        String[] excelArray = excelUtils.readLoginInformation();

        homePage
                .openPage(excelArray[2])
                .logIn("1000483", "password9!")
                .clickMessages()
                .acceptFirstRequest();


    }
}

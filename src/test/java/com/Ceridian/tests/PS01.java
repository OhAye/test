package com.Ceridian.tests;

import com.Ceridian.Pages.HomePage;
import com.Ceridian.Pages.Navigation;
import com.Ceridian.com.ExcelUtils;
import com.frameworkium.core.ui.pages.PageFactory;
import com.frameworkium.core.ui.tests.BaseTest;
import org.testng.annotations.Test;

/**
 * Created by Saahme on 20/07/2016.
 */
public class PS01 extends BaseTest {

    @Test(description = "Click MyPayslips")
    public void CD05() {
        HomePage homePage = new HomePage();
        ExcelUtils excelUtils = new ExcelUtils();
        String[] excelArray = excelUtils.readLoginInformation();
        homePage
                .openPage(excelArray[2])
                .logIn("1000483", "password9!");

        Navigation navigation = PageFactory.newInstance(Navigation.class);

        navigation
                .clickMyPayslips()
                .checkMyPayslips();


    }
}

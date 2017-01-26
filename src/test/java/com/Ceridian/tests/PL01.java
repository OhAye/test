package com.Ceridian.tests;

import com.Ceridian.Pages.HomePage;
import com.Ceridian.Pages.LeaverProcessPage;
import com.Ceridian.Pages.Navigation;
import com.Ceridian.com.ExcelUtils;
import com.frameworkium.core.ui.pages.PageFactory;
import com.frameworkium.core.ui.tests.BaseTest;
import org.testng.annotations.Test;

/**
 * Created by Saahme on 19/07/2016.
 */
public class PL01 extends BaseTest {

    @Test(description = "Process Leaver")
    public void CD04() {

        HomePage homePage = new HomePage();
        ExcelUtils excelUtils = new ExcelUtils();
        String[] excelArray = excelUtils.readLoginInformation();

        homePage
                .openPage(excelArray[2])
                .logIn(excelArray[0], excelArray[1]);

        Navigation navigation = PageFactory.newInstance(Navigation.class);
        navigation
                .clickBurgerMenu()
                .clickHR()
                .clickProcessLeaver();

        LeaverProcessPage leaverProcessPage = PageFactory.newInstance(LeaverProcessPage.class);
        leaverProcessPage.processLeaver("13/07/2016", "Dismissed");
    }

}

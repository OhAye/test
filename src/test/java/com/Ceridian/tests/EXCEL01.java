package com.Ceridian.tests;

import com.Ceridian.Pages.HomePage;
import com.Ceridian.Pages.Navigation;
import com.Ceridian.com.ExcelUtils;
import com.frameworkium.core.ui.pages.PageFactory;
import com.frameworkium.core.ui.tests.BaseTest;
import org.testng.annotations.Test;

/**
 * Created by Saahme on 26/07/2016.
 */
public class EXCEL01 extends BaseTest {

    @Test(description = "To test logging in with  Excel data")
    public void EX01() {
        ExcelUtils excelUtils = new ExcelUtils();
        excelUtils.randomInt();
        String[] excelArray = excelUtils.readLoginInformation();
        String[] excelArray2 = excelUtils.readNewHireData();


        HomePage homePage = new HomePage();
        homePage
                .openPage(excelArray[2])
                .logIn(excelArray[0], excelArray[1]);

        Navigation navigation = PageFactory.newInstance(Navigation.class);
        navigation
                .clickBurgerMenu()
                .clickHR()
                .clickNewStarter()
                .addNewStarter()
                .completePersonalAddressDetails(excelArray2[0], excelArray2[1], excelArray2[2], excelArray2[3],
                        excelArray2[4], excelArray2[5], excelArray2[6])
                .completeContractJobDetails(excelArray2[7], excelArray2[8],excelArray2[9],excelArray2[10])
                .completeNewStarter();

        excelUtils.writeToExcel();



    }
}

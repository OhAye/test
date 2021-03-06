package com.Ceridian.tests;


import com.Ceridian.Pages.HomePage;
import com.Ceridian.Pages.Navigation;
import com.Ceridian.com.ExcelUtils;
import com.Ceridian.com.Helper;
import com.frameworkium.core.ui.pages.PageFactory;
import com.frameworkium.core.ui.tests.BaseTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CD01 extends BaseTest {

@Test(description = "Change user detail")
@Parameters({"browser"})
    public void CD05() {

    Helper helper = PageFactory.newInstance(Helper.class);
    ExcelUtils excelUtils = new ExcelUtils();
    String[] excelArray = excelUtils.readLoginInformation();

    HomePage homePage = new HomePage();
    homePage.openPage(excelArray[2])
            .logIn(excelArray[0], excelArray[1]);
    String firstName = helper.generateRandomName(5);
    String lastName = helper.generateRandomName(5);
    String middleName = helper.generateRandomName(5);
    Navigation navigation = PageFactory.newInstance(Navigation.class);
    navigation.clickMyDetailsImage()
            .updatePersonalDetails("Mrs", firstName, lastName,middleName,"17/01/2017","17/01/2017","123 Sonas","Braehead",
                                    "Renfrew","Glasgow","G41 2WE","0141852369","sdworx@sdworx.com","07894852369");


}


}

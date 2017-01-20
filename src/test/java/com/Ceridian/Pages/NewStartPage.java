package com.Ceridian.Pages;

import com.Ceridian.com.Helper;
import com.frameworkium.core.ui.pages.BasePage;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import sun.security.util.KeyUtil;

import java.util.Random;

/**
 * Created by Saahme on 19/07/2016.
 */
public class NewStartPage extends BasePage<NewStartPage> {

    @FindBy(id = "BackButton")
    private WebElement backButton;

    @FindBy(id = "CurrentNewHiresGrid_ImgInsert")
    private WebElement draftAddButton;

    @FindBy(id = "CurrentPage0")
    private WebElement draftMenu;

    @FindBy(id = "ActionButton RowDelete")
    private WebElement draftDeleteButton;

    @FindBy(id = "CurrentPage0")
    private WebElement draftNewStarter;

    @FindBy(id = "CurrentPage1")
    private WebElement submittedNewStarter;

    @FindBy(id = "CurrentPage2")
    private WebElement completedNewStarter;

    // Personal Address Details

    @FindBy(id = "DATEOFJOIN1_txtInput")
    private WebElement startDateInput;

    @FindBy(css = "#PAYROLLCOMPANY1.WebControl.ctLookup.ControlViewportDESKTOP > img")
    private WebElement payrollCompanyLookUp;

    @FindBy(id = "PAYROLLCOMPANY1_txtInput")
    private WebElement payrollCompanyInput;


    @FindBy(xpath = "/html/body/form/div[3]/table/tbody/tr/td/div/div/table/tbody/tr[1]/td[1]")
    private WebElement firstPayrollCompany;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/button[3]/span[@class='ui-button-text']")
    private WebElement payrollCompanySelectButton;

    @FindBy(id = "NINUMBER1_txtInput")
    private WebElement niNumberInput;

    @FindBy(id = "DropDownList2_cboInput")
    private WebElement titleSelect;

    @FindBy(id = "FIRSTNAME1_txtInput")
    private WebElement firstNameInput;

    @FindBy(id = "DATEOFBIRTH1_txtInput")
    private WebElement DOBInput;

    @FindBy(css = "#MARITALSTATUS1.WebControl.ctLookup.ControlViewportDESKTOP > img")
    private WebElement maritalStatusInput;

    @FindBy(xpath = "/html/body/form/div[3]/table/tbody/tr/td/div/div/table/tbody/tr[2]/td")
    private WebElement maritalStatusDivorced;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/button[3]/span[@class='ui-button-text']")
    private WebElement maritalStatusSelectButton;

    @FindBy(id = "LASTNAME1_txtInput")
    private WebElement lastNameInput;

    @FindBy(id = "DropDownList4_cboInput")
    private WebElement nationalitySelect;

    @FindBy(css = "#GENDER1.WebControl.ctLookup.ControlViewportDESKTOP > img")
    private WebElement genderInput;

    @FindBy(xpath = "/html/body/form/div[3]/table/tbody/tr/td/div/div/table/tbody/tr[2]/td[@class='GridRow']")
    private WebElement genderMale;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/button[3]/span[@class='ui-button-text']")
    private WebElement genderSelect;

    @FindBy(id = "ADDRESS1_txtInput")
    private WebElement addressLineInput;

    @FindBy(id = "POSTCODE1_txtInput")
    private WebElement postcodeInput;

    // Contract Job Details

    @FindBy(css = "#TabbedFolder1Page1 > div > a")
    private WebElement contractDetailsLink;

    @FindBy(id = "DropDownList6_cboInput")
    private WebElement employmentTypeSelect;

    @FindBy(id = "CONTINUOUSSERVICEDATE1_txtInput")
    private WebElement continuousServiceDate;

    @FindBy(css = "#JOBTITLE1.WebControl.ctLookup.ControlViewportDESKTOP > img")
    private WebElement jobTitle;

    @FindBy(xpath = "/html/body/form/div[3]/table/tbody/tr/td/div/div/table/tbody/tr[1]/td[@class='GridRow']")
    private WebElement jobTitleAccAdmin;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/button[3]/span[@class='ui-button-text']")
    private WebElement jobTitleSelectButton;

    @FindBy(css = "#REPORTSTO1.WebControl.ctLookup.ControlViewportDESKTOP > img")
    private WebElement reportsToLineManager;

    @FindBy(id = "txtValue")
    private WebElement firstNameManagerInput;

    @FindBy(id = "btnSearch")
    private WebElement valueSearchButton;

    @FindBy(xpath = "/html/body/form/div[3]/table/tbody/tr/td/div/div/table/tbody/tr[1]/td[1]")
    private WebElement firstManager;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/button[3]/span[@class='ui-button-text']")
    private WebElement lineManagerSelect;

    @FindBy(css = "#HOLIDAYMONITOR1.WebControl.ctLookup.ControlViewportDESKTOP > img")
    private WebElement absenceApproverLookUp;

    @FindBy(id = "txtValue")
    private WebElement absenceApproverInput;

    @FindBy(id = "btnSearch")
    private WebElement absenceApproverInputSearch;

    @FindBy(xpath = "/html/body/form/div[3]/table/tbody/tr/td/div/div/table/tbody/tr[1]/td[1]")
    private WebElement absenceApproverFirstApprover;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/button[3]/span")
    private WebElement absenceApproverSelectButton;

    @FindBy(css = "#BUSINESSAREA1.WebControl.ctLookup.ControlViewportDESKTOP > img")
    private WebElement orgLevel1LookUp;

    @FindBy(xpath = "/html/body/form/div[3]/table/tbody/tr/td/div/div/table/tbody/tr[1]/td")
    private WebElement orgLevelHeadOffice;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/button[3]/span[@class='ui-button-text']")
    private WebElement orgLevelSelectButton;

    @FindBy(css = "#LOCATION1.WebControl.ctLookup.ControlViewportDESKTOP > img")
    private WebElement locationLookUp;

    @FindBy(xpath = "/html/body/form/div[3]/table/tbody/tr/td/div/div/table/tbody/tr[1]/td[1]")
    private WebElement locationContingencySite;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/button[3]/span[@class='ui-button-text']")
    private WebElement locationSelectButton;

    @FindBy(id = "HOLIDAYYEARSTART1_txtInput")
    private WebElement holidayYearStartInput;

    @FindBy(css = "#HOLIDAYENTITLEMENT1.WebControl.ctLookup.ControlViewportDESKTOP > img")
    private WebElement holidayEntitlementLookUp;

    @FindBy(xpath = "/html/body/form/div[3]/table/tbody/tr/td/div/div/table/tbody/tr[1]/td[1]")
    private WebElement holidayFullTimeDays;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/button[3]/span[@class='ui-button-text']")
    private WebElement holidayEntitlementSelectButton;

    @FindBy(css = "#WORKPATTERN1.WebControl.ctLookup.ControlViewportDESKTOP > img")
    private WebElement companyWorkPatternLookUp;

    @FindBy(xpath = "/html/body/form/div[3]/table/tbody/tr/td/div/div/table/tbody/tr[1]/td")
    private WebElement companyWorkPatternPT1;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/button[3]/span[@class='ui-button-text']")
    private WebElement companyWorkPatternSelectButton;

    //Salary, Bank & Payroll Details


    @FindBy(css = "#TabbedFolder1Page2 > div > a")
    private WebElement salaryDetailsLink;

    @FindBy(id = "DropDownList8_cboInput")
    private WebElement payFrequencySelect;

    @FindBy(id = "DropDownList9_cboInput")
    private WebElement payTypeSelect;

    @FindBy(id = "ANNUALSALARY1_txtInput")
    private WebElement annualSalaryInput;

    @FindBy(id = "DropDownList10_cboInput")
    private WebElement methodOfPaymentSelect;

    @FindBy(id = "HOURSPERWEEK1_txtInput")
    private WebElement hoursPerWeekInput;


    @FindBy(css = "#PAYGROUP1.WebControl.ctLookup.ControlViewportDESKTOP > img")
    private WebElement paygroupLookUp;

    @FindBy(xpath = "/html/body/form/div[3]/table/tbody/tr/td/div/div/table/tbody/tr[1]/td[1]")
    private WebElement paygroupActiveLegacy;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/button[3]/span[@class='ui-button-text']")
    private WebElement paygroupSelectButton;

    @FindBy(css = "#PAYDEPARTMENT1.WebControl.ctLookup.ControlViewportDESKTOP > img")
    private WebElement payDepartmentLookUp;

    @FindBy(xpath = "/html/body/form/div[3]/table/tbody/tr/td/div/div/table/tbody/tr[3]/td[1]")
    private WebElement perfTestingCompanySelect;


    @FindBy(xpath = "/html/body/form/div[3]/table/tbody/tr/td/div/div/table/tbody/tr[1]/td[1]")
    private WebElement payDepartmentSecurity;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/button[3]/span[@class='ui-button-text']")
    private WebElement payDepartmentSelectButton;

    // New Starter Completion
    @FindBy(css = "#TabbedFolder1Page4 > div > a")
    private WebElement newStarterLink;

    @FindBy(id = "SUBMITFORM1_chkInput")
    private WebElement newStarterCheckbox;

    @FindBy(id = "StandardFooterToolbar_StandardFooterToolbarSave")
    private WebElement saveAndCloseButton;

    @FindBy(xpath = "/html/body/form/div[4]/div[2]/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/table/tbody/tr[1]/td[2]")
    private WebElement verifyFirstName;


    @FindBy(css = "#CurrentPage1 > div > a")
    private WebElement newStartersLink;


    Helper helper = new Helper();

    public NewStartPage addNewStarter() {
        helper.switchToMainFrame();
        wait.until(ExpectedConditions.visibilityOf(draftMenu));
        draftMenu.click();
        wait.until(ExpectedConditions.visibilityOf(draftAddButton));
        draftAddButton.click();
        driver.switchTo().defaultContent();
        return this;

    }

    public NewStartPage completePersonalAddressDetails(String firstName, String lastName, String startDate, String NINumber,
                                                       String DOB,
                                                       String addressLine, String postcode) {

        helper.switchToMainFrame();
        startDateInput.sendKeys(startDate);

        wait.until(ExpectedConditions.visibilityOf(payrollCompanyLookUp));
        payrollCompanyLookUp.click();
        helper.switchToLookUpFrame();
        wait.until(ExpectedConditions.visibilityOf(perfTestingCompanySelect));
        perfTestingCompanySelect.click();


        helper.switchToLookUpFrame();
        firstPayrollCompany.click();
        helper.switchToMainFrame();
        wait.until(ExpectedConditions.visibilityOf(payrollCompanySelectButton));
        payrollCompanySelectButton.click();

        niNumberInput.clear();
        niNumberInput.sendKeys(NINumber);

        Select selectTitle = new Select(titleSelect);
        selectTitle.selectByIndex(new Random(-1).nextInt(selectTitle.getOptions().size()));

        firstNameInput.sendKeys(firstName);
        maritalStatusInput.click();
        helper.switchToLookUpFrame();
        wait.until(ExpectedConditions.visibilityOf(maritalStatusDivorced));
        maritalStatusDivorced.click();
        helper.switchToMainFrame();
        maritalStatusSelectButton.click();

        DOBInput.sendKeys(DOB);

        lastNameInput.sendKeys(lastName);

        Select selectNationality = new Select(nationalitySelect);
        selectNationality.selectByIndex(new Random(-1).nextInt(selectNationality.getOptions().size()));

        genderInput.click();
        helper.switchToLookUpFrame();

        wait.until(ExpectedConditions.visibilityOf(genderMale));
        genderMale.click();
        helper.switchToMainFrame();
        genderSelect.click();

        wait.until(ExpectedConditions.visibilityOf(addressLineInput));
        addressLineInput.sendKeys(addressLine);
        postcodeInput.sendKeys(postcode);
        driver.switchTo().defaultContent();
        return this;

    }

    public NewStartPage completeContractJobDetails(String serviceDate, String holidayStartDate, String annualSalary, String hoursPerWeek) {
        helper.switchToMainFrame();
        wait.until(ExpectedConditions.visibilityOf(contractDetailsLink));
        contractDetailsLink.click();

        Select selectEmploymentType = new Select(employmentTypeSelect);
        selectEmploymentType.selectByIndex(new Random(-1).nextInt(selectEmploymentType.getOptions().size()));

        continuousServiceDate.sendKeys(serviceDate);
        jobTitle.click();
        helper.switchToLookUpFrame();
        wait.until(ExpectedConditions.visibilityOf(jobTitleAccAdmin));
        jobTitleAccAdmin.click();

        helper.switchToMainFrame();
        jobTitleSelectButton.click();

        reportsToLineManager.click();
        helper.switchToLookUpFrame();
        wait.until(ExpectedConditions.visibilityOf(firstNameManagerInput));
        firstNameManagerInput.sendKeys("a");
        valueSearchButton.click();

        wait.until(ExpectedConditions.visibilityOf(firstManager));
        firstManager.click();
        helper.switchToMainFrame();
        lineManagerSelect.click();

        wait.until(ExpectedConditions.visibilityOf(absenceApproverLookUp));
        absenceApproverLookUp.click();
        helper.switchToLookUpFrame();

        wait.until(ExpectedConditions.visibilityOf(absenceApproverInput));
        absenceApproverInput.sendKeys("a");
        absenceApproverInputSearch.click();

        wait.until(ExpectedConditions.visibilityOf(absenceApproverFirstApprover));
        absenceApproverFirstApprover.click();
        helper.switchToMainFrame();
        absenceApproverSelectButton.click();

        orgLevel1LookUp.click();
        helper.switchToLookUpFrame();
        orgLevelHeadOffice.click();
        helper.switchToMainFrame();
        orgLevelSelectButton.click();

        locationLookUp.click();
        helper.switchToLookUpFrame();
        locationContingencySite.click();
        helper.switchToMainFrame();
        locationSelectButton.click();
        helper.sleep();
        helper.switchToMainFrame();


        holidayYearStartInput.sendKeys(holidayStartDate);
        holidayEntitlementLookUp.click();
        helper.switchToLookUpFrame();
        holidayFullTimeDays.click();
        helper.switchToMainFrame();
        holidayEntitlementSelectButton.click();

        companyWorkPatternLookUp.click();
        helper.switchToLookUpFrame();
        companyWorkPatternPT1.click();
        helper.switchToMainFrame();
        companyWorkPatternSelectButton.click();



        return this;

    }

    public NewStartPage completeNewStarter() {
        helper.switchToMainFrame();
        wait.until(ExpectedConditions.visibilityOf(newStarterLink));
        newStarterLink.click();
        newStarterCheckbox.click();
        wait.until(ExpectedConditions.visibilityOf(saveAndCloseButton));
        saveAndCloseButton.click();
        driver.switchTo().defaultContent();
        wait.until(ExpectedConditions.visibilityOf(backButton));
        backButton.click();
        wait.until(ExpectedConditions.visibilityOf(backButton));
        backButton.click();

        return this;

    }

    public NewStartPage assertNewStarterComplete(String firstName, String lastName) {

        helper.switchToMainFrame();
        wait.until(ExpectedConditions.visibilityOf(newStartersLink));
        newStartersLink.click();
        helper.switchToMainFrame();
        wait.until(ExpectedConditions.visibilityOf(verifyFirstName));
        Assert.assertTrue("Verification failed" + firstName, verifyFirstName.getText().equals(firstName));

        return this;
    }

    public NewStartPage completeSalaryDetails(String annualSalary, String hoursPerWeek) {
        helper.switchToMainFrame();
        wait.until(ExpectedConditions.visibilityOf(salaryDetailsLink));
        salaryDetailsLink.click();

        wait.until(ExpectedConditions.visibilityOf(payFrequencySelect));
        Select payFreq = new Select(payFrequencySelect);
        payFreq.selectByIndex(new Random().nextInt(payFreq.getOptions().size()-1));

        wait.until(ExpectedConditions.visibilityOf(payTypeSelect));
        Select payType = new Select(payTypeSelect);
        payType.selectByIndex(new Random().nextInt(payType.getOptions().size()-1));

        annualSalaryInput.sendKeys(annualSalary);

        Select MOP = new Select(methodOfPaymentSelect);
        MOP.selectByIndex(new Random().nextInt(MOP.getOptions().size()-1));

        hoursPerWeekInput.sendKeys(hoursPerWeek);

        paygroupLookUp.click();
        helper.switchToLookUpFrame();
        wait.until(ExpectedConditions.visibilityOf(paygroupActiveLegacy));
        paygroupActiveLegacy.click();
        helper.switchToMainFrame();
        paygroupSelectButton.click();

        payDepartmentLookUp.click();
        helper.switchToLookUpFrame();
        wait.until(ExpectedConditions.visibilityOf(payDepartmentSecurity));
        payDepartmentSecurity.click();
        helper.switchToMainFrame();
        wait.until(ExpectedConditions.visibilityOf(payDepartmentSelectButton));
        payDepartmentSelectButton.click();

        return this;

    }
}

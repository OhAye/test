package com.Ceridian.Pages;

import com.Ceridian.com.Helper;
import com.frameworkium.core.ui.pages.BasePage;
import org.apache.commons.lang.time.DateUtils;
import org.apache.poi.ss.usermodel.DateUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.Date;
import java.util.Random;

/**
 * Created by Saahme on 19/07/2016.
 */
public class PersonalDetailsPage extends BasePage<PersonalDetailsPage> {


    @FindBy(id = "DropDownList1_cboInput")
    private WebElement titleSelect;

    @FindBy(id = "FIRSTNAME1_txtInput")
    private WebElement firstNameInput;

    @FindBy(id = "MIDDLENAME1_txtInput")
    private WebElement middleNameInput;

    @FindBy(id = "LASTNAME1_txtInput")
    private WebElement lastNameInput;

    @FindBy(id = "MAIDENNAME1_txtInput")
    private WebElement previousNameInput;

    @FindBy(id = "Initial_txtInput")
    private WebElement initialsInput;

    @FindBy(id = "PREFERREDNAME1_txtInput")
    private WebElement preferredNameInput;

    @FindBy(css = "#MARITALSTATUS1.WebControl.ctLookup.ControlViewport > img")
    private WebElement maritalStatusImage;

    @FindBy(id = "#MARITALSTATUS1_txtInput.ui-autocomplete > input")
    private WebElement maritalStatusText;

    @FindBy(xpath = "/html/body/form/div[3]/table/tbody/tr/td/div/div/table/tbody/tr[2]/td")
    private WebElement maritalStatusDivorced;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/button[3]/span[@class='ui-button-text']")
    private WebElement maritalStatusSelectButton;

    @FindBy(id = "DropDownList2_cboInput")
    private WebElement ethnicitySelect;

    @FindBy(id = "DropDownList3_cboInput")
    private WebElement nationalitySelect;

    @FindBy(id = "DropDownList10_cboInput")
    private WebElement religionSelect;

    @FindBy(css = "#TabbedFolder1Page1.TabNormal > div > a")
    private WebElement contactDetailsLink;


    @FindBy(id = "DateInput1_txtInput")
    private WebElement dateFromInput;

    @FindBy(id = "DateInput3_txtInput")
    private WebElement dateFromInput2;



    @FindBy(id = "ADDRESS11_txtInput")
    private WebElement addressline1Input;

    @FindBy(id = "ADDRESS21_txtInput")
    private WebElement addressline2Input;

    @FindBy(id = "ADDRESS33_txtInput")
    private WebElement addressline3Input;

    @FindBy(id = "CITY1_txtInput")
    private WebElement cityInput;

    @FindBy(id = "DropDownList4_cboInput")
    private WebElement countryInput;

    @FindBy(id = "POSTCODE1_txtInput")
    private WebElement postcodeInput;

    @FindBy(id = "DropDownList4_cboInput")
    private WebElement countrySelect;

    @FindBy(id = "HOMETELEPHONE1_txtInput")
    private WebElement telephoneInput;

    @FindBy(id = "HOMETELEPHONE1_txtInput")
    private WebElement mobileInput;

    @FindBy(id = "EmailEdit1_txtInput")
    private WebElement emailInput;

    @FindBy(css = "#TabbedFolder1Page2.TabHL.TabSelected > div > a")
    private WebElement dependantsLink;

    @FindBy(id = "DropDownList5xxROWxx0_cboInput")
    private WebElement dependantTitle;

    @FindBy(id = "FIRSTNAME2xxROWxx0_txtInput")
    private WebElement dependantFirstNameInput;

    @FindBy(id = "MIDDLENAME2xxROWxx0_txtInput")
    private WebElement dependantMiddleNameInput;

    @FindBy(id = "LASTNAME2xxROWxx0_txtInput")
    private WebElement dependantLastNameInput;

    @FindBy(id = "DropDownList6xxROWxx0_cboInput")
    private WebElement dependantsRelationshipSelect;

    @FindBy(id = "DATEOFBIRTH1xxROWxx0_txtInput")
    private WebElement dependantDOBInput;

    @FindBy(css = "#GENDER1xxROWxx0.WebControl.ctLookup.ControlViewportDESKTOP > img")
    private WebElement dependantGenderLookup;

    @FindBy(id = "DISABLED1xxROWxx0_chkInput")
    private WebElement dependantDisbilityCheckbox;

    @FindBy(id = "DISABLED1xxROWxx0_chkInput")
    private WebElement dependantEducationCheckbox;

    @FindBy(id = "HOMETELEPHONE2xxROWxx0_txtInput")
    private WebElement dependantHometelInput;

    @FindBy(id = "WORKTELEPHONE1xxROWxx0_txtInput")
    private WebElement dependantWorktelInput;

    @FindBy(id = "MOBILETELEPHONE2xxROWxx0_txtInput")
    private WebElement dependantMobtelInput;

    @FindBy(id = "EMAIL2xxROWxx0_txtInput")
    private WebElement dependantEmailAddInput;

    @FindBy(id = "RepeatingSection1Insert")
    private WebElement dependantAddButton;

    //Emergency Contacts

    @FindBy(css = "#TabbedFolder1Page3.TabHL.TabSelected > div > a")
    private WebElement emergencyContactsLink;

    @FindBy(id = "DropDownList7xxROWxx0_cboInput")
    private WebElement emergTitle;

    @FindBy(id = "FIRSTNAME3xxROWxx0_txtInput")
    private WebElement emergFirstNameInput;

    @FindBy(id = "MIDDLENAME3xxROWxx0_txtInput")
    private WebElement emergMiddleNameInput;

    @FindBy(id = "LASTNAME3xxROWxx0_txtInput")
    private WebElement emergLastNameInput;

    @FindBy(id = "DropDownList8xxROWxx0_cboInput")
    private WebElement emergTypeSelect;

    @FindBy(id = "DropDownList9xxROWxx0_cboInput")
    private WebElement emergRelationshipSelect;

    @FindBy(id = "NOTES1xxROWxx0_txtInput")
    private WebElement emergNotesInput;

    @FindBy(id = "DAYTELEPHONE1xxROWxx0_txtInput")
    private WebElement emergDayTelInput;

    @FindBy(id = "EVENINGTELEPHONE1xxROWxx0_txtInput")
    private WebElement emergEveningTelInput;

    @FindBy(id = "MOBILE1xxROWxx0_txtInput")
    private WebElement emergMobileTelInput;

    @FindBy(id = "EMAIL1xxROWxx0_txtInput")
    private WebElement emergEmailTelInput;

    @FindBy(id = "RepeatingSection2Insert")
    private WebElement emergAddInput;

    // Bank Details

    @FindBy(css = "#TabbedFolder1Page4.TabNormal > div > a")
    private WebElement bankDetailsLink;

    @FindBy(id = "BANKSORTCODE_txtInput")
    private WebElement bankSortCodeInput;

    @FindBy(id = "BANKACCOUNTNUMBER_txtInput")
    private WebElement bankAccountCodeInput;

    @FindBy(id = "BUILDINGSOCIETYREFERENCE1_txtInput")
    private WebElement buildingSocietyRefInput;

    @FindBy(id = "StandardFooterToolbar_StandardFooterToolbarSubmit")
    private WebElement submitButton;
    public void updatePersonalDetails(String title, String firstName, String lastName, String middleName, String dataInput1,
                                      String datainput2, String addressline1, String addressline2, String addressline3, String city,
                                      String postcode, String telephone, String email, String mobile) {

       Random random = new Random();

        Helper helper = new Helper();
        helper.switchToMainFrame();
        dateFromInput.sendKeys(dataInput1);
        wait.until(ExpectedConditions.visibilityOf(titleSelect));
        Select selectTitle = new Select(titleSelect);
        selectTitle.selectByValue(title);
        firstNameInput.clear();
        firstNameInput.sendKeys(firstName);
        middleNameInput.clear();
        middleNameInput.sendKeys(middleName);
        lastNameInput.clear();
        lastNameInput.sendKeys(lastName);

        helper.switchToMainFrame();

        maritalStatusImage.click();
        helper.switchToLookUpFrame();
        maritalStatusDivorced.click();
        helper.switchToMainFrame();
        maritalStatusSelectButton.click();

        helper.switchToMainFrame();

        Select natSel = new Select(nationalitySelect);
        natSel.selectByIndex(new Random().nextInt(natSel.getOptions().size()-1));

        Select ethSel = new Select(ethnicitySelect);
        ethSel.selectByIndex(new Random().nextInt(ethSel.getOptions().size()-1));

        Select relSel = new Select(religionSelect);
        relSel.selectByIndex(new Random().nextInt(relSel.getOptions().size()-1));

        contactDetailsLink.click();
        dateFromInput2.sendKeys(datainput2);
        addressline1Input.sendKeys(addressline1);
        addressline2Input.sendKeys(addressline2);
        addressline3Input.sendKeys(addressline3);
        cityInput.sendKeys(city);
        postcodeInput.sendKeys(postcode);

        Select countrySelect = new Select(countryInput);
        countrySelect.selectByIndex(new Random().nextInt(countrySelect.getOptions().size())-1);

        telephoneInput.sendKeys(telephone);
        mobileInput.sendKeys(mobile);
        emailInput.sendKeys(email);

        submitButton.click();





    }

}

package com.Ceridian.Pages;

import com.Ceridian.com.Helper;
import com.frameworkium.core.ui.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Saahme on 19/07/2016.
 */
public class LeaverProcessPage extends BasePage<LeaverProcessPage> {


    @FindBy(css = "#Employee.WebControl.ctLookup.ControlViewportDESKTOP > img")
    WebElement employeeNameLookUp;

    @FindBy(xpath = "/html/body/form/div[3]/table/tbody/tr/td/div/div/table/tbody/tr[1]/td[1]")
    WebElement firstEmployee;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/button[1]/span[@class='ui-button-text']")
    WebElement employeeLeaverSelectButton;

    @FindBy(id = "LeaveDate_txtInput")
    WebElement leaveDateInput;

    @FindBy(id = "Status_cboInput")
    WebElement leavingReasonSelect;

    @FindBy(id = "StandardFooterToolbar_StandardFooterToolbarSubmit")
    WebElement processLeaverSubmitButton;

    Helper helper = new Helper();

    public LeaverProcessPage processLeaver(String leaveDate, String reasonForLeaving) {
        helper.switchToMainFrame();
        wait.until(ExpectedConditions.visibilityOf(employeeNameLookUp));
        employeeNameLookUp.click();
        helper.switchToLookUpFrame();
        firstEmployee.click();
        helper.switchToMainFrame();
        employeeLeaverSelectButton.click();
        wait.until(ExpectedConditions.visibilityOf(leaveDateInput));
        leaveDateInput.sendKeys(leaveDate);

        Select selectLeaveReason = new Select(leavingReasonSelect);
        selectLeaveReason.selectByVisibleText(reasonForLeaving);

        processLeaverSubmitButton.click();

        return this;
    }

}

package com.Ceridian.Pages;

import com.frameworkium.core.ui.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Saahme on 19/07/2016.
 */
public class ProcessLeaverPage extends BasePage<ProcessLeaverPage> {

    @FindBy(id = "Employee_txtInput")
    WebElement employeeNameInput;

    @FindBy(id = "LeaveDate_txtInput")
    WebElement leaveDateInput;

    @FindBy(id = "Status_cboInput")
    WebElement reasonLeavingSelect;

    public ProcessLeaverPage completeLeaverForm(String leavingReason) {
        employeeNameInput.sendKeys();
        leaveDateInput.sendKeys();
        Select selectLeaving = new Select(reasonLeavingSelect);
        selectLeaving.selectByVisibleText(leavingReason);
        return this;
    }

}

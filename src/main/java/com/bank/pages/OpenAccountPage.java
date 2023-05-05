package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {
    By openAccount = By.xpath("//button[normalize-space()='Open Account']");
    By customerList = By.xpath("//select[@id='userSelect']");

    By currency = By.xpath("//select[@id='currency']");
    By process = By.xpath("//button[normalize-space()='Process']");

    //this method will click on the process button
    public void setProcess() {
        clickOnElement(process);
    }

    //this method will select the currency
    public void setCurrency(String cChange) {
        selectByVisibleTextFromDropDown(currency,cChange);
    }

    //this method will click on open account
    public void setOpenAccount() {
        clickOnElement(openAccount);
    }

    //this method will click on the customer
    public void setCustomerList(String value) {
        selectByVisibleTextFromDropDown(customerList, value);
    }

}

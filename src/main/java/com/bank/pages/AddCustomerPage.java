package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {
    By addCustomer = By.xpath("//button[normalize-space()='Add Customer']");
    By firstName = By.xpath("//input[@placeholder='First Name']");

    By lastName = By.xpath("//input[@placeholder='Last Name']");

    By postCode = By.xpath("//input[@placeholder='Post Code']");

    By submit = By.xpath("//button[@type='submit']");

    //this method will click on the add customer
    public void setSubmit() {
        clickOnElement(submit);
    }

    //this method will send text to the postcode field
    public void setPostCode(String pCode) {
        sendTextToElement(postCode, pCode);
    }

    //this  method will send the text to the firstname field
    public void setFirstName(String name) {
        sendTextToElement(firstName, name);
    }

    //this method will send the password to password filed
    public void setLastName(String lName) {
        sendTextToElement(lastName, lName);
    }


    //this method will click on the add customer button
    public void setAddCustomer() {
        clickOnElement(addCustomer);
    }

}

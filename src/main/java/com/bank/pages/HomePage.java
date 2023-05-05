package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By customerLogin = By.xpath("(//button[@class='btn btn-primary btn-lg'])[1]");

    By managerLogin = By.xpath("//button[normalize-space()='Bank Manager Login']");


    By homeLink = By.xpath("//button[contains(text(),'Home')]");

    //this method will click on homepage
    public void clickOnHome(){
        clickOnElement(homeLink);
    }


    //this method will click on the customerlog button
    public void setCustomerLogin(){
        clickOnElement(customerLogin);
    }
    //this method will click on the manaager login button
    public void setManagerLogin(){
        clickOnElement(managerLogin);
    }
}

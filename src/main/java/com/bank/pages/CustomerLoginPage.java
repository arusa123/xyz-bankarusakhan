package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {
    By accountName = By.id("userSelect");
    By login = By.xpath("//button[normalize-space()='Login']");
    By logOutText = By.xpath("//button[@class='btn logout']");
    By logout = By.xpath("//button[normalize-space()='Logout']");

    //this method will click on the logout button
    public void setLogout(){
        clickOnElement(logout);
    }

    //this method will get the text of the logout
    public String getLogOutText(){
        return getTextFromElement(logOutText);
    }
    //this method will click on the login button
    public void setLogin(){
        clickOnElement(login);
    }

    //this method will select the name
    public void setAccountName() {
        selectByVisibleTextFromDropDown(accountName, "Larry King");
    }
}

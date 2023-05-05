package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerPage extends Utility {
    By deposit = By.xpath("//button[normalize-space()='Deposit']");

    By sendDeposit = By.xpath("//input[@placeholder='amount']");

    By sendMoney = By.xpath("//button[@type='submit']");
    By depositText = By.xpath("//span[@class='error ng-binding']");

    By withdrawl = By.xpath("//button[normalize-space()='Withdrawl']");

    By withDrawlMoney = By.xpath("//input[@placeholder='amount']");
    By withDrawbutton = By.xpath("//button[normalize-space()='Withdraw']");



    //this method will click on the withdraw button
    public void setWithDrawbutton(){
        clickOnElement(withDrawbutton);
    }

    //this will send the text
    public void setWithDrawlMoney() {
        sendTextToElement(withDrawlMoney, "50");
    }


    //this method will click on the withdrawl button
    public void setWithdrawl() {
        clickOnElement(withdrawl);
    }

    //this method will get the deposit successful text
    public String getDepositText() {
        return getTextFromElement(depositText);
    }

    //this method will click on send deposit
    public void setSendMoney() {
        clickOnElement(sendMoney);
    }

    //this method will send the text to the deposit field
    public void setSendDeposit() {
        sendTextToElement(sendDeposit, "100");
    }

    //this method will click on deposit
    public void setDeposit() {
        clickOnElement(deposit);
    }
}

package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {
    By nameText = By.xpath("//label[normalize-space()='Your Name :']");

    //this method will get the my name text
    public String getNameText() {
        return getTextFromElement(nameText);
    }
}

package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {
    HomePage homePage = new HomePage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    AccountPage accountPage = new AccountPage();
    CustomerPage customerPage = new CustomerPage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();

    @Test   //1
    public void bankManagerShouldAddCustomerSuccessfully() {
        //click On "Bank Manager Login" Tab
        homePage.setManagerLogin();
        bankManagerLoginPage.clickOnAddCustomerLink();
        //click On "Add Customer" Tab
        addCustomerPage.setAddCustomer();
        //enter FirstName
        addCustomerPage.setFirstName("Larry");
        //enter LastName
        addCustomerPage.setLastName("King");
        //enter post code
        addCustomerPage.setPostCode("HA4 4DB");
        //click On "Add Customer" Button
        addCustomerPage.setSubmit();
        //popup display verify message "Customer added successfully"
        Assert.assertEquals(getTextFromAlert(), "Customer added successfully with customer id :6", "error");
        // click on "ok" button on popup.
        acceptAlert();
    }

    @Test    //2
    public void bankManagerShouldOpenAccountSuccessfully() throws InterruptedException {
//        click On "Bank Manager Login" Tab
        homePage.clickOnHome();
        homePage.setManagerLogin();
        bankManagerLoginPage.clickOnOpenAccountButton();
//        click On "Open Account" Tab
        openAccountPage.setOpenAccount();
//        Search customer that created in first test
        openAccountPage.setCustomerList("Larry King");
//        Select currency "Pound"
        openAccountPage.setCurrency("Pound");
//        click on "process" button
        openAccountPage.setProcess();
//        popup displayed verify message "Account created successfully"
        Assert.assertEquals(getTextFromAlert(), "Account created successfully with account Number :1016", "error");
//        click on "ok" button on popup.
        acceptAlert();
    }

    @Test    //3
    public void customerShouldLoginAndLogoutSuceessfully() throws InterruptedException {
        homePage.clickOnHome();
//        click on "Customer Login" Tab
        homePage.setCustomerLogin();
//        search customer that you created.
        customerLoginPage.setAccountName();
//                click on "Login" Button
        customerLoginPage.setLogin();
//        verify "Logout" Tab displayed.
        Assert.assertEquals(customerLoginPage.getLogOutText(), "Logout");
//        click on "Logout"
        customerLoginPage.setLogout();
//        verify "Your Name" text displayed.
        Assert.assertEquals(accountPage.getNameText(), "Your Name :", "error");

    }

    @Test    //4
    public void customerShouldDepositMoneySuccessfully() {
        homePage.clickOnHome();
//        click on "Customer Login" Tab
        homePage.setCustomerLogin();
//        search customer that you created.
        customerLoginPage.setAccountName();
//        click on "Login" Button
        customerLoginPage.setLogin();
//        click on "Deposit" Tab
        customerPage.setDeposit();
//        Enter amount 100
        customerPage.setSendDeposit();
//        click on "Deposit" Button
        customerPage.setSendMoney();
//        verify message "Deposit Successful"
        Assert.assertEquals(customerPage.getDepositText(), "Deposit Successful", "error");
    }

    @Test //5
    public void customerShouldWithdrawMoneySuccessfully() {
        homePage.clickOnHome();
//        click on "Customer Login" Tab
        homePage.setCustomerLogin();

//        search customer that you created.
        customerLoginPage.setAccountName();
//                click on "Login" Button
        customerLoginPage.setLogin();
//        click on "Withdrawl" Tab
        customerPage.setWithdrawl();
//        Enter amount 50
        customerPage.setWithDrawlMoney();
//        click on "Deposit" Button
        customerPage.setWithDrawbutton();
//        verify message "Transaction Successful"
        Assert.assertEquals(customerPage.getDepositText(), "Transaction successful", "error");

    }

}

package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    public LoginPage(){
    PageFactory.initElements(Driver.get(),this);
    }


    @FindBy(id = "signin_button")
    public WebElement signIn;

    @FindBy(xpath = "//input [@id='user_login']")
    public WebElement userName;

    @FindBy(xpath = "//input [@id='user_password']")
    public WebElement passWord;

    @FindBy(xpath = "//input [@type='submit']")
    public WebElement submit;


    public void login(String usernameStr, String passwordStr){
        signIn.click();
        new WebDriverWait(Driver.get(),3).until(ExpectedConditions.elementToBeClickable(userName));
        userName.sendKeys(usernameStr);
        passWord.sendKeys(passwordStr);
        submit.click();

    }

}

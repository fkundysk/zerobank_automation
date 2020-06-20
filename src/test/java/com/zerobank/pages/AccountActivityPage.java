package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityPage extends BasePage {

    @FindBy(xpath = "//table//tbody//tr//td[1]")
    public List<WebElement> dateColoums;

    @FindBy(xpath = "//li//a[@href='#ui-tabs-2']")
    public WebElement findTransactions;

    @FindBy (id = "aa_accountId")
    public WebElement dropDownOpt;

    @FindBy(xpath = "//th")
    public List<WebElement> actualHeaders;

    public String actualSelected(String selectedOption){
        Select actualSelect = new Select(Driver.get().findElement(By.id("aa_accountId")));
        String actualOption = actualSelect.getFirstSelectedOption().getText();
        System.out.println("actualOption = " + actualOption);
//        System.out.println("actualOption = " + actualOption);
        return actualOption;

    }



}
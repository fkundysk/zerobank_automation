package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    @FindBy(xpath = "//a[@href='/index.html']")
    public WebElement nameBank;

    @FindBy(css = "#searchTerm")
    public WebElement searchBar;

    @FindBy(xpath = "//i[@class='icon-cog']")
    public WebElement settingBTn;

    @FindBy(xpath = "//i[@class='icon-user']")
    public WebElement userInfo;

    @FindBy(id = "logout_link")
    public WebElement logOutBtn;

    @FindBy(id = "account_summary_tab")
    public WebElement accountSummary;

    @FindBy(id = "account_activity_tab")
    public WebElement accountActivity;

    @FindBy(id = "transfer_funds_tab")
    public WebElement transferFunds;

    @FindBy(id = "pay_bills_tab")
    public WebElement payBills;

    @FindBy(id = "money_map_tab")
    public WebElement moneyMap;

    @FindBy(id = "online_statements_tab")
    public WebElement onlineStatements;


    @FindBy (xpath = "//li[@class='active']")
    public WebElement actPage;


    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    /**
     * @return page name, for example: ZeroBank
     */
    public String getMainName() {

        BrowserUtils.waitForStaleElement(nameBank);
        return nameBank.getText();
    }


    public String getUserName(){
        return userInfo.getText();
    }

    public void logOut(){
        userInfo.click();
        BrowserUtils.waitFor(2);
        logOutBtn.click();
    }

    /**
     * This method will navigate user to the specific tab in Zero Bank application.
     * For example: if tab is equals to transfer funds
     * Then method will navigate user to this page: http://zero.webappsecurity.com/bank/transfer-funds.html
     * @param tab

     */
    public void navigateTo(String tab) {
        String tabLocator = "//a[.='" + tab + "']";
        try {
            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
            WebElement tabElement = Driver.get().findElement(By.xpath(tabLocator));
            new Actions(Driver.get()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
        }

    }
    public String currentPageName(){
        return actPage.getText();
    }


}



package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountSummaryPage extends BasePage {

    @FindBy(xpath = "//table//tbody//tr//td[1]//a")
    public List<WebElement> allLink;

    public void goLink(String linkStr)  {

      //  Driver.get().findElement(By.xpath("//table//td//a[contains(text(),'" + linkStr + "')]")).click();

        AccountSummaryPage accountSummaryPage = new AccountSummaryPage();
        for (int i = 0; i < accountSummaryPage.allLink.size(); i++) {
            String allLinkStr = accountSummaryPage.allLink.get(i).getText();
            System.out.println("allLinkStr = " + allLinkStr);
            if (allLinkStr.contains(linkStr)) {
                accountSummaryPage.allLink.get(i).click();
                //accountSummaryPage.allLink.get(i).findElement(By.xpath("//table//td//a[contains(text(),'" + linkStr + "')]")).click();

            }
        }
    }
}


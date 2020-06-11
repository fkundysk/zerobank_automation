package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.BasePage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class AccountActivityNavigationStepDef {


    @Given("the user is logged in")
    public void the_user_is_logged_in() throws InterruptedException {
        Driver.get().get(ConfigurationReader.get("url"));
        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");
        new LoginPage().login(username,password);

        AccountSummaryPage basePage = new AccountSummaryPage();
        String expectedPage = "Account Summary";
        String actualPage = BrowserUtils.currentPageName();

       Assert.assertEquals("Verify on Account Summary page", expectedPage,actualPage );
     }

    @When("the user clicks on {string} link on the Account Summary page")
    public void the_user_clicks_on_link_on_the_Account_Summary_page(String goLink) throws InterruptedException {
        AccountSummaryPage basePage = new AccountSummaryPage();
        String actualPage = BrowserUtils.currentPageName();
        basePage.goLink(goLink);
      //  Thread.sleep(2000);
    }

    @Then("the Account Activity page should be displayed")
    public void the_Account_Activity_page_should_be_displayed() throws InterruptedException {
        AccountActivityPage accountActivityPage = new AccountActivityPage();
        String expectedPage = "Account Activity";
        String actualPage = BrowserUtils.currentPageName();
        System.out.println("actualPage = " + actualPage);
        Assert.assertEquals("Verify on Account Activity page", expectedPage,actualPage );
       // Thread.sleep(2000);
    }
    @Then("Account drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String selectedOption) throws InterruptedException {
        AccountActivityPage accountActivityPage = new AccountActivityPage();
      //  Assert.assertEquals(accountActivityPage.actualSelected(selectedOption)selectedOption);
        accountActivityPage.actualSelected(selectedOption);
    //     System.out.println("PASS");
//        Thread.sleep(5000);
//        accountActivityPage.logOut();
    }

}

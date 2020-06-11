package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.FindTransactionsPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Date;

public class FindTransactionsInAccountActivityStepDef {

    @Given("the user accesses the Find Transactions tab")
    public void the_user_accesses_the_Find_Transactions_tab() throws InterruptedException {
        Driver.get().get(ConfigurationReader.get("url"));
        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");
        new LoginPage().login(username, password);

        AccountSummaryPage accountSummaryPage = new AccountSummaryPage();

        accountSummaryPage.navigateTo("Account Activity");

        AccountActivityPage accountActivityPage = new AccountActivityPage();
        BrowserUtils.doubleClick(accountActivityPage.findTransactions);

    }
    @When("the user enters date range from {string} to {string}")
    public void the_user_enters_date_range_from_to(String startDay, String endDay) {
        FindTransactionsPage findTransactionsPage = new FindTransactionsPage();

        findTransactionsPage.startDay.sendKeys(startDay);
        findTransactionsPage.endDay.sendKeys(endDay);

    }

    @When("click search")
    public void click_search() {
        new FindTransactionsPage().searchBtn.click();
        BrowserUtils.waitFor(2);
    }

    @Then("results table should only show transactions dates between {string} to {string}")
    public void results_table_should_only_show_transactions_dates_between_to(String startDay, String endDay) {

        FindTransactionsPage findTransactionsPage = new FindTransactionsPage();

        Date simpleDay = new Date();


        System.out.println("findTransactionsPage.dayList.size() = " + findTransactionsPage.dayList.size());
        
        startDay = startDay.replaceAll("-", "");
        endDay = endDay.replaceAll("-", "");


        int sDay = Integer.parseInt(startDay);
        System.out.println("sDay = " + sDay);;
        int eDay = Integer.parseInt(endDay);
        System.out.println("eDay = " + eDay);

        ArrayList<Integer> list = new ArrayList<>();

        for (WebElement each : findTransactionsPage.dayList) {
            String text= each.getText().replaceAll("-", "");
            int num = Integer.parseInt(text);
            list.add(num);
        }
        System.out.println("list = " + list);



      //  findTransactionsPage.listDaysCheck(startDay,endDay);


    }

    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() {
        System.out.println("dsdsd");
    }

    @Then("results table should only not contain transactions dated {string}")
    public void results_table_should_only_not_contain_transactions_dated(String string) {
        System.out.println("hhhh");
    }

}
package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.*;

public class AccountActivityStepDef {


    @Given("the user should be on Account Activity page")
    public void the_user_should_be_on_Account_Activity_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        LoginPage loginPage = new LoginPage();
        loginPage.login(ConfigurationReader.get("username"), ConfigurationReader.get("password"));
        AccountSummaryPage accountSummaryPage = new AccountSummaryPage();
        for (WebElement each : accountSummaryPage.navList ) {
            System.out.println("Nav List : " + each.getText());
            if (each.getText().equals("Account Activity")){
                each.click();
                break;
            }
        }

        Assert.assertTrue(new AccountActivityPage().currentPageName().contentEquals("Account Activity"));

    }

    @When("Following options should be on Account drop down")
    public void following_options_should_be_on_Account_drop_down(List<String> dropDownOptions) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

        AccountActivityPage accountActivityPage = new AccountActivityPage();
        Select options = new Select(accountActivityPage.dropDownOpt);

        List <String> actualOptionList = new LinkedList<>();

        for (WebElement each : options.getOptions()) {
            if(!actualOptionList.contains(each.getText()))
            actualOptionList.add(each.getText());
        }
        System.out.println(actualOptionList);
        Assert.assertEquals(actualOptionList, dropDownOptions);

    }

    @When("Default option should be {string}")
    public void default_option_should_be(String selected) {
        AccountActivityPage accountActivityPage = new AccountActivityPage();
        Select options = new Select(accountActivityPage.dropDownOpt);
        accountActivityPage.actualSelected(selected);

    }

    @Then("Following column names should be on Transactions table")
    public void following_column_names_should_be_on_Transactions_table(List<String> expectedHeaders) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
       AccountActivityPage accountActivityPage = new AccountActivityPage();

       List<String> actualHeaders = new ArrayList<>();

        for (WebElement each : accountActivityPage.actualHeaders) {
             actualHeaders.add(each.getText());
             System.out.println("Actual Header : " + each.getText());
        }
       Assert.assertEquals(expectedHeaders,actualHeaders);

    }


}

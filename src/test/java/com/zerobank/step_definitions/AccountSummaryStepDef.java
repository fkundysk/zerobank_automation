package com.zerobank.step_definitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.awt.*;
import java.util.List;

public class AccountSummaryStepDef {

    @When("the user should be able to Account Summary Page")
    public void the_user_should_be_able_to_Account_Summary_Page() {

    }

    @Then("the user should see following options")
    public void the_user_should_see_following_options(List<String> subNavList)  {

        AccountSummaryPage accountSummaryPage = new AccountSummaryPage();
        System.out.println("accountSummaryPage.subNavList.size() = " + accountSummaryPage.subNavList.size());
        List<String> actualNavList = BrowserUtils.getElementsText(accountSummaryPage.subNavList);

        Assert.assertEquals(subNavList,actualNavList);
        System.out.println("actualOptions = " + actualNavList);
        System.out.println("menuOptions = " + subNavList);
    }

}

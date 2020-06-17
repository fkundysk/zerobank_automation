package com.zerobank.step_definitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class LoginStepsDef {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        LoginPage loginPage = new LoginPage();
        loginPage.signIn.click();
        String expectedTitle = "Log in";
        String actualTitle = Driver.get().getTitle();
//        System.out.println("actualTitle = " + actualTitle);
        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }

    @When("the user enter the valid credentials")
    public void the_user_enter_the_valid_credentials() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.userName.sendKeys("username");
        loginPage.passWord.sendKeys("password");

//        Thread.sleep(3000);
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
     new LoginPage().submit.click();


    }

    @Then("Summary page should be displayed")
    public void summary_page_should_be_displayed() {
        AccountSummaryPage basePage = new AccountSummaryPage();
        String expectedPage = "Account Summary";
        String actualPage = BrowserUtils.currentPageName();

        Assert.assertEquals("Verify on Account Summary page", expectedPage,actualPage );
    }

    @When("the user enter {string} {string} credentials")
    public void the_user_enter_credentials(String username, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.userName.sendKeys(username);
        loginPage.passWord.sendKeys(password);
//        loginPage.submit.click();

    }

    @Then("the user should not be able to login")
    public void the_user_should_not_be_able_to_login() {
       new LoginPage().submit.click();
    }

    @Then("Error message should be displayed")
    public void error_message_should_be_displayed() {
        LoginPage loginPage = new LoginPage();
        String expectedMsg = "Login and/or password are wrong.";
        String actualMsg = loginPage.alert.getText();
        Assert.assertTrue(actualMsg.contains(expectedMsg));
        Assert.assertTrue(loginPage.alert.isDisplayed());
    }

}

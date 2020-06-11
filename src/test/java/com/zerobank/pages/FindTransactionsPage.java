package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import io.cucumber.java.en_lol.WEN;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class FindTransactionsPage extends AccountActivityPage{

    @FindBy(id = "aa_fromDate")
    public WebElement startDay;

    @FindBy(id = "aa_toDate")
    public WebElement endDay;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchBtn;

    @FindBy(xpath = "//div[@id='ui-tabs-2']//tbody//tr/td[1]")
    public List<WebElement> dayList;

//    public void listDaysCheck(String startDay, String endDay){
//
//        FindTransactionsPage findTransactionsPage = new FindTransactionsPage();
//        System.out.println("findTransactionsPage.dayList.size() = " + findTransactionsPage.dayList.size());
//
//        startDay = startDay.replaceAll("-", "");
//        endDay = endDay.replaceAll("-", "");
//
//        int sDay = Integer.parseInt(startDay);
//        System.out.println("sDay = " + sDay);;
//        int eDay = Integer.parseInt(endDay);
//        System.out.println("eDay = " + eDay);
//
//        ArrayList<Integer> list = new ArrayList<>();
//
//        for (WebElement each : findTransactionsPage.dayList) {
//            String text= each.getText().replaceAll("-", "");
//            int num = Integer.parseInt(text);
//            list.add(num);
//        }
//        System.out.println("list = " + list);
//
//    }



}

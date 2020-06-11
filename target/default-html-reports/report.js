$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/FindTransactionsInAccountActivity.feature");
formatter.feature({
  "name": "Find Transactions in Account Activity",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search data range",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user accesses the Find Transactions tab",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.step_definitions.FindTransactionsInAccountActivityStepDef.the_user_accesses_the_Find_Transactions_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters date range from \"2012-09-02\" to \"endDay\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.FindTransactionsInAccountActivityStepDef.the_user_enters_date_range_from_to(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click search",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.FindTransactionsInAccountActivityStepDef.click_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "results table should only show transactions dates between \"2012-09-01\" to \"2012-09-06\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.FindTransactionsInAccountActivityStepDef.results_table_should_only_show_transactions_dates_between_to(java.lang.String,java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.IllegalArgumentException\n\tat java.base/java.util.Date.parse(Date.java:616)\n\tat java.base/java.util.Date.\u003cinit\u003e(Date.java:274)\n\tat com.zerobank.step_definitions.FindTransactionsInAccountActivityStepDef.results_table_should_only_show_transactions_dates_between_to(FindTransactionsInAccountActivityStepDef.java:57)\n\tat ✽.results table should only show transactions dates between \"2012-09-01\" to \"2012-09-06\"(file:///Users/ysk/IdeaProjects/zerobank_automation/src/test/resources/features/FindTransactionsInAccountActivity.feature:8)\n",
  "status": "failed"
});
formatter.step({
  "name": "the results should be sorted by most recent date",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.FindTransactionsInAccountActivityStepDef.the_results_should_be_sorted_by_most_recent_date()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user enters date range from \"2012-09-02\" to \"2012-09-06\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.FindTransactionsInAccountActivityStepDef.the_user_enters_date_range_from_to(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click search",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.FindTransactionsInAccountActivityStepDef.click_search()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "results table should only show transactions dates between \"2012-09-02\" to \"2012-09-06\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.FindTransactionsInAccountActivityStepDef.results_table_should_only_show_transactions_dates_between_to(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "results table should only not contain transactions dated \"2012-09-01\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.FindTransactionsInAccountActivityStepDef.results_table_should_only_not_contain_transactions_dated(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});
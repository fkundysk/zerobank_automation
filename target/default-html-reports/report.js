$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AccountActivity.feature");
formatter.feature({
  "name": "Account Activity",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Account Activity Page",
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
  "name": "the user should be on Account Activity page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountActivityStepDef.the_user_should_be_on_Account_Activity_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Following options should be on Account drop down",
  "rows": [
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountActivityStepDef.following_options_should_be_on_Account_drop_down(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Default option should be \"Saving\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountActivityStepDef.default_option_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Following column names should be on Transactions table",
  "rows": [
    {},
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountActivityStepDef.following_column_names_should_be_on_Transactions_table(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
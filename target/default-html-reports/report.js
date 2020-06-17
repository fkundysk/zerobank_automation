$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Users should be able to login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepsDef.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user enter the valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepsDef.the_user_enter_the_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepsDef.the_user_should_be_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Summary page should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepsDef.summary_page_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Not login with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user enter \"\u003cusername\u003e\" \"\u003cpassword\u003e\" credentials",
  "keyword": "When "
});
formatter.step({
  "name": "the user should not be able to login",
  "keyword": "Then "
});
formatter.step({
  "name": "Error message should be displayed",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "username1",
        "password"
      ]
    },
    {
      "cells": [
        "username",
        "password1"
      ]
    },
    {
      "cells": [
        "",
        "password"
      ]
    },
    {
      "cells": [
        "username",
        ""
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepsDef.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Not login with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user enter \"username1\" \"password\" credentials",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepsDef.the_user_enter_credentials(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should not be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepsDef.the_user_should_not_be_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Error message should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepsDef.error_message_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepsDef.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Not login with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user enter \"username\" \"password1\" credentials",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepsDef.the_user_enter_credentials(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should not be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepsDef.the_user_should_not_be_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Error message should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepsDef.error_message_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepsDef.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Not login with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user enter \"\" \"password\" credentials",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepsDef.the_user_enter_credentials(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should not be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepsDef.the_user_should_not_be_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Error message should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepsDef.error_message_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepsDef.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Not login with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user enter \"username\" \"\" credentials",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepsDef.the_user_enter_credentials(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should not be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepsDef.the_user_should_not_be_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Error message should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepsDef.error_message_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
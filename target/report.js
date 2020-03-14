$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/login.feature");
formatter.feature({
  "name": "To validate the login functionality",
  "description": "",
  "keyword": "Feature"
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
  "name": "User has to be there in FB login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageStepDefinition.user_has_to_be_there_in_FB_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify whether the user can able to login with all possible combinations",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User has to enter username, password and click the login button",
  "rows": [
    {
      "cells": [
        "username",
        "vicky3"
      ]
    },
    {
      "cells": [
        "password",
        "677"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageStepDefinition.user_has_to_enter_username_password_and_click_the_login_button(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to find the error page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStepDefinition.user_has_to_find_the_error_page()"
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
  "name": "User has to be there in FB login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageStepDefinition.user_has_to_be_there_in_FB_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify whether the user can able to login with all possible combinationss",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User has to enter valid username, password and click the login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageStepDefinition.user_has_to_enter_valid_username_password_and_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to find the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStepDefinition.user_has_to_find_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
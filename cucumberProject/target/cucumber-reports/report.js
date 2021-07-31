$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("learnOne.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: anik@agile1tech.com"
    }
  ],
  "line": 3,
  "name": "login panel",
  "description": "",
  "id": "login-panel",
  "keyword": "Feature"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDef.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 4055509100,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "validating login panel with valid credentials",
  "description": "",
  "id": "login-panel;validating-login-panel-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@uat"
    },
    {
      "line": 8,
      "name": "@abc"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user enters valid username",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user enters valid password",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user should be on the account page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user should close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDef.user_enters_valid_username()"
});
formatter.result({
  "duration": 141591400,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_enters_valid_password()"
});
formatter.result({
  "duration": 77989600,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 125847700,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_should_be_on_the_account_page()"
});
formatter.result({
  "duration": 25515200,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_should_close_the_browser()"
});
formatter.result({
  "duration": 945920000,
  "status": "passed"
});
});
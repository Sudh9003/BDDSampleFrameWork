$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/ColumnVerification.feature");
formatter.feature({
  "name": "Validate Orange HRM Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User logs in By UserName and Password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigate to the loginPage",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.user_navigate_to_the_loginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters userID and password",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSteps.user_enters_user_id_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate user name at dashboardpage",
  "keyword": "Then "
});
formatter.match({
  "location": "DashboardPageSteps.validate_user_name_at_dashboardpage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "System User Search",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigate to the loginPage",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.user_navigate_to_the_loginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters userID and password",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSteps.user_enters_user_id_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validate system user \"Admin\" search option",
  "keyword": "Then "
});
formatter.match({
  "location": "DashboardPageSteps.user_validate_system_user_search_option(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to logout",
  "keyword": "Then "
});
formatter.match({
  "location": "DashboardPageSteps.user_should_be_able_to_logout()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
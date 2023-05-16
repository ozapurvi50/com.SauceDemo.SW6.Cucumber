$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Sauce Demo",
  "description": "",
  "id": "sauce-demo",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4506117300,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "User is on homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User enters username",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters Password",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.userEntersUsername()"
});
formatter.result({
  "duration": 316008100,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.userEntersPassword()"
});
formatter.result({
  "duration": 66014000,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.userClicksOnLoginButton()"
});
formatter.result({
  "duration": 153929400,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "User should Login Successfully with valid Credentials",
  "description": "",
  "id": "sauce-demo;user-should-login-successfully-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@smoke"
    },
    {
      "line": 8,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User is able to Login and able to verify text Products",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.userIsAbleToLoginAndAbleToVerifyTextProducts()"
});
formatter.result({
  "duration": 97957300,
  "status": "passed"
});
formatter.after({
  "duration": 890486600,
  "status": "passed"
});
});
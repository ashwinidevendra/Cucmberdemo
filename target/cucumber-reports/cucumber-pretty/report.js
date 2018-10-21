$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("demo.feature");
formatter.feature({
  "line": 2,
  "name": "Demo",
  "description": "",
  "id": "demo",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Demo"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Successful open application",
  "description": "",
  "id": "demo;successful-open-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPage.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 1781188204,
  "status": "passed"
});
});
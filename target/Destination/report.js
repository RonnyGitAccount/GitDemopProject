$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Your Logo Page Automation",
  "description": "",
  "id": "your-logo-page-automation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Verify Different Option on Home Page",
  "description": "",
  "id": "your-logo-page-automation;verify-different-option-on-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User id on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User Clicks on Contact Us",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Contact Details are Populated",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.user_id_on_Home_Page()"
});
formatter.result({
  "duration": 18540879100,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_Clicks_on_Contact_Us()"
});
formatter.result({
  "duration": 7457857300,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.contact_Details_are_Populated()"
});
formatter.result({
  "duration": 54878700,
  "status": "passed"
});
});
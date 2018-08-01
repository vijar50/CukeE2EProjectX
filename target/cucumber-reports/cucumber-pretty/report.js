$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AmazonHome.feature");
formatter.feature({
  "line": 1,
  "name": "Test homepage functionality - search,categories,shop by,login",
  "description": "",
  "id": "test-homepage-functionality---search,categories,shop-by,login",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "User navigates to Amazon home page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on the homepage on URL \"http://www.amazon.co.uk\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I should see the logo",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.amazon.co.uk",
      "offset": 29
    }
  ],
  "location": "HomeSearchTests.i_am_on_the_page_on_URL(String)"
});
formatter.result({
  "duration": 2976222235,
  "status": "passed"
});
formatter.match({
  "location": "HomeSearchTests.i_should_see_the_logo()"
});
formatter.result({
  "duration": 53494245,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 21,
      "value": "#@Ignore"
    }
  ],
  "line": 22,
  "name": "Failed log in attempt",
  "description": "",
  "id": "test-homepage-functionality---search,categories,shop-by,login;failed-log-in-attempt",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "I click the sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I am on the login page",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I enter my username \"test@ball.com\" and password \"abc12345\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "login fails with \"We cannot find an account with that e-mail address\"",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeLoginTestsv2.i_click_on_signin_button()"
});
formatter.result({
  "duration": 672344576,
  "status": "passed"
});
formatter.match({
  "location": "HomeLoginTestsv2.i_am_on_the_login_page()"
});
formatter.result({
  "duration": 64734717,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test@ball.com",
      "offset": 21
    },
    {
      "val": "abc12345",
      "offset": 50
    }
  ],
  "location": "HomeLoginTestsv2.i_enter_credentials(String,String)"
});
formatter.result({
  "duration": 509976883,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "We cannot find an account with that e-mail address",
      "offset": 18
    }
  ],
  "location": "HomeLoginTestsv2.login_fail(String)"
});
formatter.result({
  "duration": 49576891,
  "status": "passed"
});
formatter.after({
  "duration": 110438463,
  "status": "passed"
});
formatter.uri("AmazonResults.feature");
formatter.feature({
  "line": 1,
  "name": "Test results functionality - sort by, star rating, brand, pagination",
  "description": "",
  "id": "test-results-functionality---sort-by,-star-rating,-brand,-pagination",
  "keyword": "Feature"
});
formatter.uri("AmazonTodayDeals.feature");
formatter.feature({
  "line": 1,
  "name": "Test Today Deals page. Adding deals to basket, sort by price",
  "description": "",
  "id": "test-today-deals-page.-adding-deals-to-basket,-sort-by-price",
  "keyword": "Feature"
});
});
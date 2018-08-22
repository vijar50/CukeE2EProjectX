$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AmazonHome.feature");
formatter.feature({
  "line": 1,
  "name": "Test homepage functionality - search,categories,shop by,login",
  "description": "",
  "id": "test-homepage-functionality---search,categories,shop-by,login",
  "keyword": "Feature"
});
formatter.uri("AmazonLoggedIn.feature");
formatter.feature({
  "line": 1,
  "name": "Test homepage functionality - search,categories,shop by,login",
  "description": "",
  "id": "test-homepage-functionality---search,categories,shop-by,login",
  "keyword": "Feature"
});
formatter.background({
  "comments": [
    {
      "line": 2,
      "value": "#Uses the steps from AmazonHome"
    }
  ],
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
  "name": "I click the sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I am on the login page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I enter my username \"rajivmtest@hotmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter my password \"p@ssword1985\" and sign in",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "\"Rajiv\" is signed in",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.amazon.co.uk",
      "offset": 29
    }
  ],
  "location": "HomeSearchTestsv2.i_am_on_the_homepage_URL(String)"
});
formatter.result({
  "duration": 1437404463,
  "status": "passed"
});
formatter.match({
  "location": "HomeLoginTestsv2.i_click_on_signin_button()"
});
formatter.result({
  "duration": 771859795,
  "status": "passed"
});
formatter.match({
  "location": "HomeLoginTestsv2.i_am_on_the_login_page()"
});
formatter.result({
  "duration": 54930252,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rajivmtest@hotmail.com",
      "offset": 21
    }
  ],
  "location": "HomeLoginTestsv2.i_enter_credentials(String)"
});
formatter.result({
  "duration": 556731581,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "p@ssword1985",
      "offset": 21
    }
  ],
  "location": "LoggedInSuccessfulTests.i_enter_password(String)"
});
formatter.result({
  "duration": 1587272691,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rajiv",
      "offset": 1
    }
  ],
  "location": "LoggedInSuccessfulTests.login_succeeded(String)"
});
formatter.result({
  "duration": 62692254,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 37,
      "value": "#@Ignore"
    }
  ],
  "line": 38,
  "name": "I add an Address",
  "description": "",
  "id": "test-homepage-functionality---search,categories,shop-by,login;i-add-an-address",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 39,
  "name": "I click on Your Account",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "I click on \"Your Addresses\"",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I click add Address",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I enter my address details",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I add the Address",
  "keyword": "Then "
});
formatter.match({
  "location": "AddressTests.i_click_on_yourAcc_link()"
});
formatter.result({
  "duration": 548560447,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your Addresses",
      "offset": 12
    }
  ],
  "location": "AddressTests.i_click_start_trial(String)"
});
formatter.result({
  "duration": 587833506,
  "status": "passed"
});
formatter.match({
  "location": "AddressTests.i_enter_my_card_details()"
});
formatter.result({
  "duration": 540546247,
  "status": "passed"
});
formatter.match({
  "location": "AddressTests.i_add_card()"
});
formatter.result({
  "duration": 2028164338,
  "status": "passed"
});
formatter.match({
  "location": "AddressTests.card_addition_fails()"
});
formatter.result({
  "duration": 3000187426,
  "status": "passed"
});
formatter.after({
  "duration": 1000244739,
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
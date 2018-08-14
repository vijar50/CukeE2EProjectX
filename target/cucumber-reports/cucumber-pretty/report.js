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
  "duration": 1327451894,
  "status": "passed"
});
formatter.match({
  "location": "HomeLoginTestsv2.i_click_on_signin_button()"
});
formatter.result({
  "duration": 558100335,
  "status": "passed"
});
formatter.match({
  "location": "HomeLoginTestsv2.i_am_on_the_login_page()"
});
formatter.result({
  "duration": 55031731,
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
  "duration": 556954161,
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
  "duration": 1735667590,
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
  "duration": 38789825,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 30,
      "value": "#@Ignore"
    }
  ],
  "line": 31,
  "name": "I opt into Amazon Prime",
  "description": "",
  "id": "test-homepage-functionality---search,categories,shop-by,login;i-opt-into-amazon-prime",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 32,
  "name": "I click on Try Prime",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "I click on Start 30 Day Free Trial",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I enter my credit card details",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I click add card",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "card addition fails",
  "keyword": "Then "
});
formatter.match({
  "location": "PrimeTests.i_click_on_try_prime()"
});
formatter.result({
  "duration": 1049831248,
  "status": "passed"
});
formatter.match({
  "location": "PrimeTests.i_click_start_trial()"
});
formatter.result({
  "duration": 863909247,
  "status": "passed"
});
formatter.match({
  "location": "PrimeTests.i_enter_my_card_details()"
});
formatter.result({
  "duration": 931086457,
  "status": "passed"
});
formatter.match({
  "location": "PrimeTests.i_add_card()"
});
formatter.result({
  "duration": 123546480,
  "status": "passed"
});
formatter.match({
  "location": "PrimeTests.card_addition_fails()"
});
formatter.result({
  "duration": 47370302,
  "status": "passed"
});
formatter.after({
  "duration": 1000219446,
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
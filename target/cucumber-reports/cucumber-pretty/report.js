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
  "duration": 1564766861,
  "status": "passed"
});
formatter.match({
  "location": "HomeLoginTestsv2.i_click_on_signin_button()"
});
formatter.result({
  "duration": 630298228,
  "status": "passed"
});
formatter.match({
  "location": "HomeLoginTestsv2.i_am_on_the_login_page()"
});
formatter.result({
  "duration": 54360504,
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
  "duration": 564455387,
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
  "duration": 1662957754,
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
  "duration": 77929168,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 23,
      "value": "#@Ignore"
    }
  ],
  "line": 24,
  "name": "I create a shopping list",
  "description": "",
  "id": "test-homepage-functionality---search,categories,shop-by,login;i-create-a-shopping-list",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "I click on Your Lists",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "I select Wish List",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I click Create a List",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I set a List name of \"My List\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I Create the List",
  "keyword": "Then "
});
formatter.match({
  "location": "ListTests.i_click_on_your_lists()"
});
formatter.result({
  "duration": 42473574,
  "status": "passed"
});
formatter.match({
  "location": "ListTests.i_select_wish_list()"
});
formatter.result({
  "duration": 1689068169,
  "status": "passed"
});
formatter.match({
  "location": "ListTests.create_a_list()"
});
formatter.result({
  "duration": 902838483,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My List",
      "offset": 22
    }
  ],
  "location": "ListTests.set_list_name(String)"
});
formatter.result({
  "duration": 265708264,
  "status": "passed"
});
formatter.match({
  "location": "ListTests.shopping_list_is_created()"
});
formatter.result({
  "duration": 2065540660,
  "status": "passed"
});
formatter.after({
  "duration": 1000243865,
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
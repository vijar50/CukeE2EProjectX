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
  "duration": 1300841939,
  "status": "passed"
});
formatter.match({
  "location": "HomeLoginTestsv2.i_click_on_signin_button()"
});
formatter.result({
  "duration": 552346225,
  "status": "passed"
});
formatter.match({
  "location": "HomeLoginTestsv2.i_am_on_the_login_page()"
});
formatter.result({
  "duration": 53370197,
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
  "duration": 596119468,
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
  "duration": 2652234773,
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
  "duration": 36361218,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 11,
      "value": "#@Ignore"
    }
  ],
  "line": 12,
  "name": "I add an item to my Wish List",
  "description": "",
  "id": "test-homepage-functionality---search,categories,shop-by,login;i-add-an-item-to-my-wish-list",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I click on Your Lists",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I select Wish List",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I add an idea \"My Idea\" to my list",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click Add to list",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "My Wish List item is saved",
  "keyword": "Then "
});
formatter.match({
  "location": "WishListTests.i_click_on_your_lists()"
});
formatter.result({
  "duration": 46004896,
  "status": "passed"
});
formatter.match({
  "location": "WishListTests.i_select_wish_list()"
});
formatter.result({
  "duration": 1836715848,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My Idea",
      "offset": 15
    }
  ],
  "location": "WishListTests.i_add_an_idea_to_wish_list(String)"
});
formatter.result({
  "duration": 1029162095,
  "status": "passed"
});
formatter.match({
  "location": "WishListTests.i_add_to_wish_list()"
});
formatter.result({
  "duration": 63886897,
  "status": "passed"
});
formatter.match({
  "location": "WishListTests.wish_list_is_saved()"
});
formatter.result({
  "duration": 1063004680,
  "status": "passed"
});
formatter.after({
  "duration": 1000244121,
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
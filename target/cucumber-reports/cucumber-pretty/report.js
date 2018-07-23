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
  "duration": 3131908043,
  "status": "passed"
});
formatter.match({
  "location": "HomeSearchTests.i_should_see_the_logo()"
});
formatter.result({
  "duration": 53263850,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 6,
      "value": "#  @Ignore"
    }
  ],
  "line": 7,
  "name": "Search for item",
  "description": "",
  "id": "test-homepage-functionality---search,categories,shop-by,login;search-for-item",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I fill in the search box with \"GTX 1080\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click the search button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I am on the results page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "GTX 1080",
      "offset": 31
    }
  ],
  "location": "HomeSearchTests.i_fill_in_search(String)"
});
formatter.result({
  "duration": 78410799,
  "status": "passed"
});
formatter.match({
  "location": "HomeSearchTests.i_click_on_button()"
});
formatter.result({
  "duration": 2337630458,
  "status": "passed"
});
formatter.match({
  "location": "HomeSearchTests.i_am_on_the_results_page()"
});
formatter.result({
  "duration": 35249073,
  "status": "passed"
});
formatter.after({
  "duration": 1111481245,
  "status": "passed"
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
  "duration": 2230208714,
  "status": "passed"
});
formatter.match({
  "location": "HomeSearchTests.i_should_see_the_logo()"
});
formatter.result({
  "duration": 33752084,
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
  "name": "Search in Fashion category",
  "description": "",
  "id": "test-homepage-functionality---search,categories,shop-by,login;search-in-fashion-category",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I click the dropdown and select \"Fashion\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I fill in the search box with \"GTX 1080\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click the search button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I am on the results page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Fashion",
      "offset": 33
    }
  ],
  "location": "HomeSearchTests.i_click_the_dropdown(String)"
});
formatter.result({
  "duration": 99561332,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "GTX 1080",
      "offset": 31
    }
  ],
  "location": "HomeSearchTests.i_fill_in_search(String)"
});
formatter.result({
  "duration": 89070260,
  "status": "passed"
});
formatter.match({
  "location": "HomeSearchTests.i_click_on_button()"
});
formatter.result({
  "duration": 2596642094,
  "status": "passed"
});
formatter.match({
  "location": "HomeSearchTests.i_am_on_the_results_page()"
});
formatter.result({
  "duration": 46843994,
  "status": "passed"
});
formatter.after({
  "duration": 1108672070,
  "status": "passed"
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
  "duration": 2235929732,
  "status": "passed"
});
formatter.match({
  "location": "HomeSearchTests.i_should_see_the_logo()"
});
formatter.result({
  "duration": 59126578,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 17,
      "value": "#@Ignore"
    }
  ],
  "line": 18,
  "name": "Shop by Department",
  "description": "",
  "id": "test-homepage-functionality---search,categories,shop-by,login;shop-by-department",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "I shop by Department I choose \"Electronics \u0026 Computers\" and \"Headphones\"",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I am on the \"Headphones \u0026 Earphones\" page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Electronics \u0026 Computers",
      "offset": 31
    },
    {
      "val": "Headphones",
      "offset": 61
    }
  ],
  "location": "HomeDeptTests.i_shop_by(String,String)"
});
formatter.result({
  "duration": 4868645520,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Headphones \u0026 Earphones",
      "offset": 13
    }
  ],
  "location": "HomeDeptTests.product_landing_page(String)"
});
formatter.result({
  "duration": 50150513,
  "status": "passed"
});
formatter.after({
  "duration": 1117825741,
  "status": "passed"
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
  "duration": 2231814724,
  "status": "passed"
});
formatter.match({
  "location": "HomeSearchTests.i_should_see_the_logo()"
});
formatter.result({
  "duration": 31244136,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 21,
      "value": "# @Ignore"
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
  "location": "HomeLoginTests.i_click_on_signin_button()"
});
formatter.result({
  "duration": 1784593620,
  "status": "passed"
});
formatter.match({
  "location": "HomeLoginTests.i_am_on_the_login_page()"
});
formatter.result({
  "duration": 56149782,
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
  "location": "HomeLoginTests.i_enter_credentials(String,String)"
});
formatter.result({
  "duration": 486956883,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "We cannot find an account with that e-mail address",
      "offset": 18
    }
  ],
  "location": "HomeLoginTests.login_fail(String)"
});
formatter.result({
  "duration": 43365735,
  "status": "passed"
});
formatter.after({
  "duration": 1109333680,
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
});
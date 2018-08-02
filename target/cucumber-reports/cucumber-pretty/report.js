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
  "duration": 81255124,
  "status": "passed"
});
formatter.match({
  "location": "HomeSearchTests.i_should_see_the_logo()"
});
formatter.result({
  "duration": 30737580,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 6,
      "value": "#@Ignore"
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
  "duration": 1359552536,
  "status": "passed"
});
formatter.match({
  "location": "HomeSearchTests.i_click_on_button()"
});
formatter.result({
  "duration": 1382715076,
  "status": "passed"
});
formatter.match({
  "location": "HomeSearchTests.i_am_on_the_results_page()"
});
formatter.result({
  "duration": 38874079,
  "status": "passed"
});
formatter.after({
  "duration": 110567302,
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
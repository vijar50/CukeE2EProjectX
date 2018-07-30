$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AmazonHome.feature");
formatter.feature({
  "line": 1,
  "name": "Test homepage functionality - search,categories,shop by,login",
  "description": "",
  "id": "test-homepage-functionality---search,categories,shop-by,login",
  "keyword": "Feature"
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
  "name": "I click on Today Deals",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Im on the \"Today\u0027s Deals\" page",
  "keyword": "And "
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
  "duration": 2804249957,
  "status": "passed"
});
formatter.match({
  "location": "TodayDealsAddTests.i_click_on_today_deals()"
});
formatter.result({
  "duration": 1604670218,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Today\u0027s Deals",
      "offset": 11
    }
  ],
  "location": "TodayDealsAddTests.im_on_today_deals_page(String)"
});
formatter.result({
  "duration": 83934911,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 13,
      "value": "#@Ignore"
    }
  ],
  "line": 14,
  "name": "Filter by Deal of the Day",
  "description": "",
  "id": "test-today-deals-page.-adding-deals-to-basket,-sort-by-price;filter-by-deal-of-the-day",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "I click \"Deal of the Day\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I only see items that are deals",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Deal of the Day",
      "offset": 9
    }
  ],
  "location": "TodayDealsPriceTests.i_click_dotd(String)"
});
formatter.result({
  "duration": 128032504,
  "status": "passed"
});
formatter.match({
  "location": "TodayDealsPriceTests.i_only_see_items_that_are_deals()"
});
formatter.result({
  "duration": 1387587872,
  "status": "passed"
});
formatter.after({
  "duration": 110902697,
  "status": "passed"
});
});
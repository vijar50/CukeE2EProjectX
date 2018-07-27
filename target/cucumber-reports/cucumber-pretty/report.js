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
  "duration": 2939698660,
  "status": "passed"
});
formatter.match({
  "location": "TodayDealsTests.i_click_on_today_deals()"
});
formatter.result({
  "duration": 1579656647,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Today\u0027s Deals",
      "offset": 11
    }
  ],
  "location": "TodayDealsTests.im_on_today_deals_page(String)"
});
formatter.result({
  "duration": 77794367,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 7,
      "value": "#@Ignore"
    }
  ],
  "line": 8,
  "name": "Add a Deal to the Basket",
  "description": "",
  "id": "test-homepage-functionality---search,categories,shop-by,login;add-a-deal-to-the-basket",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I click on a deal",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "My basket counter is incremented",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I click checkout",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "My basket has an item",
  "keyword": "Then "
});
formatter.match({
  "location": "TodayDealsTests.i_click_on_a_deal()"
});
formatter.result({
  "duration": 102326845,
  "status": "passed"
});
formatter.match({
  "location": "TodayDealsTests.basket_counter_incremented()"
});
formatter.result({
  "duration": 1226995897,
  "status": "passed"
});
formatter.match({
  "location": "TodayDealsTests.i_click_checkout()"
});
formatter.result({
  "duration": 838043271,
  "status": "passed"
});
formatter.match({
  "location": "TodayDealsTests.basket_has_item()"
});
formatter.result({
  "duration": 99402570,
  "status": "passed"
});
formatter.after({
  "duration": 109132924,
  "status": "passed"
});
});
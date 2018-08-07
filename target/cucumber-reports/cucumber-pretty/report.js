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
formatter.background({
  "line": 3,
  "name": "User views Amazon results",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on the results on URL \"https://www.amazon.co.uk/s/ref\u003dnb_sb_noss_2?url\u003dsearch-alias%3Daps\u0026field-keywords\u003dGTX+1080\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.amazon.co.uk/s/ref\u003dnb_sb_noss_2?url\u003dsearch-alias%3Daps\u0026field-keywords\u003dGTX+1080",
      "offset": 28
    }
  ],
  "location": "ResultsSortTestsv2.i_am_on_the_results_page_on_URL(String)"
});
formatter.result({
  "duration": 1593534046,
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
  "name": "Sort by Price: High to Low",
  "description": "",
  "id": "test-results-functionality---sort-by,-star-rating,-brand,-pagination;sort-by-price:-high-to-low",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I sort by \"Price: High to Low\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "\"PNY GeForce GTX 1080 Ti Custom Design\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Price: High to Low",
      "offset": 11
    }
  ],
  "location": "ResultsSortTestsv2.i_sort_by(String)"
});
formatter.result({
  "duration": 269944153,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PNY GeForce GTX 1080 Ti Custom Design",
      "offset": 1
    }
  ],
  "location": "ResultsSortTestsv2.result_is_displayed(String)"
});
formatter.result({
  "duration": 2061061271,
  "status": "passed"
});
formatter.after({
  "duration": 1002257509,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "User views Amazon results",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on the results on URL \"https://www.amazon.co.uk/s/ref\u003dnb_sb_noss_2?url\u003dsearch-alias%3Daps\u0026field-keywords\u003dGTX+1080\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.amazon.co.uk/s/ref\u003dnb_sb_noss_2?url\u003dsearch-alias%3Daps\u0026field-keywords\u003dGTX+1080",
      "offset": 28
    }
  ],
  "location": "ResultsSortTestsv2.i_am_on_the_results_page_on_URL(String)"
});
formatter.result({
  "duration": 1286363682,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 10,
      "value": "#@Ignore"
    }
  ],
  "line": 11,
  "name": "Sort by Price: Low to High",
  "description": "",
  "id": "test-results-functionality---sort-by,-star-rating,-brand,-pagination;sort-by-price:-low-to-high",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I sort by \"Price: Low to High\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "\"PNY GeForce GTX 1080 Ti Custom Design\" is not displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Price: Low to High",
      "offset": 11
    }
  ],
  "location": "ResultsSortTestsv2.i_sort_by(String)"
});
formatter.result({
  "duration": 116258923,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PNY GeForce GTX 1080 Ti Custom Design",
      "offset": 1
    }
  ],
  "location": "ResultsSortTestsv2.is_not_displayed(String)"
});
formatter.result({
  "duration": 1980139200,
  "status": "passed"
});
formatter.after({
  "duration": 1000690190,
  "status": "passed"
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
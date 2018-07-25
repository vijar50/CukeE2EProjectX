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
  "location": "ResultsSortTests.i_am_on_the_page_on_URL(String)"
});
formatter.result({
  "duration": 3233329671,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 18,
      "value": "#@Ignore"
    }
  ],
  "line": 19,
  "name": "filter by brand",
  "description": "",
  "id": "test-results-functionality---sort-by,-star-rating,-brand,-pagination;filter-by-brand",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "I select a brand",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I see results from \"ASUS\" only",
  "keyword": "Then "
});
formatter.match({
  "location": "ResultsBrandTests.i_select_a_brand()"
});
formatter.result({
  "duration": 188440115,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ASUS",
      "offset": 20
    }
  ],
  "location": "ResultsBrandTests.results_from_brand(String)"
});
formatter.result({
  "duration": 2872685204,
  "status": "passed"
});
formatter.after({
  "duration": 109430859,
  "status": "passed"
});
});
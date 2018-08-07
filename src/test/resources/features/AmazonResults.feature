Feature: Test results functionality - sort by, star rating, brand, pagination

Background: User views Amazon results
  Given I am on the results on URL "https://www.amazon.co.uk/s/ref=nb_sb_noss_2?url=search-alias%3Daps&field-keywords=GTX+1080"

  #@Ignore
  Scenario: Sort by Price: High to Low
    When I sort by "Price: High to Low"
    Then "PNY GeForce GTX 1080 Ti Custom Design" is displayed
  #@Ignore
  Scenario: Sort by Price: Low to High
    When I sort by "Price: Low to High"
    Then "PNY GeForce GTX 1080 Ti Custom Design" is not displayed
  @Ignore
  Scenario: 4 star rating
    When I select a "4 Stars & Up" rating
    Then I don't see a lower rating on the results page
  @Ignore
  Scenario: filter by brand
    When I select a brand
    Then I see results from "ASUS" only
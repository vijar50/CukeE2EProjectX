Feature: Test results functionality - sort by, star rating, brand, pagination

Background: User navigates to Amazon home page
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
  Scenario: Select 3 star rating
    When I click the dropdown and select "Fashion"
    And I fill in "twotabsearchtextbox" with "GTX 1080"
    And I click the search button
    Then I am on the results page
  @Ignore
  Scenario: Select a brand
    When I shop by Department I choose "Electronics & Computers" and "Headphones"
    Then I am on the "Headphones & Earphones" page
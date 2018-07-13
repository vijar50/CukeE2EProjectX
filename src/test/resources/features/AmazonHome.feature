Feature: Test homepage functionality - search,login,categories

Background: User navigates to Amazon home page
  Given I am on the homepage on URL "http://www.amazon.co.uk"
  Then I should see the logo
  @Ignore
  Scenario: Search for item
    When I fill in "twotabsearchtextbox" with "GTX 1080"
    And I click the search button
    Then I am on the results page
  @Ignore-
  Scenario: Search in Fashion category
    When I click the dropdown and select "Fashion"
    And I fill in "twotabsearchtextbox" with "GTX 1080"
    And I click the search button
    Then I am on the results page

  Scenario: Shop by Department
    When I shop by "Department" I choose "Electronics & Computers" and "Headphones"
    Then I am on the "Headphones & Earphones" page
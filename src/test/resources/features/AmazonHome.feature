Feature: Home page search

Background: User navigates to Amazon home page
  Given I am on the homepage on URL "http://www.amazon.co.uk"
  Then I should see the logo

  Scenario: Search for item
    When I fill in "twotabsearchtextbox" with "GTX 1080"
    And I click the search button
    Then I am on the results page


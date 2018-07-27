Feature: Test homepage functionality - search,categories,shop by,login

Background: User navigates to Amazon home page
  Given I am on the homepage on URL "http://www.amazon.co.uk"
  Then I click on Today Deals
  And Im on the "Today's Deals" page
  #@Ignore
  Scenario: Add a Deal to the Basket
    When I click on a deal
    Then My basket counter is incremented
    And I click checkout
    Then My basket has an item


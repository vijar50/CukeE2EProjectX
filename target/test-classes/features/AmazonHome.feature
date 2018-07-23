Feature: Test homepage functionality - search,categories,shop by,login

Background: User navigates to Amazon home page
  Given I am on the homepage on URL "http://www.amazon.co.uk"
  Then I should see the logo
#  @Ignore
  Scenario: Search for item
    When I fill in the search box with "GTX 1080"
    And I click the search button
    Then I am on the results page
  #@Ignore
  Scenario: Search in Fashion category
    When I click the dropdown and select "Fashion"
    And I fill in the search box with "GTX 1080"
    And I click the search button
    Then I am on the results page
  #@Ignore
  Scenario: Shop by Department
    When I shop by Department I choose "Electronics & Computers" and "Headphones"
    Then I am on the "Headphones & Earphones" page
 # @Ignore
  Scenario: Failed log in attempt
    When I click the sign in button
    And I am on the login page
    And I enter my username "test@ball.com" and password "abc12345"
    Then login fails with "We cannot find an account with that e-mail address"
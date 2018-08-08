Feature: Test homepage functionality - search,categories,shop by,login
#Uses the steps from AmazonHome
Background: User navigates to Amazon home page
  Given I am on the homepage on URL "http://www.amazon.co.uk"
  When I click the sign in button
  And I am on the login page
  And I enter my username "rajivmtest@hotmail.com"
  And I enter my password "p@ssword1985" and sign in
  Then "Rajiv" is signed in

  #@Ignore
  Scenario: I add an item to my Wish List
    When I click on Your Lists
    And I select Wish List
    And I add an idea "My Idea" to my list
    And I click Add to list
    Then My Wish List item is saved


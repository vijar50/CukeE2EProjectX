Feature: Test homepage functionality - search,categories,shop by,login
#Uses the steps from AmazonHome
Background: User navigates to Amazon home page
  Given I am on the homepage on URL "http://www.amazon.co.uk"
  When I click the sign in button
  And I am on the login page
  And I enter my username "rajivmtest@hotmail.com"
  And I enter my password "p@ssword1985" and sign in
  Then "Rajiv" is signed in

  @Ignore
  Scenario: I add an item to my Wish List
    When I click on Your Lists
    And I select Wish List
    And I add an idea "My Idea" to my list
    And I click Add to list
    Then My Wish List item is saved
  @Ignore
  Scenario: I delete an item from my Wish List
    When I click on Your Lists
    And I select Wish List
    Then I delete the latest item
  @Ignore
  Scenario: I create a shopping list
    When I click on Your Lists
    And I select Wish List
    And I click Create a List
    And I set a List name of "My List"
    Then I Create the List
  @Ignore
  Scenario: I opt into Amazon Prime
    When I click on Try Prime
    And I click on Start 30 Day Free Trial
    And I enter my credit card details
    And I click add card
    Then card addition fails
  #@Ignore
  Scenario: I add an Address
    When I click on Your Account
    And I click on "Your Addresses"
    And I click add Address
    And I enter my address details
    Then I add the Address

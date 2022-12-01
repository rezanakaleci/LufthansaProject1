Feature: Luma application Feature

  Background:
    Given  User Navigate to Web Page
    Then   User Click on sign in link
    Given User login with the credentials, email "SergiK@gmail.com" and password "SergiK12@"


Scenario: Test 2 User Sign In to web page
  And    User check your username is displayed on right corner of the page.
  Then   Click on User profile and Sign out

  @smoke
  Scenario: Test 3 Check page filters
   When  User on store menu click on Women dropdown.
   Then  User hover over Tops dropdown on the open pop up
   And   User click on Jacket menu option
   And   User from Shopping Options panel click on Color dropdown
   And   User choose one of the colors
   Then  User check that all the displayed products have the selected color bordered in red.
    And  User click on Price dropdown
    And  User select the first option that is displayed
    And  User check that only two product are displayed on the page.
   Then  User for each product displayed ,check that the price matches the defined criteria.


    Scenario: Test 4 Checking Wish List test
     When  User on store menu click on Women dropdown.
     Then  User hover over Tops dropdown on the open pop up
     And   User click on Jacket menu option
     And   User from Shopping Options panel click on Color dropdown
     And   User choose one of the colors
     And  User click on Price dropdown
     And  User select the first option that is displayed
      When User remove price filter
      And  User Check the items number displayed is increased
      And  User add the two first item in the wish List.
      And  User check successful message.
      Then User click on User Profile, and check the correct number of items is displayed



    Scenario: Test 5 Shopping Cart test
      When  User on store menu click on Women dropdown.
      Then  User hover over Tops dropdown on the open pop up
      And   User click on Jacket menu option
      And   User from Shopping Options panel click on Color dropdown
      And   User choose one of the colors
      And  User click on Price dropdown
      And  User select the first option that is displayed
      When User Add all displayed items to the Shopping Cart
     Then User Check successful message
     And  User Open the Shopping Cart
     And  User verify that we have navigated to Shopping Cart Page
     Then User verify that the prices sum for all items is equal to Order Total price in the Summary section


    Scenario: Test 6: Empty Shopping Cart Test
     When  User on store menu click on Women dropdown.
     Then  User hover over Tops dropdown on the open pop up
     And   User click on Jacket menu option
     And   User from Shopping Options panel click on Color dropdown
     And   User choose one of the colors
     And  User click on Price dropdown
     And  User select the first option that is displayed
     When User Add all displayed items to the Shopping Cart
     Then User Check successful message
     And  User Open the Shopping Cart
      When User delete the first item on shopping cart
     Then User Verify that the number of elements in Shopping Cart table is decreased by one
     And  User repeat steps one and two until the last item is deleted.
     And  User verify that Shopping Cart is empty and check message "You have no items in your shopping cart" is displayed
     Then User close the browser
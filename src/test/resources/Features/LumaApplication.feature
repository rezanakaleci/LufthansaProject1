Feature: Luma application Feature

  Background:
    Given Navigate to "https://magento.softwaretestingboard.com/"
    Then User Click on Sign In link
    Given User login with the credentials, email "SergiK@gmail.com" and "SergiK12@"


Scenario: Test 2 User Sign In to web page
  And    User check your username is displayed on right corner of the page.
  Then   Click on User profile and Sign out

@smoke
  Scenario: Test 3 Check page filters
   When On store menu click on Women dropdown.
   Then Hover over Tops dropdown on the open pop up and click on Jacket menu option.
   And From Shopping Options panel click on Color dropdown and choose one of the colors.
   Then Check that all the displayed products have the selected color bordered in red.
    And  Click on Price dropdown and select the first option "$50.00-$59.99" and check that only two product are displayed on the page.
   Then For each product displayed ,check that the price matches the defined criteria.


    Scenario: Test 4 Checking Wish List test
     When On store menu click on Women dropdown.
     Then Hover over Tops dropdown on the open pop up and click on Jacket menu option.
     And From Shopping Options panel click on Color dropdown and choose one of the colors.
     And  Click on Price dropdown and select the first option "$50.00-$59.99" and check that only two product are displayed on the page.
     And Remove Price filter
     Then Check the items number displayed is increased
    And Add the two first item in the Wish List.
    And Check successful message.
    Then Click on User Profile, and check the correct number of items is displayed


    Scenario: Test 5 Shopping Cart test
      When On store menu click on Women dropdown.
      Then Hover over Tops dropdown on the open pop up and click on Jacket menu option.
      And From Shopping Options panel click on Color dropdown and choose one of the colors.
      And  Click on Price dropdown and select the first option "$50.00-$59.99" and check that only two product are displayed on the page.
      When User Add all displayed items to the Shopping Cart
     Then User Check successful message
     And  User Open the Shopping Cart
     And  Verify that we have navigated to Shopping Cart Page
     Then Verify that the prices sum for all items is equal to Order Total price in the Summary section


    Scenario: Test 6: Empty Shopping Cart Test
      When Delete the first item on shopping cart
     Then Verify that the number of elements in Shopping Cart table is decreased by "1"
     And Repeat steps one and two until the last item is deleted.
     And Verify that Shopping Cart is empty and check message "You have no items in your shopping cart" is displayed
     Then Close the browser
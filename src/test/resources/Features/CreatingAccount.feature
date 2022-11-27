Feature: Creating new account at Luma Application


  Scenario: User can create an account
    Given Navigate to "https://magento.softwaretestingboard.com/"
    Then  Click Create an Account link
    And   Check tittle of the open page
    And   Fill in form fields
    Then  Click Create an Account button
    And   Check successful message is displayed on the screen
    Then  Click on User profile and Sign out
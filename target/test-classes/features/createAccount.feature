  Feature: Verify create an account functionality
    
    Scenario: Verify the user should be able to create an account
    
    Given user opens the Chrome browser
    And user navigates to the application URL "https://magento.softwaretestingboard.com/"
    Then user should see the homepage with title "Home Page"
    When user clicks on the "Create an Account" button
    Then user should see the registration page with title "Create New Customer Account"
    And user enter First Name "Swap"
    And user enter Last Name "Gadekar"
    And user enter Email "swapnil1234@gmail.com"
    And user enter password "Swapnil@SG123"
    And user enter Confirm Password "Swapnil@SG123"
    When user click on Create an Account button
    Then user navigates to the HomePage with title "My Account"
   
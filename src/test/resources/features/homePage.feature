Feature: Verify homepage and registration page titles

  Scenario: User verifies homepage title and navigates to registration
    Given user opens the Chrome browser
    And user navigates to the application URL "https://magento.softwaretestingboard.com/"
    Then user should see the homepage with title "Home Page"
    When user clicks on the "Create Account" button
    Then user should see the registration page with title "Create New Customer Account"
    
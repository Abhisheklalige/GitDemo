Feature: feature to test login functionality

  Scenario: Check login is successfil wiith valid creadentials
    Given user is on login page
    When user enters username and password
    And clicks on login page
    Then user is navigated to the Home Page

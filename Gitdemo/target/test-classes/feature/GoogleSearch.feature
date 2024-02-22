Feature: fearture to test google test functionality

  Scenario: Validate google search is working
    Given browser is open
    And user is on google search page
    When user enter a test in search box
    And click on enter
    Then user navigated to serached results

Feature: Test login functionlityt

  Scenario Outline: Check login is successfil wiith valid creadentials
    Given browser is open
    And user is on login page
    When user enter <username> and <password>
    And user click on login button
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | Raghav   |    12345 |
      | Ele      |    12345 |

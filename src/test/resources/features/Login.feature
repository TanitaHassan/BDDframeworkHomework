Feature: valid login test

  @Sprint1
  Scenario: as a tester open facebook application and give name and pass and click login button and it should be loggedin
    Given open application
    When enter username
    And enter password
    And click the login button
    Then i can logged in

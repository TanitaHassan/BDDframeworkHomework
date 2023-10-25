@Sprint3
Feature: validation test of facebook

  Scenario Outline: i open application using browser and url and give username and password and it clicked and i can be logged in
    Given i enter <browser> and <Url> for open apps
    When I enter <name> and <pass>
    And i click logg in button
    Then user close the apps

    Examples: 
      | browser  | Url                         | name     | pass  |
      | "Chrome" | "https://www.facebook.com/" | "tanita" | "123" |
      | "Edge"   | "https://www.facebook.com/" | "hassan" | "121" |

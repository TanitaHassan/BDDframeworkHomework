
@Sprint2
Feature: validation facebook testing

  
  Scenario: as a tester i have to open my account and can enter userName and pass so that i can clicked and logeed in
    Given i give "Chrome" and "https:/www.facebook.com/"
    When I put my name "tanita"
    And put my password "123"
    And click loginButton
    Then I should be logeeed into in

  Scenario: as a tester i have to open my account and can enter userName and pass so that i can clicked and logeed in
    Given i give "Edge" and "https:/www.facebook.com/"
    When I put my name "tanita1"
    And put my password "1231"
    And click loginButton
    Then I should be logeeed into in

  Scenario: as a tester i have to open my account and can enter userName and pass so that i can clicked and logeed in
    Given i give "Chrome" and "https:/www.facebook.com/"
    When I put my name "tanita2"
    And put my password "1234"
    And click loginButton
    Then I should be logeeed into in

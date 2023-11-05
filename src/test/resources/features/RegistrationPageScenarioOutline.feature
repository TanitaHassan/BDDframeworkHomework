@Sprint5
Feature: valid data registration test

  Scenario Outline: as a tester i open registration page of facebook and put all information to check validation
    Given i enter <browser> and <Url> for open the applicatin
    When click the registration button
    And put firstName field <enterFirstName>
    And Put lastName box <enterLastName>
    And email BoX putting <enterEmail>
    And for confirm email address <enterConfirmEmail>
    And input Password <enterPass>
    And enter birthmonth <enterYourBirthMonth>
    And put BirthDay <enterYourBirthDay>
    And inPut birthYear <enterBirthYear>
    And Put GenderName <enterYourGender>
    Then i can create a new account on facebook

    Examples: 
      | browser  | Url                         | enterFirstName | enterLastName | enterEmail       | enterConfirmEmail | enterPass | enterYourBirthMonth | enterYourBirthDay | enterBirthYear | enterYourGender |
      | "Chrome" | "https://www.facebook.com/" | "aysha"        | " islam"      | "t121@gmail.com" | "t121@gmail.com"  | "123"     | "Feb"               | "20"              | "1979"         | "female"        |

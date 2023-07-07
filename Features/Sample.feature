Feature: all login scenarios

  @login @valid
  Scenario: to test the functionality of login button for valid input
    Given I am on login page
  #  When I enter username and password
    When I enter "admin" and "admin"
    And I click on login button
    Then I should land on home page

  @login
  Scenario: to test the functionality of login button for invalid input
    Given I am on login page
  #  When I enter invalid username and invalid password
    When I enter "sasas" and "23233"
    And I click on login button
    Then I should get error message

  @login
  Scenario: to test the functionality of login button for blank input
    Given I am on login page
   # When I enter blank username and blank password
    When I enter "" and ""
    And I click on login button
    Then I should get Another error message

    @userReg
  Scenario: to test the functionality of submit button for user registration form
    Given I am on user registration page
    When I enter below data
      | Amol | Ujagare | amol@gmail.com |  9988776654 |
    And I click on submit button
    Then user should be submitted

      @subscribe
      Scenario Outline: to test the functionality of subscribe button for user subscription form
        Given I am on user subscription page
        When I enter <name> , <phone> , <email>
        And I click on subscribe button
        Then user should be subscribed
        Examples:
          | name    | phone | email             |
          | satya   | 12345 | satya@gmail.com   |
          | buvana  | 22345 | buvana@gmail.com  |
          | amol    | 32345 | amol@gmail.com    |
          | sandhya | 42345 | sandhya@gmail.com |

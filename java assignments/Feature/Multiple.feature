Feature: Sauce Demo Login

  Scenario Outline: User attempts to log in with different credentials
    Given I am on the Sauce Demo login page
    When I enter username "<username>" and password "<password>"
    And I click the login button
    Then I should see "<result>"

  Examples:
    | username         | password        | result            |
    | standard_user    | secret_sauce    | the products page | 
    | locked_out_user  | secret_sauce    | an error message  |
    | invalid_user     | wrong_password  | an error message  |
    | admin_user       | secret_sauce    | an error message  |

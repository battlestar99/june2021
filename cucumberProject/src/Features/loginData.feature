Feature: login panel testing with multiple data

  Scenario Outline: validating login panel with different credentials
    Given user is on the login page
    When user enters username "<username>"
    And user enters password "<password>"
    And user clicks on the login button
    Then user should be on the account page
    And user should close the browser

    Examples: 
      | username                 | password      |
      | dfdsf                    | dfasad        |
      | standard_user            | secret_sauce  |
      | locked_out_user          | secret_sauce  |
      | problem_user             | secret_sauce  |
      | performance_glitch_user  | secret_sauce  |
      | performance_glitch_user1 | secret_sauce1 |

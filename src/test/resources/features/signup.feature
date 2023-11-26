Feature: user creates an account

  Scenario Outline: User is able to create an account
    Given user is on the main page
    When  user clicks on signup button
    Then  user enters username "<username>"
    And   user enters password "<password>"
    Then  user clicks on second signup button

    @signup
    Examples:
      | username   | password        |
      | LebronnJj  | LebronJames123! |
      | StephenRRC | Curry6545@@     |
      | Scholes    | United498!      |
      | Kevin      | DeBruyne!@#     |



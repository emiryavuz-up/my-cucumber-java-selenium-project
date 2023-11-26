Feature: user logs-in from main page

  Scenario Outline: user clicks on logIn and logs-in using the same dataTable as register.feature

    Given user is on the main page
    When  user clicks on login button
    Then  user enters registered username "<username>"
    And   user enters registered password "<password>"
    Then  user clicks on second login button

    @login
    Examples:
      | username      | password    |
      | Kyliannn      | Mbappe123!  |
      | Christiano    | Ronaldo55@@ |
      | Scholes       | United498!  |
      | KevinDeBruyne | DeBruyne!@# |
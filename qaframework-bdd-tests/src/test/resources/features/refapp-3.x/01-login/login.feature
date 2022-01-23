Feature: User Login

  Scenario Outline: User login to the dashboard
    Given user arrives at the login page
    When the user logs in with "<username>" and "<password>" to the "<location>"
    Then the user should be "<ability>" to login

    Examples:
      | username   | password   | location          | ability |
      | admin      | Admin123   | Inpatient Ward | able    |
      | wrong user | Admin123   | Inpatient Ward | unable  |
      | admin      | wrong pass | Inpatient Ward | unable  |

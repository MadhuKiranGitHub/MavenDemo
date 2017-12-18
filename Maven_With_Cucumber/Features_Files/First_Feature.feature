Feature: Login Page
# Data Driven
  Scenario Outline: Login Scenario
    Given Open Browser
    When Give valid "<username>" and "<password>"
    Then User should be successfully logged in

    Examples: 
      | username | password  |
      | madhu1   | password1 |
      | madhu2   | password2 |
      | madhu3   | password3 |

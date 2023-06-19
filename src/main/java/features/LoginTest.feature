@SEARCHGOOGLE
Feature: login test

  @OpenLogin
  Scenario Outline:
    When I send log "<LOGIN>" and pass"<PASSWORD>"
    Then Chek result "<RESULT>"
    Examples:
      | LOGIN   | PASSWORD  | RESULT |
      | Vasiliy | vasiok404 | false  |
      | Nikolay | Nikolay26 | false  |
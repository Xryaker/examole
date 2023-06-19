@SEARCHGOOGLE
@SmokeTest
Feature: Google search

  @SEARCH
  Scenario: print result by search word "Ukraine"
    When I open site "https://www.google.com/"
    And I send search word "Ukraine" in google search field
    Then Print all url links


  Scenario: print result by search word "Ukraine"
    When I open site "https://lms.ithillel.ua/groups/63baa4cc52ed2c1958ddea4d/feed"

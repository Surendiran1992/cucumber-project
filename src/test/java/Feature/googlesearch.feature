@Google
Feature: google search engine checking

  @Search_Test
  Scenario: Google search engine test scenario
    Given User is on google page
    When enter the desired input
    And clicks the search button
    Then user must see the search result

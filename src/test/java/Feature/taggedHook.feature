@taggedHook
Feature: Example of tagged hook

  @hook1
  Scenario: Scenario of first hook
    Given I am from first step
    When I am from second step
    Then I am from third step


  @hook2
  Scenario: Scenario of second hook
    Given I am from first step
    When I am from second step
    Then I am from third step

	@hook3
  Scenario: Scenario of third hook
    Given I am from first step
    When I am from second step
    Then I am from third step


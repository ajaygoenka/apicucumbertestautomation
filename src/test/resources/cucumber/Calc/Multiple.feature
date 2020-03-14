@mul

Feature: Multiplication
Description: The purpose of this feature is to multiple two number and add the number of background

  Background: Add the below number to all the scenario
    Given I have variable 5
    And I want to add the 5 in all scenarios

    @1
  Scenario: multiply a and b A
    Given I have variable 5
    And I have variable 6
    When I multiplication 5 and 6
    Then I display the Result

  @2
  Scenario: multiply a and b B
    Given I have variable 1
    And I have variable 2
    When I multiplication 1 and 2
    Then I display the Execution

  @3
  Scenario: multiply a and b C
    Given I have variable 5
    And I have variable 6
    When I multiplication 5 and 6
    Then I display the Calc

 @4
  Scenario Outline: multiply a and b with multiple data
    Given I have variable <variableA>
    And I have variable <variableB>
    When I multiplication <variableA> and <variableB>
    Then I display the <status>
    Examples:
      | variableA | variableB | status |
      | 5         | 6         | calc   |
      | 3         | 1         | report |
      | 4         | 2         | exec   |
      | 7         | 3         | raghav |
      | 8         | 4         | chavi  |


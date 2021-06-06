Feature:Login functionality
  As a end user
  I enter the valid sign in  details
  so that I can successfully logged in

  @regression
  Scenario Outline: Login with valid and Invalid credential

    Given user is on a Home Page
    When user click on signin link
    And enters  "<username>" and "<password>"
    And user click on signin button
    Then user can check login "<status>"
    Examples:
    |username             |password   | status|
    | prashdiu@hotmail.com|welcomevb1*| valid |
    |prashdiu@yahoo.com   |welcomevb1*| invalid|
    |prashdiu@hotmail.com |Welcomevb  | invalid|




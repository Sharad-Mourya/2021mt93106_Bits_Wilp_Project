@AllTests
Feature: User Creates Account in Salesforce Application

  @CreateAccount
  Scenario Outline: User Login with valid user details and creates account
    Given User opens salesforce login page and login with valid credential
    Then User is successfully logged in
    When User clicks on Account tab
    When User selects New
    And enters "<account name>"
    And clicks on Save
    Then New Account is created successfully

    Examples:
      | account name |
      | AccountName  |

  @CancelAccount
  Scenario: User Login with valid user details and creates account
    Given User opens salesforce login page and login with valid credential
    Then User is successfully logged in
    When User clicks on Account tab
    When User selects New
    And clicks on Cancel
    Then New Account is cancelled successfully


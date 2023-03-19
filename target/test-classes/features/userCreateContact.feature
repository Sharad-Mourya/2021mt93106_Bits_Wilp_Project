
Feature: User Creates Contact in Salesforce Application

  @CreateContact
Scenario Outline: User Login with valid user details and creates contact
Given User opens salesforce login page and login with valid credential
Then User is successfully logged in
When User clicks on Contact tab
When User selects New
And enters "<firstName>" and "<lastName>"
And clicks on Save
Then New Contact is created successfully

Examples:
| firstName            | lastName |
| Fname                | LName |
@login
Feature: CRM application login functionality

  User Story:
  As a user, I should be able to login with valid credentials to different accounts. And home page should be displayed.
  Accounts are: HR user, Marketing user, and Helpdesk user

  Background:
    Given  user is on the login page

  @hr
  Scenario: Positive login as hr user
    #Given  user is on the login page
    When user enters the hr user information
    Then user should be able to login

  @marketing
  Scenario: Positive login as marketing user
    #Given  user is on the login page
    When user enters the marketing user information
    Then user should be able to login

  @helpdesk
  Scenario: Positive login as helpdesk user
    #Given  user is on the login page
    When user enters the helpdesk user information
    Then user should be able to login


  @param
  Scenario: Positive login as hr user
    #Given  user is on the login page
    When user enters the "hr" user information
    Then user should be able to login


  @validLoginWithParamsOutLine
  Scenario Outline: Positive login with valid credential
    #Given user is on the login page
    When the user login with "<username>","<password>"
    Then user should be able to login

    Examples:
      | username              | password |
      | hr1@cydeo.com         | UserUser |
      | hr24@cydeo.com        | UserUser |
      | hr56@cydeo.com        | UserUser |
      | marketing94@cydeo.com | UserUser |
      | marketing75@cydeo.com | UserUser |
      | marketing48@cydeo.com | UserUser |
      | helpdesk59@cydeo.com  | UserUser |
      | helpdesk86@cydeo.com  | UserUser |
      | helpdesk43@cydeo.com  | UserUser |


    @incorrectlogincredentialserrormessage
  Scenario Outline: Incorrect login credentials error message display
    #Given user is on the login page
    When user enters incorrect login credentials "<username>","<password>"
    Then user should see error message displayed

    Examples:
      | username               | password |
      | hr1@cydeo.com          | useruser |
      | marketing94@cydeo.com  | useruser |
      | helpdesk86@cydeo.com   | useruser |
      | hr561@cydeo.com        | UserUser |
      | Mmarketing75@cydeo.com | UserUser |
      | helppDdesk59@cydeo.com | UserUser |


      @remembermeonthiscomputer
      Scenario: Remember me on this computer link verification
        Then user should see remember me on this computer link
        And user should be able to click to the checkbox


        @passwordisinbulletsigns
        Scenario: Password is in bullet sign verification
          When password should be in bullet signs by default














@SendMessages
Feature: User should be able to send messages
  User Story:As a user, I should be able to send messages by clicking on Message tab in the Activity Stream.


  Scenario Outline: Positive sending message from different accounts

    Given User enter correct "<userName>" and "<password>"
    When user click on message box area
    And type a "<message>" in the messageContent
    Then user click on send message
    And user can see the "<messaged displayed>"

    Examples:
      | userName              | password | message         | messaged displayed |
      | hr101@cydeo.com       | UserUser | Good morning002 | Good morning002    |
      | marketing75@cydeo.com | UserUser | Good evening002 | Good evening002    |
      | helpdesk59@cydeo.com  | UserUser | Good night002   | Good night002      |


  Scenario Outline: Error message should displayed if the User doesn't fill the mandatory field Message
    Given User enter correct credentials "<user Name>" and "<Password>"
    When user click on message box area
    Then User left the messageContent empty and click on send message
    And user see the ErrorMessageeTitle
    Examples:
      | user Name              | Password |
      | hr90@cydeo.com         | UserUser |
      | marketing100@cydeo.com | UserUser |
      | helpdesk95@cydeo.com   | UserUser |


  Scenario: Error message should displayed if the user keeps the recipient empty
    Given User enter correct credentials "hr91@cydeo.com" and "UserUser"
    When user click on message box area
    And type a "Just a message..." in the messageContent
    Then user should be able to see All employees selected by default in the recipient box
    And User keep the recipient empty
    Then user click on send message
    And User see the ErrorRecipientMessage



  Scenario: User can cancel sending the message at any time before sending
    Given User enter correct credentials "hr93@cydeo.com" and "UserUser"
    When user click on message box area
    And type a "Just a message..." in the messageContent
    Then User click cancel the message
    And User should be able to cancel the message










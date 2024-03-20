@SendMessages
Feature: User should be able to send messages
  User Story:As a user, I should be able to send messages by clicking on Message tab in the Activity Stream.


  @wip_mo
  Scenario Outline: Positive sending message from different accounts

    Given User enter correct "<userName>" and "<password>"
    When user click on message box area
    And type a "<message>" in the messageContent
    Then user click on send message
    And user can see the "<messaged displayed>"

    Examples:
      | userName              | password | message      | messaged displayed |
      | hr101@cydeo.com       | UserUser | Good morning0 | Good morning0       |
      | marketing75@cydeo.com | UserUser | Good evening0 | Good evening0       |
      | helpdesk59@cydeo.com  | UserUser | Good night0   | Good night0         |


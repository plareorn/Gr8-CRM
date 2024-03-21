@B32G8-239
Feature: Access My Profile Page
  Agile Story:As a user, I should be able to access My Profile page.

  Background:User already logged in
    Given the user is logged in


  @B32G8-237
  Scenario: Verify that the user can view the following options on My Profile page.
		#Given the user is logged in
    When the user navigates to the My Profile page
    Then the user should see the following options:
      | General       |
      | Drive         |
      | Tasks         |
      | Calendar      |
      | Conversations |


  @B32G8-238
  Scenario: Verify that the email under the General tab is the same as the user’s account.
		#Given the user is logged in
    When the user navigates to the My Profile page
    And click the General tab
    Then the email displayed should be the same as the user’s account email



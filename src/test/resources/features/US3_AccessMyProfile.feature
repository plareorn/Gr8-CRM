@a
Feature: Access My Profile Page
  Agile Story:As a user, I should be able to access My Profile page.

  Background:User already logged in
    Given the user is logged in
    When the user navigates to the My Profile page

  Scenario: Verify options on My Profile page
   # Given the user is logged in
   # When the user navigates to the My Profile page
    Then the user should see the following options:
      | General       |
      | Drive         |
      | Tasks         |
      | Calendar      |
      | Conversations |

  Scenario: Verify email under General tab
   # Given the user is logged in
   # When the user navigates to the My Profile page
    And selects the General tab
    Then the email displayed should be the same as the user’s account email




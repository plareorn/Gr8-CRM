Feature: Functions on Company Structure under Employee menu

  # User Story: As a user, I should be able to use functions on Company Structure under Employee menu.


  # Acceptance Criteria:
  # 1. Verify that the Company Structure is visible for all user types.

  Scenario:  Verify that the Company Structure is visible for all user types.
    Given Users is on the home page of CRM
    When Users click on the Employees button option
    And Users are able to see Company Structure

    #Acceptance criteria:
  #2. Verify that the HR user can add a department from the Company Structure.

  Scenario:  Verify that the HR user can add a department from the Company Structure.
  Given HR User is on the home page of CRM
  When  HR User click on the Employee button option
  And HR User is able to add department from company structure


  #Acceptance Criteria:
  #3.  Verify that the “ADD DEPARTMENT” button is not displayed for Helpdesk and Marketing users.

  Scenario:  Verify that the “ADD DEPARTMENT” button is not displayed for Helpdesk and Marketing users.
    Given Helpdesk user, and Marketing user are on the home page of CRM
    When Helpdesk user, and Marketing user click on the Employee button option
    And Helpdesk user, and Marketing user are NOT able to see "ADD DEPARTMENT" option







@Employees
Feature: User should be able to access the Employees page.

  Scenario: As a Hr users, I should be able to access the Employees page.
    Given the user is logged in as a "hr"
    When  user click on Employees button
    Then the user should see the following options on Employees page:
      | Company Structure   |
      | Find Employee       |
      | Telephone Directory |
      | Staff Changes       |
      | Efficiency Report   |
      | Honored Employees   |
      | Birthdays           |
      | New page            |

  Scenario: As a HelpDesk users, I should be able to access the Employees page.
    Given the user is logged in as a "helpdesk"
    And  user click on Employees button
    Then the user should see the following options on Employees page:
      | Company Structure   |
      | Find Employee       |
      | Telephone Directory |
      | Staff Changes       |
      | Efficiency Report   |
      | Honored Employees   |
      | Birthdays           |
      | New page            |


  Scenario: As a Marketing users, I should be able to access the Employees page.
    Given the user is logged in as a "marketing"
    And  user click on Employees button
    Then the user should see the following options on Employees page:
      | Company Structure   |
      | Find Employee       |
      | Telephone Directory |
      | Staff Changes       |
      | Efficiency Report   |
      | Honored Employees   |
      | Birthdays           |
      | New page            |


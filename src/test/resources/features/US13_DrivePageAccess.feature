Feature: Users should be able to access the Drive page.

  Scenario: Users should be able to access the Drive page.
    When User should go to the Drive page
    And User should see the Drive page
    Then User should see all the following modules

      | My Drive                   |
      | All Documents              |
      | Company Drive              |
      | Sales and Marketing        |
      | Top Management's documents |
      | Drive Cleanup              |
      | More                       |

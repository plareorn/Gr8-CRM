Feature: Users should be able to access the Drive page.

  Scenario Outline: Users should be able to access the Drive page.
    When I go to the Drive page
    Then I should see the Drive page
    And I should see all "7" "<modules>"
    Examples:
      | modules                    |
      | My Drive                   |
      | All Documents              |
      | Company Drive              |
      | Sales and Marketing        |
      | Top Management's documents |
      | Drive Cleanup              |
      | More                       |

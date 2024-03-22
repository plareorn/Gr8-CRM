Feature: User I should be able to access to the Company page

  @wip_mo
  Scenario: Users should be able to access the company page.
    Given User logIn to the CRM
    When User should go to the company page
    Then User should see the following modules

      | Official Information |
      | Our Life             |
      | About Company        |
      | Photo Gallery        |
      | Video                |
      | Career               |
      | Business News (RSS)  |
      | More                 |
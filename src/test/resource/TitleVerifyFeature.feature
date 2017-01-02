Feature: Checking if my scenario outline with examples works for verifying the titles of page.

  Scenario Outline: Check page title for the pages of Zero bank site
    Given I navigated to the zero bank website
    When I navigate to "<Link>"
    Then I check page title is "<Title>"

    Examples: 
      | Link              | Title                                          |
      | onlineBankingMenu | Zero - Free Access to Online Banking           |
      | feedback          | Zero - Contact Us                              |
      | homeMenu          | Zero - Personal Banking - Loans - Credit Cards |
      | contact_hp_link   | Login                                          |

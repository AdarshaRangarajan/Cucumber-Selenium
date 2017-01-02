Feature: Checking zero back feedback form works fine with no errors

  Scenario: feedback check form validation
    Given I navigated to the zero bank website
    When I click on the feedback link
    And populate the feedback form
      | Fields  | Value                      |
      | Name    | Sachin Tendulkar           |
      | Email   | centurymaster@omg.com      |
      | Subject | Cricket                    |
      | Comment | Scoring high in test Match |
    Then comfirmation page should appear


 
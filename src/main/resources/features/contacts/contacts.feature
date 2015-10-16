@ui
Feature: Create Contacts functionality

  Background:
    Given I am logged in
    And I open the 'Contacts' page

  Scenario: I am warned when trying to create a new contact with a short phone number
    When I click on 'Add'
    And I enter 'TestUser' '+40723' and 'Some address' in the Edit panel
    Then I should see a warning that the phone number is too short
    And The 'Submit' button is disabled

  Scenario Outline: I can add a new contact
    When I click on 'Add'
    And I enter '<name>' '<phone>' and '<address>' in the Edit panel
    Then I should see '<name>' in the Contacts list

      Examples:
        | name          | address                  | phone        |
        | Serban        | Str. Some street nr. 2   | +4077235653  |
        | Decebal       | Str. Burebista nr. 3     | +4077235655  |


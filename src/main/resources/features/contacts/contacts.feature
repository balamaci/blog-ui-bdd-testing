@ui
Feature: Contacts functionality

  Background:
    Given I am logged in
    And I open the 'Contacts' page

  Scenario: I can add a new contact
    When I click on 'Add'

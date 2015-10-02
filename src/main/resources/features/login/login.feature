@ui
Feature: Login
  As an admin user I can login

  Scenario: User is shown Login page
    When I open the application
    And I try to access the Admin page
    Then I should see the Login page
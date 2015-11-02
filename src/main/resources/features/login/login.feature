@ui
Feature: Login functionality
  Unauthorized users first need to login into the application.
  Users who enter right credentials should be able to login into the application.
  Users who enter wrong credentials are shown an error message.

  Background:
    Given I try to access the 'Contacts' page
    And I see the 'Login' page

  Scenario: Entering valid credentials I am able to login and see 'Contacts' page
    When I login with user 'admin' and with password 'admin'
    Then I should see the 'Contacts' page

  Scenario: Entering invalid credentials I am warned that login has failed
    When I login with user 'hacker' and with password ''
    Then I should see a failed login warning message with key 'login.warnLoginFailed'
@web
Feature: web example

  Background:
    Given Google home page is opened

  Scenario:
    When I search for "Web driver manager"
    Then element "Search filed" is displayed
    And element "link" is displayed

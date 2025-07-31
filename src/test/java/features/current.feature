Feature: Current Location

  Scenario: Check Current Location
    When I consent to data usage
    And I click on the search field
    Then current location label is displayed

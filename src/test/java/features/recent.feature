Feature: Recent City Name Navigation

  Scenario: Use Recent Location
    When I consent to data usage
    And I input "London" in the search field in the Main Page
    And I click on the first search result
    And I go back to the previous page
    Then Main Page is displayed
    When I choose the first city in Recent Locations
    Then City weather page header contains "London"

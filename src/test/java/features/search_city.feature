Feature: Search City Name and Navigation

  Scenario: Search for a City
    When I consent to data usage
    And I input "New York" in the search field in the Main Page
    Then I should see a search results list in the Main Page
    When I click on the first search result
    Then City weather page header contains "New York"

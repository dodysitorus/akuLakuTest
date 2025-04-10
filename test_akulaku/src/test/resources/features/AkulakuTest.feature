@AkulakuTest @AkulakuTestFeature
Feature: Akulaku Website Navigation and Search Functionality

  @Positive
  Scenario: User successfully navigates and searches on the Akulaku website
    Given [user] opens website using the endpoint "https://www.akulakufinance.co.id/"
    Then [user] verify the current url of website contains "akulakufinance"

    Given [user] opens website using the endpoint "https://www.akulakufinance.co.id/kegiatan"
    Then [user] verify the current url of website contains "kegiatan"
    And [user] verify that the list of videos on Kegiatan Page of the Akulaku website is should be 6 items

    When [user] navigates to next page by clicking "Next" on pagination of the Kegiatan Page on the Akulaku website
    Then [user] verify that the list of videos on Kegiatan Page of the Akulaku website is should be 6 items
    And [user] fills "vaksin" into the search bar on Kegiatan Page of the Akulaku website
    And [user] verifies that the list of search suggestions in the search bar on Kegiatan Page of the Akulaku website is should be 2 items
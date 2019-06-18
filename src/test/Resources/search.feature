Feature: Search
@smoketest
  Scenario: search for product

    Given user on home page
    When user search for a product
    Then user can see respective products
@regressiontest
    Scenario Outline: searches

      Given user on home page
      When user search for "<product>"
      Then user can see respective products
      Examples:
      |product|
      |nike    |
      |puma    |
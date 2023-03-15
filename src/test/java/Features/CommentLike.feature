@CommentLikeTest
Feature: Comment Like Feature
  Scenario: Go to the product detail page and do comment like
    Given I'm going to the "akakce.com" website
    And I search a product to see details
    When There is any product do nothing
    And I choose a product and go to the product detail page
    And I click "Takip Et" button
    Then I see the login page
    And I quit the product detail page

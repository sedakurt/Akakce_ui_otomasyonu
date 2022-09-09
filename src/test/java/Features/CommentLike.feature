@CommentLikeTest
Feature: Comment Like Feature
  Scenario: Go to the product detail page and do comment like
    Given I'm going to the "hepsiburada.com" website
    And I search a product to see details
    When There is any comment do nothing
    And I choose a product and go to the product detail page
    And I click "Değerlendir" button
    And I choose the first comment and click "Evet" button
    Then I see the “Teşekkür Ederiz” message


  Scenario: Go to the product detail page and if there is no comment do nothing
    Given I'm going to the "hepsiburada.com" website
    And I search a product to see details
    When I don't see any comment
    Then I quit the product detail page


Feature: Search
  I want to use this template for my feature file



  Scenario Outline: validate in search field with computer
   
    Given navigate the homepage
    Then write "<items>" in search field
    When i clicked on search icon
    And waiting for results
    Then the number of resuluts "<results>"

    Examples: 
      | items    | results |
      | computer |   20000 |
      | phone    |    5000 |
      | books    |   10000 |

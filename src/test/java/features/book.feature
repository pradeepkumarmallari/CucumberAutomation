Feature: MI Sale
  Scenario: Adding mobile into the cart
    Given User has account in MI Application 
    When Going to flash sale
    And Select the mobile "mi5"
    And Add mobile into the cart
    Then Mobile adds into the cart
    And Gives the amount to pay
    
   Scenario: Adding mobile into the cart
    Given User has account in MI Application 
    When Going to flash sale
    And Select the mobile "mi7"
    And Add mobile into the cart
    Then Mobile adds into the cart
    And Gives the amount to pay   
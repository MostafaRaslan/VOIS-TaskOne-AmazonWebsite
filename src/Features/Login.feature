Feature: Amazon Website Adding items in cart
  Scenario: Checking Adding Item Successfully in Cart

    Given User On Amazon Website
    When open Amazon homepage and Type Car Accessories
    When Select the first Item
    When Add Item To Cart
    When Go To Cart Page
    Then Check item is added successfully
    And Close Page

    Scenario: Check And Buy From Today's Deals
    Given User Is On Amazon Website
      When  open amazon Todays Deals page
      When Click On Deals Page
      When Select The Required Categories
      When Select The Required Discount Category
      When Go to the fourth page and Select the required item
      When Add Second Item to the Cart
      And Close Browser
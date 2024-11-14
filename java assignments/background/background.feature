
Feature: This is background demo

 Background: user is logged in to saucedemo app 
   Given user is logging to saucedemo page
   When user enter valid username and password
   Then user should be able to navigate to Home Page
  
  Scenario: Test Menu Items
    And click on breadcrumb icon
    Then user should be able to see the menu items

  Scenario: Verify Add to cart functionality
    And click on add to button
    Then item should be addedd to cart
    
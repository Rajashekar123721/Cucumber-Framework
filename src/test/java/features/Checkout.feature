Feature: Place the order for Products
@PlaceOrder
Scenario Outline: Search Experience for product searching both home and offers page

Given User is on GreenCart Landing Page
#When User searched with short name <Name> and extracted actual name of the product 
When User searched with short name <Name> and gets the actual name of the product
And Added "4" items of the selected product to cart
Then User proceeds to checkout and validate the <Name> items in checkout page
And Verify user has ability to enter the promo code and place the order. 

Examples:
|Name|
|Tom|

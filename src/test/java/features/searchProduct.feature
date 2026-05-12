Feature: Search and Place the order for Products
@OffersPage
Scenario Outline: Search Experiance for product searchin both home and offers page

Given User is on GreenCart Landing Page
When User searched with short name <Name> and gets the actual name of the product 
Then User searched with same short name <Name> in offers page to check if product exists
And Verify both the names that we get same or not

Examples:
|Name|
|Tom|
|Beet|
#beet this fails because there is no item.Let it be like that,it will be helpful for negative scenarios
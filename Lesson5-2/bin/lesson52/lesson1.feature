Feature: Product
Scenario: Decrease product quantity from bag page
Given This is a blank test

@SmokeTest @End2End
Scenario: Buy a product with cash payment
Given This is a blank test

@SmokeTest @End2End
Scenario: Buy a product with CC payment
Given This is a blank test

@End2End
Scenario Outline: Payment declined
Given This is a blank test

Examples: 
| PaymentMethod |
| CC Card |
| DD Card |
| Bank Transfer |
| PayPal |
| Cash |
Feature:To buy product on amazon application
@tag1
Scenario:To test the signin page
Given Open the chrome and url of the application
When enter emailid,password and Click on login button
Then login success

@tag2
Scenario:To test the home page
Given Picking the product
When select the product with required specification
Then searchforproduct

@tag3
Scenario:To test add to card page
Given Placing order
When pushing order to card
Then order placed
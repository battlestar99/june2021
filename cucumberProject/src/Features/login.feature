

Feature: login panel data testing  

Scenario: validating login panel with valid credentials 

Given user is on the login page 
When user enters valid username as <"standard_user">
And user enters valid password as <"secret_sauce">
And user clicks on the login button
Then user should be on the account page 
And user should close the browser


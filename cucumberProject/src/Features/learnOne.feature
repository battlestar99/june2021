#Author: anik@agile1tech.com 

Feature: login panel 

Background:  
Given user is on the login page 

@uat @abc
Scenario: validating login panel with valid credentials 

When user enters valid username
And user enters valid password 
And user clicks on the login button
Then user should be on the account page 
And user should close the browser


@uat
Scenario: validating login panel with invalid credentials


When user enters invalid username
And user enters invalid password 
And user clicks on the login button
Then user should not be able to login
And user should close the browser


Scenario: validating login panel with expired user


When user enters expired username
And user enters expired password 
And user clicks on the login button
Then user should not be able to login
And user should close the browser



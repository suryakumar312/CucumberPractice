Feature: google search functionaliy
Background:
Given launch broser and load url

Scenario: validating the google search function with cars as input
When locate searchbar and send input as cars and press enter
Then  validate the input.


Scenario: validating the google search function with bike as input
When locate searchbar and send input as bike and press enter
Then  validate the input.


Scenario: validating the google search function with mobile as input
When locate searchbar and send input as mobile and press enter
Then  validate the input.



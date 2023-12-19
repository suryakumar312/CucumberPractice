Feature: login functionality of facebook

  Background: 
  Given open a browser and launch facebook url

  Scenario Outline: validating with multiple input as inputs
    When locating username and password and sending <username> and <password> inputs
    And click login button

    Examples: 
      | username | password   |
      | surya    | qwerty12270 |
      | sharan   | qwerty8881 |
      | kathir   | asdfg4080 |
      | aswin    | zxcvb06111 |

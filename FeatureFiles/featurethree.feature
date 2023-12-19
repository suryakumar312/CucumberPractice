Feature: facebook login functionality

  Scenario Outline: validating with multiple inputs
    Given launch browser and load fb url
    When provide <username> and <password> and click login
    Then verify the inputs

    Examples: 
      | username | password  |
      | surya    | qwerty123 |
      | sharan   | asdfg123  |
      | aswin    | zxcvb123  |
      | kathir   | lkjh123   |

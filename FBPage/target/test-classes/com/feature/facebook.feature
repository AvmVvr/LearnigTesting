Feature: Facebook Login Functionally



Background:
Given User Launch the Url

Scenario: facebook login
When User click the email id field and enter a value
And User Click the Password field and enter a value
Then User click the login button


Scenario: Forgot password
Given User Click the Forgot password button


Scenario: facebook login
When User click the email id field and enter a value
And User Click the Password field and enter a value
Then User click the login button


Scenario: facebook login
When User click the email id field and enter a value of "vickey"
And User Click the Password field and enter a value of "222"
Then User click the login button


Scenario: facebook login
When User click the email id field and enter a value of "kkk"
And User Click the Password field and enter a value of "333"
Then User click the login button



Scenario Outline:
When User click the email id field and enter a value of "<username>"
And User Click the Password field and enter a value of "<password>"
Then User click the login button

Examples:

|username|password|
|tamil|111|
|udhay|222|
|partha|333|


Scenario:
When user Click the Create Account button
And user sign up with following details
|Vignesh|vickey|1234567894|12345687|15|11|1997|
And user select a gender
Then user click the signUp button














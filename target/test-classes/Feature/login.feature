Feature: To validate the login functionality
Background:
Given User has to be there in FB login page

Scenario: To verify whether the user can able to login with all possible combinations
When User has to enter username, password and click the login button
|username|vicky3|
|password|677|
Then User has to find the error page

Scenario: To verify whether the user can able to login with all possible combinationss
When User has to enter valid username, password and click the login button
Then User has to find the home page

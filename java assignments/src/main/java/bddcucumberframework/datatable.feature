#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature - Data table

Scenario:Verify that the new user registration is successful after passing correct inputs.
Given the user on the user registration page.
When user enter invalid data on the page
| Fields | Values |
| First Name | Preeti |
| Last Name | Sharma |
| Email Address | someone@gmail.com |
| Re-enter Email Address | someone@gmail.com |
| Password |PASSWORD |
| Birthdate | 02 |
Then the user registration should be successful.
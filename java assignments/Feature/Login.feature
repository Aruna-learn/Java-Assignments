

Feature:Login page automation pf saucedemo  App

Scenario: Successful login with valid credentials
Given user is on logn page
#//When user enters valid username and passsword
When I enter username "<username>" and password "<password>"
And click on Log in Button
Then user is navigated to Home page
And close the browser
  
Examples:

| username | password |
| standard_user | secret_sauce |


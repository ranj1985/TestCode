Feature: feature to test login functionality

Scenario: Check Successful Login with valid credentials

	Given User is on Sauce Demo Login Page
	When user enters valid username  and password
	And  user clicks on Login Button
	Then user is navigated to the  Sauce Demo Main Page
	And user verify the App Logo 
	
	
Scenario: Check login with invalid credentials
	
	Given user is on sauce login page
	When user enter  username and password
	And user click on the Login Button
	Then user verify the Error Message contain text "Sorry, this user has been banned."
	
	
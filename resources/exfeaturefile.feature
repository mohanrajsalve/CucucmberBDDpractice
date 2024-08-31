Feature: Login Action

Scenario: Successful Login with Valid Credentials
	Given user opens browser
	And user enter website name 
	And user login website
	And user close browser

Scenario: Successful Login and logut from website
Given user opens browser
And user enter website name 
And user close browser
	
#	Feature Page
# Name: John Ong Vano
# Story: Crate Google Account
# Date: 7-3-18

Feature: Google Account Creation
	Scenario: Create Google Account
		Given the user wants to create a Google Account
		When the user clicks on the Sign In button
		And the user clicks on the Create Account Button
		And the user enters the "Tony" First Name
		And the user enters the "Stark" Last Name
		And the user enters the "IronMan" UserName
		Then the user sees the Page Heading


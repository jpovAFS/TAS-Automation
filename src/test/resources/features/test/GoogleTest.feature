
Feature: Google Test
	Scenario: Test user can search on Google
		Given the user goes to Google page
		When the user enters "Serenity BDD Manual" in search field
		Then the user clicks the link

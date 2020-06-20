Feature: Create account of facebook9

Scenario: Validate first name field91

Given: User needs to be on the facebook login page
When: User enter first name
Then: User check user first name field is present
#Then close browser

Scenario: Validate create user multiple field91

Given: User needs to be on the facebook login page
When: User enter first name
And: User enter surname 
Then: User check user first name field is present
Then: User Mobile field should be blank
#Then close browser
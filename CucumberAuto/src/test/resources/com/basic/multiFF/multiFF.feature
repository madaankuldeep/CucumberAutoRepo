Feature: Create account of facebook8

Scenario: Validate first name field81

Given: User needs to be on the facebook login page
When: User enter "David" first name
Then: User check user "David" first name field is present
#Then close browser

Scenario: Validate create user multiple field82

Given: User needs to be on the facebook login page
When: User enter "Ryan" first name
And: User enter "Jack" surname 
Then: User check user first name field is present
Then: User Mobile field should be blank
#Then close browser
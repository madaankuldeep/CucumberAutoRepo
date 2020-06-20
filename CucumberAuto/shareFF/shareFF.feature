Feature: Create account of facebook

Scenario: Validate first name field

Given: User needs to be on the facebook login page
When: User enter "David" first name
Then: User check user "David" first name field is present


Scenario: Validate create user multiple field

Given: User needs to be on the facebook login page
When: User enter "Ryan" first name
And: User enter "Jack" surname 
Then: User check user first name field is present
But: User Mobile field should be blank

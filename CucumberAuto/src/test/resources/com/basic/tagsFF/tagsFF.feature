@Important
Feature: Create account of facebook11

@Smoke @Regression
Scenario: Validate first name field111

Given: User needs to be on the facebook login page
When: User enter "David" first name
Then: User check user "David" first name field is present
#Then close browser

@Regression
Scenario: Validate first name field2112

Given: User needs to be on the facebook login page
When: User enter "David" first name
Then: User check user "David" first name field is present
#Then close browser

@Smoke
Scenario: Validate first name field3113

Given: User needs to be on the facebook login page
When: User enter "David" first name
Then: User check user "David" first name field is present
#Then close browser

@Smoke
Scenario: Validate first name field4114

Given: User needs to be on the facebook login page
When: User enter "David" first name
Then: User check user "David" first name field is present
#Then close browser

Scenario: Validate first name field5115

Given: User needs to be on the facebook login page
When: User enter "David" first name
Then: User check user "David" first name field is present
#Then close browser

@Smoke @Regression
Scenario: Validate create user multiple field116

Given: User needs to be on the facebook login page
When: User enter "Ryan" first name
And: User enter "Jack" surname 
Then: User check user first name field is present
Then: User Mobile field should be blank
#Then close browser
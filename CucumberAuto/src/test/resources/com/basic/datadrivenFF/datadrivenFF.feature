Feature: Create account of facebook2

Scenario Outline: Validate create user multiple field21

Given: User needs to be on the facebook login page
When: User enter "<firstname>" first name
And: User enter "<surname" surname 
Then: User check user "<firstname>"first name field is present
Then: User Mobile field should be blank
Examples:
|firstname	 |surname   | 
|Ram		   	 |Kumar 		|
|Shyam	   	 |Kumar1 		|
|Kaam		   	 |Kumar2 		|
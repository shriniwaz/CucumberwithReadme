Feature: Refund Of Item

Background:
	Given Refund of any faulty item as per the guidelines
	
Scenario Outline: Jeff returns faulty microware

Given Jeff has brought microware for $ <cost>
And Jeff has a receipt
When Jeff returns the faulty microware
Then Jeff should get refund of $ <ref_cost> 

Examples:
	 | cost | ref_cost |
	 |100|100|
	 |120|120|
	 |150|150|
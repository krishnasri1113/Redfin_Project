Feature: Redfin functionality
Scenario Outline: search houses by min and max prices
When Redfin site is launched
Given when user enter the "<city>" name
Then user click on search button
And select the city name from the list
Then Select max house price
And Select min house price
Examples:
|city      |
|Dallas    |
|Sunnyvale |
Feature: Test Web tables from Tutorials point  


Background:
Given user is on tutorials point page
And user expands Elements section from the page


@Access_table_values_1
Scenario:
User wants to access values from web tables
When user selects Web Tables section
Then user get values from first row
And user closes the browser
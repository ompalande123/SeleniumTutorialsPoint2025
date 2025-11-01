Feature: Test Checkboxes Elements from Tutorials point  


Background:
Given user is on tutorials point page
And user expands Elements section from the page


@CheckBox1
Scenario:
User wants to validate checkboxes functionality
When user selects checkbox section
Then user selects level1 and level2 checkboxes
And user closes the browser
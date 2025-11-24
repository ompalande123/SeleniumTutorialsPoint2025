Feature: Select Menu page testing

Background:
Given user is on tutorials point page
And user expands Widgets section from the page

@Select_Menu
Scenario:
User selects value from the dropdown
When user clicks on select option
Then user selects value from the dropdown
And user closes the browser
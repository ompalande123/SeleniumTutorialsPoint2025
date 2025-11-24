Feature: To test the links are working fine or not

Background:
Given user is on tutorials point page
And user expands Elements section from the page


@Open_link1
Scenario:
To open new URL and validate that page
When user click on links button
Then user clicks on Home url
And user validates the title of the home page
And user closes the browser
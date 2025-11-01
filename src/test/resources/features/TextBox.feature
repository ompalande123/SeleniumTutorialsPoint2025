Feature: Test Elements from Tutorials point  


Background:
Given user is on tutorials point page
And user expands Elements section from the page


@TextBoxElements @smoke
Scenario: To test text box elements
	 When user clicks on Text Box button
	 And user fills Text Box fields
	 And user clicks on Submit button
	 Then user closes the browser
	 

@Test2 @smoke
Scenario: To test text box elements
	 When user intentionally failed test case
	 


@ReadAllfromExcel @smoke
Scenario Outline: User wants to read all values from the excel sheet
	Given user want to read sheet "Create_Users"
	
	Examples:
	| Username	|	Jobname	|
	| Username	|	Jobname	|



@NewFile  
Feature: File tab functionality
Scenario: To validate Files and notes functionality of participant page
Given Launching website through url on browser and open participants
Then Click on any participant
Then Click on FileandNotes tab
Then select Any fileName checkbox and verify checkbox should be selected or not
Then click on file name and verify it should be sorted or not
Then click on date added and verify date should be sorted or not

@searchfile
Scenario Outline: Search file functionality
Given website is open and click on participants
Then click on any participant and click on notes and files tab
Then search file name "<filename>" from the search box and verify file name should be display as per searched file name
Examples:
|filename|
|spreadsheet|
|Application|


@UploadFile
Scenario: upload file functionality
Given url is open and click on any participants
Then click on file and notes tab of participants
Then click on upload file button and verify file should be uploaded or not

@Linkurl
Scenario Outline: Linkurl functionality
When participants page is open
Then click on any participants and notes and files tab
Then click on link url button
Then enter url name "<url>"
Then enter File Name "<filename>"
And click on add url button
Then click on linkurl and click on cancel and verify popup should be closed or not
Examples:
|url|filename|
|||
|https://sciteline.letsnurture.co.uk|Automation|

@Rename
Scenario: Rename and delete file functionality
When url is open then click on any partcipants name
Then click on files and notes tab of participants 
Then click on action button and verify rename and delete file options should be display or not
And click on rename file option of particular file
Then enter name that user wants to rename 
And click on save changes button and verify that file name should be renamed or not
Then click on delete option for delete file



@member
Feature: Member tab functionality
Scenario: To validate member tab functionality
When admin login by enter valid credentials 
Then click on studies navigation
And click on any particular study and verify user should be redirect on details tab or not
Then click on member tab
Then verify user is able to view already added person for all site
Then verify user is able to view add person button or not
Then select site from site dropdown and verify user should be able to view already added person for that selected site
Then click on add person button and verify it should be redirect to add a person dialog box or not
Then search person name from search box and verify person name should be display as per searched person name
Then select person name from person dialog box and verify it should be selected or not
Then select one person name from person dialog box 
And click on add people and verify person should be added for that particular selected site or not
Then select multiple person name from person dialog box and verify count should be display on add people button as per selected person name
And click on add people and verify all selected person should be added for that particular selected site or not


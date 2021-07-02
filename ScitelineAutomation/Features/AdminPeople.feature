@people
Feature: people functionality
Scenario Outline: To validate people page functionality
Given Admin is open application on through url
Then click on login menu bar
And enter credentials "<email id>" and "<password>" for Admin login
And click on login button and verify user is redirect to admin panel 
Then click on people menu and verify it should be redirect to studies page or not
Then click on name check box and verify user is able to select name check box or not
Then click on particular people name and verify user is able to select particular study checkbox
Then click on new person button and verify it should be redirect to new person page
Examples:
|email id|password|
|admin@sciteline.com|admin@1234|

@searchPeople
Scenario Outline: To validate search person functionality
When Admin is Login on application 
Then click on people menu bar
Then enter the person name in search box "<people name>" and verify display person name is as per searched personname or not
Examples:
|people name|
|test user|
|divya modi|


@newPerson
Scenario Outline: To validate new person functionality
When admin open application 
Then click on new person 
Then click on sites, studies and Account
Then enter name "<name>" and Email "<Email>"
Then click on send invite button 
Examples:
|name|Email|
|test purpose|test@sciteline.com|
|||
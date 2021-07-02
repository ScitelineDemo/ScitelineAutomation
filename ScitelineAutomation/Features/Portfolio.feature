@Portfolio
Feature: Portfolio Functionality
Scenario: To validate Portfolio Functionality
Given Launching website through url on browser.
Then click on Login menu
And Enter valid data on email id and password
Then click on Login button
Then verify Portfolio page open
And Click on trial name and verify site details are display related trial name
And Click on site name and verify side bar is display with site related details or not

@filter
Scenario: To validate Filter functionality
Given application url is open in browser
Then click on filter button and verify filter pop up is open or not
Then select status and phase option and verify trials are display based on the selection of status and phase 
Then verify count functionality on filter 



@Search
Scenario Outline: To validate Search functionality
Given application is open on browser
Then enter data in search field "<Search>" 
And verify search related data display or not
Examples:
|Search|
|     |         
|Covid|
|respiratory|
|cancer|
|Test|

@sort
Scenario: To validate sort Functionality
When open application
Then click on all heading and verify arrow should be display for ascending and descending order


Scenario: To validate Pagination Functniolity
Then click on pagination dropdown 
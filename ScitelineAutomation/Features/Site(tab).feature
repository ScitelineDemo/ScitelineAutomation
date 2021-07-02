@SiteTab
Feature: Site tab functionality of Studies page
Scenario Outline: To validate site tab (Without assigned any site)functionality
Given admin is login with enter valid credentials 
|admin@sciteline.com|Demo@123|
Then click on studies navigation menu and verify it should be redirect to studies listing page
Then click on one particular study name and verify it should be redirect to that study details page or not
Then verify user is able to view sites tab or not
Then click on Sites tab
Then verify user is able to view message or not if no any sites are added for that study
Then verify user is able to view add site button or not
Then click on add a site button and verify add a site dialog box should be open or not
Then search site name "<SiteName>" and verify site name should be display as per searched site name
Then select site name and verify site name should be select or not
Then select site name and verify count should be display on add site button as per selected site names 
And click on add site button and verify site should be added on site tab or not as per selected site
 Examples:
 |SiteName|
 |The Michener Institute of Education at UHN|
 |Toronto General Hospital|

 Scenario Outline: To validate site tab functionality
Given admin is login with enter valid username and password
Then click on studies navigation menu 
Then click on one particular study name
Then click on Sites tab of study
Then verify user is able to view added site or not 
Then click on sitename and verify sites should be display in ascending and descending order
Then click on address and verify address should be display in ascending and descending order
Then click on location and verify location should be display in ascending and descending order
Then click on main contact and verify contact should be display in ascending and descending order
Then verify user is able to view add site button or not
Then search site name "<SearchSite>"  from search box and verify site name should be displayed as per searched site name
Then click on add a site button 
Then search site name "<Name>" and verify site name should be display in dialog box as per searched site name
Then select one site name and verify site name should be select or not
Then click on add site button for add one site and verify site should be added or not
Then select multiple site name and verify count should be display on add site button as per selected site names 
And click on add site button for add multiple site and verify sites should be added on site tab or not as per selected site
Then click on remove icon and verify user should be able to remove site from site tab
Examples:
|SearchSite|Name|
|eHealth|Toronto General Hospital|
|Toronto Western Hospital|The Michener Institute of Education at UHN|


Scenario Outline: To validate change main contact functionality
Given admin open the studies detail page
And click on any study
Then click on site tab and verify should be redirect to site tab screen or not
Then click on particular main contact dropdown and verify change main contact dialog box should be open or not
Then enter title name
Then click on name field and select person name and verify email field should be fill automatically or not
Then enter phone number
And click on save changes button
Then click on cancel button and verify dialog box should be closed or not
Then for update contact click on main contact dropdown and verify change main contact dialog box should be open with filled name and email 
Then Select name for change name
Then update phone number "<number>"
And click on save changes button and verify main contact should be updated or not
Examples:
|number|
|8745695214|



 
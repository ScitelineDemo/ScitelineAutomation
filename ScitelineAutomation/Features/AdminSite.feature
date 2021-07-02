@sitePage
Feature: sites page functionality of admin panel
Scenario Outline: To validate Sites functionality of admin panel
Given Admin is open application through url on given browser
Then click on login menu bar for login 
And enter valid credentials for  admin login "<email>" and "<password>" 
And click on login and verify admin should redirect to admin panel or not
Then click on Sites menu and verify it should be redirect to Sites page or not
Then click on New Site button and verify it should be redirect to New Site page
Examples:
|email|password|
|admin@sciteline.com|admin@1234|



@SearchSites
Scenario Outline: To validate search site functionality
When Admin is Login 
Then click on Sites menu bar
Then enter the Site name in search box "<Search...>" and verify display sites should be display as per serached sites name
Examples:
|Search...|
|Toronto western Hospital|
|Toronto general hospital|
|test|
||


@NewSite
Scenario Outline:To validate new site functionality
When Admin is open url 
Then click on Site menu
Then click on new site button 
Then verify user is able to show new site page
Then enter Site Name "<Site name>" 
Then enter Street address for new site "<Street address>"
Then select Country for new site "<Country>"
Then select Province for new site "<Province>"
Then enter Postal code "<Postal code>"
Then select Site contact "<Site contact>"
Then verify email textbox should be fill up automatically related to person name
Then enter Phone number "<Phone number>"
Then click on Create Site button and verify added site should be display on site listing page
Examples:
|Site name|Street address|Country|Province|Postal code|Site contact|Phone number|
|Test site|canada| canada|Toronto|bc123|8547123625|8547145263|
|Test site|canada|123|xyzo|bc123|8547123625|8547145kk3|
| | | | | | | |




@Newsite1 
Scenario Outline:To validate new site functionality with select virtual location
When Admin is open url on browser with login
Then click on Site menubar
Then click on newsite button 
Then add Site Name "<Site name>" 
Then Click on this site is virtual location checkbox
Then enter Site contact "<Site contact>"
Then add Phone number "<Phone number>"
Then click on Create Site button  and verify create site display on site page
Then Click on Cancel and verify new site page close and redirect to site page

Examples:
|Site name|Site contact|Phone number|
|Test site|8547123625|8547145263|
|Test site|666666|8547145kk3|
| | | | 

@EditSite
Scenario Outline:To validate edit and delete site functionality
When admin open application with login
Then click on Site menu Bar
Then Click on any particular site name and verify user should be able to view that clicked site name's detail page
And verify that site details display with filled data 
Then update Site Name "<Site name>" 
Then update Street adress "<Street adress>"
Then Click on Save changes button and verify updated changes display on site detail page
Then if user wants to delete site then click on delete site button and verify that site should be deleted or not
Examples:
|Site name|Street adress|
|(updated)|canada|



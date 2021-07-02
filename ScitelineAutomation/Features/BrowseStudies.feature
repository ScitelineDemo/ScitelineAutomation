@browseStudies
Feature: Browse Studies functionality
Scenario Outline: To validate Browse studies page Functionality
Given user open url through browser
Then click on browse studies to validate user should be redirect to browse studies page
Then validate user is able to view search and filter option
And for validate search functionality enter data on search field "<search>"
Then Enter data on city and address field "<city and address>"
Then select trial phase "<trial phase>"
And select study type "<study type>"
Then select indication "<indication>" and click on search button
And verify mouse hover on any study user should be able to view quick view button 
Then click on Quick view button and verify pop up is open or not
Then click on discover this study and verify it should be redirect to study details page or not
Then verify User should be able to view study related details as per entered data
Then verify user should able to show study status
And if study status is currently recruiting and user wants to apply then click on apply button
Then answer the given questions for check eligibility
Then if user is eligible then click on done button else apply for notified of future study
And if user wants to share that study click on share button and verify user should able to click on share button
Then enter Email to share study on that email
Then click on terms and condition checkbox.
Then click on send email button and verify email should be sent or not
Then click on any location for study 
Then click on google maps button
And click on any related studies 
Then fill the form of get notified of new matches by enter firstname and lastname and email and indication and postalcode and date and gender
Then click on submit button and verify




Examples:
|search         |city and adreess|trial phase|      study type               |indication|
|  cancer       |   canada    |Not applicable|Interventional (Clinical Trial)|  Respiratory     |        
|  Respiratory  |   canada    |Early Phase 1|Observational                   |     Cancer       |      
|  cancer       |   canada    |Phase 1      |Patient Registry                |   Respiratory    |         
|  respiratory  |   canada    |Phase 2      |Expanded Access                 |     Cancer       |          
|  cancer       |   canada    |Phase 3      |All                             |   Respiratory    |
|  Respiratory  |   canada    |Phase 4      |Observational                   |     Cancer       |          
|  cancer       |   canada    |All          |nterventional (Clinical Trial)  |   Respiratory    |          

@getintouch
Scenario Outline:To validate get notified new matches 
Given url is open 
Then click on browse studies menu bar
Then verify get notified of new matches form is display or not
Then enter "<firstname>" , "<lastname>" , "<email>" , "<zipcode>" , "<gender>"
Then accept terms and condition checkbox
And click on the submit button
Examples:
|firstname|lastname|email|zipcode|gender|
|         |        |     |          |       |      
|test|purpose|test@sciteline.com|125874|male|
|test|purpose|test@sciteline.com|548572|female|
|test|purpose|test@sciteline.com|547896|female|
|test|purpose|test.sciteline.com|875412|female|
|123|456|test@sciteline.com|547896|female|


Scenario: To validate find match functionality
Given application is open on browser through url
Then click on find me match button on browse studies page
And select a condition Respiratory
Then click on the next button
Then answer the given questions of tell us about your self
And click on the Find matches button
Then verify displayed study details are as per selected condition or not
And click on cancer condition
Then click on the Next 
Then select answer for the given questions of tell us about your self page
Then Verify display study details are as per choosen condition or not
 



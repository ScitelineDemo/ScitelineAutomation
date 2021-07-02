@Recruitment
Feature: Recruitment Functionality
Scenario: To validate Recruitment page Functionality
Given Lunching application on browser
Then click on Recruitment menu and verify it should be able to navigate on Recruitment page
Then click on Change button and verify right side Trial slider open or not
Then Click on Filter button and verify filter slider is open or not
Then Click on New Participate button and verify New participant form open or not
Then click on trial boards of participants and verify the right side slider is open related to participants name 


@recruitmentFilter
Scenario: To validate Filter functionality
Given application is open
Then click on recruitment menu bar
Then click on filter button
Then verify favourite,eligibility,source,prescrenning filter options is display or not
Then select favourite filter options and verify participant trial board should be display as per selected filter
Then select eligibility filter options and verify participant trial board should be display as per selected filter
Then select on source filter options and verify participants trial board should be diplay as per selected filter
Then select on prescrenning filter option and verify participants trial board should be diplay as per selected filter
Then select all filter options one by one and verify count functionality
Then click on cancel button and verify filter slider should be closed or not

@reset
Scenario: To validate reset functionality
Then click on filter 
Then select filter option of favourite,eligibility,source and prescreening
Then click on reset button and verify all filter should be reset or not

@recruitmentSerach
Scenario Outline: To validate Search functionality
Given application open 
Then search participants in search bar "<Search participants>" 
And verify participant trial board should be display based on search participants
Examples:
|Search participants|
|David miller|  
|bethari edgar|       


@recruitmentChange
Scenario Outline: To validate change button functionality
When application is open on browser via url
Then click on change button and verify trial names and sites details should be display or not
Then click on site names one by one and verify trial boars should be display with perticuler site name or trial name
Then Search trials or sites name in "<Search trials or sites>"  search bar

Examples:
|Search trials or sites|
|covid|         
|toronto|
|ehealth|
|evaluation|

@recruitmentParticipate
Scenario Outline: To validate New Participate button functinolity
Given Lunching website on browser
Then Click on New Participate button and verify New participant form open
Then enter Participant  ID "<Participant  ID>" 
Then enter First Name "<First Name>" 
Then enter Last Name "<Last Name>" 
Then enter Email Address "<Email Address>" 
Then enter Primary Contact Number "<Primary Contact Number>" 
Then enter Sex
Then enter  Date of birth "<Date of birth>" 
Then enter Primary care physician "<Primary care physician>" 
Then enter Physician 's phone "<Physician 's phone>" 
Then enter Street address "<Street address>" 
Then enter Country  
Then enter Province 
Then enter Postal Code "<Postal Code>" 
Then enter Height cm "<Height cm>" 
Then enter Weight lbs "<Weight lbs>" 
Then enter Allergies "<Allergies>" 
Then enter Years of diagnosis "<Years of diagnosis>" 
Then enter BSA "<BSA>" 
Then enter Referring Physician "<Referring Physician>" 
Then enter treatment initiated on date "<treatment initiated on>"
Then enter Indications
Then click on Add Participant button
And click on Add Participant button
Then click on cancle button on participate form and verify participate form should be closed or not
Examples:
|Participant  ID|First Name|Last Name|Email Address|Primary Contact Number|Sex|Date of birth|Primary care physician|Physician 's phone|Street address|Postal Code|Height cm|Weight lbs|Allergies|years of diagnosis|BSA|Referring Physician|treatment initiated on|
|1002           |demo      |test     |demo@sciteline.com|1234567891|02/03/2021|abc                   |1478523693        |canada        |  |     |362001     |5.6      |60        |Abc,test,purpose|2000|mmm|Retry|02/05/2021|
|1004|test|purpose|dem0gmail.com|1234891|02/03/2021|abc|1478523693|ahmedabad|India|Xyz|362001|5.6|60|Abc|2000|mm2m|Retry|02/03/2021|Indication(2)|

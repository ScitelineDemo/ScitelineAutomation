@AdminStudies
Feature: Studies functionality of admin panel
Scenario Outline: To validate studies functionality of admin panel
Given Admin is open application through url
Then click on login 
And enter valid credentials "<email>" and "<password>" for Admin login
And click on login button and verify user is redirect to admin panel or not
Then click on studies menu and verify it should be redirect to studies page or not
Then click on trialname check box and verify user is able to select trial name check box or not
Then click on particular study and verify user is able to select particular study checkbox
Then verify user is able show status, indication,study type for filter studies
Then click on new trial button and verify it should be redirect to new trial page
Examples:
|email|password|
|admin@sciteline.com|admin@1234|

@SearchStudies
Scenario Outline: To validate search studies functionality
When Admin is Login on application through url
Then click on studies menu bar
Then enter the study name in search box "<study name>" and verify display studies is as per searched study or not
Examples:
|study name|
|Calypso Guided High Precision Stereotactic Ablative Radiosurgery for Lung TUmours Using Real-Time Tumour Tracking & Respiratory Gating|
|Abc|
|test|
|sdsc|

@TrialFilter
Scenario: To validate search trial with filter options
When Admin is Login on application via url
Then click on studies 
Then click on Status drop down
And select status options and verify trial should be dipaly as per selected options of status
Then click on Indication drop down
And Select indication options and verify trial should be display as per selected options of indications
Then click on study type drop down
And select study type options and verify trial should be display as per selected options of study type

@newTrial
Scenario Outline:To validate new trial functionality
When Admin is open url on browser
Then click on Studies menu
Then click on new Trial button 
Then verify user is able to show details,locations,eligibility crieteria,screening questions and member Tab
Then click on Details 
Then enter Trial Id "<trial id>" and Trial name "<trial name>"
Then enter introduction "<introducation>"
Then enter Description "<description>"
Then Medical condition "<medical condition>"
Then select Study type "<study type>"
Then enter Duration "<duration>"
Then enter of participants  "<participants>"
Then select Phase "<phase>"
Then enter Intervention "<intervention>"
Then enter Start date "<start date>"
Then enter Lead sponsors "<sponsors>"
Then enter Principal investigator "<investigator>"
Then enter Study contact phone "<phone>"
Then enter Study contact email "<email>"
Then enter Tags "<tags>"
Then Add image or video link
And click on publish button and verify this added trial is display at browse studies page or not
Examples:
|trial id|trial name|introducation|description|medical condition|study type|duration|participants|phase|intervention|start date|sponsors|investigator|phone|email|tags|
|NCT1010234| Respiratory|This is a single arm seamless phase I/II prospective cohort study.|This is a single arm seamless phase I/II prospective cohort study.|Test|interventional|5 months|45|phase1|Real-Time Position Transponder Beacons|05/28/2021|CancerCare Manitoba|Dr. test Kim|8754251452|test@sciteline.com|respiratory|
|NCT1010235| Respiratory|This is a single arm seamless phase I/II prospective cohort study.|This is a single arm seamless phase I/II prospective cohort study.|Test|observentional|8 months|15|phase2|Real-Time Position Transponder Beacons|05/28/2021|CancerCare Manitoba|Dr. test Kim|87542524452|test@sciteline.com|cancer|
|NCT1010254| cancer|This is a single arm seamless phase I/II prospective cohort study.|This is a single arm seamless phase I/II prospective cohort study.|Test|patient registry|4 months|15|early phase|Real-Time Position Transponder Beacons|05/28/2021|CancerCare Manitoba|Dr. test Kim|87542524452|test@sciteline.com|test|
|NCT10102245|Cancer|This is a single arm seamless phase I/II prospective cohort study.|This is a single arm seamless phase I/II prospective cohort study.|Test|expanded access|8 months|15|phase3|Real-Time Position Transponder Beacons|05/28/2021|CancerCare Manitoba|Dr. test Kim|87542524452|test@sciteline.com|cancer|


@pulldata
Scenario Outline:To validate pull data and add image functionality
When Admin should open url on browser
Then click onStudies menu 
Then click on newTrial button 
Then click enter trial id "<trial id>"
Then click on pull data button and verify all data should be fill automatically or not
Then click on add image button and select one image
And if user wants to change that image then mouse hover on added image section
Then click on change button 
Examples:
|trial id|
| NCT03322072|


@preview
Scenario Outline: To validate preview functionality with pull data functionality
When Admin is open application and click on new study
Then enter trial id "<trial id>"
And click on pull data button
Then verify all data should be fill automatically and click on preview button and verify details
Examples:
|trial id|
|NCT03322072|



@participants
Feature: Participants functionality
Scenario: To validate participants functionality
When application is open on browser via url name
Then click on participants menu bar and verify it should be redirect on participants page
Then click on filter and verify filter popup is open or not
Then click on new participant form and verify participant form is open or not
Then click on individual participant check box and verify delete participants and assign study buttons are display or not

@sorting
Scenario: to validate assending and descending order functionality of participants
When open participnats page
Then click on firstname and verify firstname should be display in ascending and descending order
Then click on lastname and verify lastname should be display in ascending and descending order
Then click on sex and verify gender details should be display in ascending and descending order
Then click on dob and verify dob should be display in ascending and descending order
Then click on phone and verify phone no should be display in ascending and descending order
Then click on email and verify email should be display in ascending and descending order
Then click on currently enrollred and verify details should be display in ascending and descending order
Then click on studies and verify studies should be display in ascending and descending order

@newparticipants
Scenario Outline: To validate new participants form functionality
When browser is open
Then click on new participants button
Then click on cancel button verify participant form should be closed or not
Then enter Participant  ID "<ParticipantID>" 
Then enter FirstName "<FirstName>" 
Then enter LastName "<LastName>" 
Then enter EmailAddress "<EmailAddress>" 
Then enter PrimaryContactNumber "<PrimaryContactNumber>" 
Then select Sex "<Sex>" 
Then enter  DateofBirth "<DateofBirth>" 
Then enter Primarycarephysician "<Primarycarephysician>" 
Then enter Physician's phone "<Physician's phone>" 
Then enter StreetAddress "<StreetAddress>" 
Then select Country "<Country>" 
Then select Province "<Province>" 
Then enter PostalCode "<PostalCode>" 
Then enter Height  "<Height>" 
Then enter Weight  "<Weight>" 
Then enter the Allergies "<Allergies>" 
Then enter YearsOfdiagnosis "<YearsOfdiagnosis>" 
Then enter BSA details "<BSA>" 
Then enter ReferringPhysician "<ReferringPhysician>" 
Then enter treatmentIinitiatedOn date "<treatmentInitiatedOn>"
Then select Indications "<Indications>" 
Then verify mouse hover effect on save changes button and click on button and verify participants should be added

Examples:
|ParticipantID|FirstName|LastName|EmailAddress|PrimaryContactNumber|Sex|DateofBirth|Primarycarephysician|Physician's phone|StreetAddress|Country|Province|PostalCode|Height|Weight|Allergies|YearsOfdiagnosis|BSA|ReferringPhysician|treatmentInitiatedOn|Indications|
|1004        |vaibhavi      |Gandhi     |test@sciteline.com|1234567891       |Female|02/03/2021|abc                   |1478523693        |canada        |India  |Xyz     |362001     |5.6      |60        |Abc,test,purpose|2000|mmm|Retry|02/05/2021                              |Indication(1)|
|1002|Demo|1est|Bemgmail.com|1234891|male|02/03/2021|abc|1478523693|canada|Usa|Xyz|362001|5.6|60|Abc|2000|mm2m|Retry|02/03/2021|Indication(2)|

@participantFilter
Scenario: filter functionality on participants page
When click on filter button on participant page
Then Verify Studies,study tags,indications,source,patient tags,age,sex,location options should display for the filter or not
Then select studies filter options and verify participants details should be display based on the selected options
Then select study tags filter options and verify participants details should be display based on the selected options
Then select indication filter options and verify participants details should be display based on the selected options
Then select source filter options and verify participants details should be display based on the selected options
Then search patients tag and verify participants should be display based on the searched tags
Then select age and verify participants details should be display based on the selected age
Then select sex filter options and verify participants details should be display based on the selected options
Then select location filter options and verify participants details should be display based on the selected options
Then click on cancel button and verify filter side bar should be closed or not

@searchParticipants
Scenario Outline: search participants functionality
When open participants page
When search participants name "<participate name>" on search bar
Then verify participants details should be display based on search participants
Examples:
|participate name|
|david|
|kevin|
|jeniffer|





@Concomitantsort
Feature: Concomitant tab functionality
Scenario: To validate concomitant tab sorting functionality
Given user is open participants page and click on any participants
Then click on concomitant 
Then click on Medication / Non-drug therapy header menu
Then click on indication header menu
Then click on Dose, route, frequency header menu
Then click on start date header menu
Then click on date added header menu
Then click on Baseline med header menu
Then click on Continuing post-studyheader menu


@cocomitantTabAddTherapy
Scenario Outline: To validate concomitant tab's add therapy  functionality in new participant page form
Given user is click on any participants of participants page
Then Click on concomitant tab
Then Click on new therapy button
And verify new therapy detail pop-up  form open
Then enter Therapy name "<Therapy>"
Then enter indication "<indication>"
Then enter Dose "<Dose>"
Then select Route of administration "<Route of administration>"
Then select Dose from "<Dose form>"
Then select Schedule/frequency "<Schedule/frequency>"
Then enter Start date of therapy "<Start date>"
Then enter End Date "<End Date>"
Then select option of Baseline medication 
Then select option of continuing at enf of study
Then Click on Add Therapy button
Examples:
|Therapy|indication| Dose | Route of administration |Dose form |Schedule/frequency|Start date |End date |
|Fluoxetine |Pain |200 |oral |tablet |Twice in day|2021-06-14 |2021-06-20 |
|abc |Pain |2 |oral |tablet |once a day|2021-06-22 |2021-06-26 |


@EditTherapy
Scenario Outline: To validate concomitant tab's edit therapy functionality of participant page
Then open url and Click on participate menu
Then click on any participant and click on concomitant tab
Then Click on any Therapy detail and verify therapy details pop up is open or not
Then edit therapy name "<Therapy name>"
And click on add therapy button

Examples:
|Therapy name|
|(updated)|
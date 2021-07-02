@home
Feature: Home Functionality
Scenario: To validate Home page Functionality
Given Launching Application website through url on browser.
Then verify whether home page is open.
Then verify wheather the site logo is present on header.
Then verify all the navigation menu present in header.
And click on Browse studies menu and verify it should be able to navigate on browse studies page
Then click on Patients menu and verify it should be able to navigate on patients page
Then click on Researchers menu and verify it should be able to navigate on Researchers page
Then click on Partners menu and verify it should be able to navigate on partners page
Then click on About us menu and verify it should be able to navigate on About us page
Then click on Login menu and verify it should be able to navigate on Login page
Then click on Sign Up menu and verify it should be able to navigate on Sign Up page
Then verify mouse hover effect on i m reasercher and i m patients blog
Then click on learn more button and verify it should be navigate on respective page.
Then click on Find me match button and verify it should be navigate on respective page.
Then click on browse studies arrow link and verify it should be able to navigate on respective page.
Then click on learn more arrow link in researchers site section and verify it should be able to navigate on respective page.
Then click on learn more arrow link in sponsors section and verify it should be able to navigate on respective page.
Then click on talk to us button and verify it should be navigate on respective page.
And verify mouse hover effect on how it works link and click on how it works link and verify it should be able to navigate on how it works page
Then verify mouse hover effect on browse studies link and click on browse studies link and verify it should be able to navigate on browse studies page
Then verify mouse hover effect on features link and click on features link and verify it should be able to navigate on features page
Then verify mouse hover effect on Help documentation link and click on help documentation link and verify it should be able to navigate on help documentation page
Then verify mouse hover effect on current partners link and click on current partners link and verify it should be able to navigate on current partners page
Then verify mouse hover effect on join us link and click on Join us link and verify it should be able to navigate on join us page
Then verify mouse hover effect on who is sciteline? link and click on who is sciteline? link and verify it should be able to navigate on current who is sciteline? page
Then verify mouse hover effect on contact us link and click on contact us link and verify it should be able to navigate on contact us page

@home1
Scenario: To validate Find me match Functionality for Respiratory on home page 
Given Lunching website through url on browser
Then click on find me match button 
And Choose a condition Respiratory
Then click on next button
Then answer the given questions
And click on Find matches button
Then verify given study details is as per selected condition or not
 
 @home2
 Scenario: To validate Find me match Functionality for Cancer on home page 
Given Lunching website on browser through url
Then click on find me match button on home page
And Choose a condition cancer
Then click on the Next button
Then select answer for the given questions
Then Verify given study details should be display as per selected condition or not
 

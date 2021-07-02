@login
Feature: Login Functionality
Scenario Outline: To validate login functionality
Given url is open on browser 
Then click on login menu
Then enter email "<email>" password "<password>"  
Then select remember me checkbox
And click on login button
Examples:
|email|password|
|     |         |
|demo123.gmail.com|123456|
|demo123@gmail.com||
||12@vrg675|
|demo@gmail.com|123456|
|demo@gmail.com|vgt@1234|
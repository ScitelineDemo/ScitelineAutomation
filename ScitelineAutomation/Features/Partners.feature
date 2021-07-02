@partner
Feature: Partners page Functionality
Scenario Outline: To validate partners page functionality
Given open url through browser
Then Click on partners menu and verify its navigate on respective page
Then verify get in touch functionality
Then Enter firstName "<firstName>" LastName "<LastName>" title "<title>" organization "<organization>" email "<email>" phone "<phone>"
And click on terms and condition checkbox
Then click on submit button
Examples:
|firstName|LastName|title|organization|email|phone|
|         |        |     |            |     |      |
|test|purpose|Demo|Demo|test@sciteline.com|7895462136|
|test|purpose|Demo|Demo|test.sciteline.com|7895462136|
|test|       |Demo|    |test@sciteline.com|7895462136|
|123|456|Demo|Demo|test@sciteline.com|7895462136|
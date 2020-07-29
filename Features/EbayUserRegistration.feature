Feature: Ebay user registration

Scenario Outline: To register for a ebay members account

Given I am on  homepage

When I click on Register
And enter my "<first name>" "<last name>" "<email ID>" "<password>"

Then I can see a successfully account created message

Examples:
|first name   |last name     |email ID                |password  |
|fatima       |akhter        |fatimamannan96@gmail.com|dubai_96  |
|FATIMA       |AKHTER        |fatimamannan96@yahoo.com|Dubai_96  |

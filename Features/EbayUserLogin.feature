Feature: User log in

Scenario Outline: to log in to ebay account

Given I am on ebay homepage]
When I click on Sign in button
And I enter my "<email ID>" and "<password>"

Then I can see a succefully signed in message

Examples:

|email ID                   | password |
|fatimannan96@gmail.com     | dubai_96 |
|mdalim005@yahoo.com        | sylhet005|
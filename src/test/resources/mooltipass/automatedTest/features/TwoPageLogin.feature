Feature: Two Page Login

Scenario: Testing Techmania
Given I navigate to 'https://techmania.ch/'
When I log in Techmania with 'mooltipass' and '!Pass12345'
Then I should be logged in Techmania
When I logout Techmania
Then I should be logged in Techmania


Scenario: Testing gmail
Given I navigate to 'https://gmail.com/'
When I login Gmail with 'Mooltipasstest@gmail.com' and 'Mooltipass123'
Then I should be logged in Gmail
When I logout Gmail
Then I should be logged in Gmail


Scenario: Testing Microspot
Given I navigate to 'https://www.microspot.ch/'
When I go to Microspot login page
When I login Microspot with 'Mooltipasstest@gmail.com' and 'Mooltipass123'
Then I should be logged in Microspot
When I logout Microspot
When I go to Microspot login page
Then I should be logged in Microspot



Feature: Testing mooltipass on different websites

Scenario: Testing stackoverflow
Given I navigate to 'https://stackoverflow.com'
When I go to StackOverFlow login page
When I log in StackOverFlow with 'mooltipass@discard.email' and '!Pass12345'
Then I should be logged in StackOverFlow
When I logout StackOverFlow
And I go to StackOverFlow login page
Then I should be logged in StackOverFlow



Scenario: Testing airbnb
Given I navigate to 'https://www.airbnb.com/'
When I login airBnB with 'citesting@themooltipass.com' and 'testpass123'
Then I should be logged in airBnB
When I logout airBnB
And I go to airBnB login page
Then I should be logged in airBnB

Scenario: Testing dropbox.com
Given I navigate to 'https://www.dropbox.com'
When I login DropBox with 'citesting@themooltipass.com' and 'testpass123'
Then I should be logged in DropBox
When I logout DropBox
Then I should be logged in DropBox


Scenario: Testing ebookers.fr
Given I navigate to 'https://www.ebookers.fr/'
When I login EBookers with 'citesting@themooltipass.com' and 'testpass123'
Then I should be logged in EBookers
When I logout EBookers
And I go to EBookers login page
Then I should be logged in EBookers


Scenario: Testing farnell.com
Given I navigate to 'https://ch.farnell.com/'
When I login Farnel with 'Mooltipass' and 'Testpass123'
Then I should be logged in Farnel
When I logout Farnel
And I go to Farnel login page
Then I should be logged in Farnel



Scenario: Testing ebay.com
Given I navigate to 'http://www.ebay.com'
When I login EBay with 'citesting@themooltipass.com' and 'testpass123'
Then I should be logged in EBay
When I logout EBay
And I go to EBay login page
Then I should be logged in EBay


@run
Scenario: Testing alibaba.com
Given I navigate to 'http://www.alibaba.com/'
When I login AliBaba with 'citesting@themooltipass.com' and 'testpass123'
Then I should be logged in AliBaba
When I logout AliBaba
And I go to EBay login page
Then I should be logged in AliBaba


Scenario: Testing anibis.ch
Scenario: Testing esp8266.com
Scenario: Testing etsy.com
Scenario: Testing evernote.com
Scenario: Testing facebook.com
Scenario: Testing farnell.com
Scenario: Testing fastcoin.ch
Scenario: Testing firefox.com
Scenario: Testing github.com
Scenario: Testing hackaday.io
Scenario: Testing forum.hardware.fr
Scenario: Testing indiegogo.com
Scenario: Testing ldlc.ch
Scenario: Testing linkedin.com
Scenario: Testing patreon.com
Scenario: Testing paypal.com
Scenario: Testing pcbway.com
Scenario: Testing protonmail.com
Scenario: Testing qoqa.ch
Scenario: Testing reddit.com
Scenario: Testing ricardo.ch
Scenario: Testing tindie.com
Scenario: Testing tripadvisor.com
Scenario: Testing pc-ostschweiz.ch
Scenario: Testing https://www.kenwoodworld.com/uk/account/sign-in
Scenario: Testing https://www.flightradar24.com
Scenario: Testing https://ergodirekt.de/de/persoenlicherbereich.html
Scenario: Testing https://www.komoot.de/
Scenario: Testing https://www.oister.dk
Scenario: Testing http://www.metacritic.com/
Scenario: Testing https://workbench.cisecurity.org/
Scenario: Testing https://vk.com/
Scenario: Testing https://www.trillian.im/web/4.0/
Scenario: Testing http://minfin.com.ua
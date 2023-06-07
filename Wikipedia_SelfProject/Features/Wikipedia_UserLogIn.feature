Feature: Testing Login and Website Functionality of Wikipedia

Background: User will be able to login with the correct information

Given User opens browser
And Navigates to "https://www.wikipedia.org/"
And Selects English as the desired choice of language 
When User clicks on the Log In button on the webpage
And User enters the correct username
And User enters the correct password
Then Clicks on the Log In button on the log in page
And The user is successfully logged in
And The user name is displayed and taken to the home page

#Scenario001
Scenario: User is able to the search functionality of Wikipedia

Given The user is logged in and on the home page
When User clicks on the search field 
And Enters "Formula One" on the search field
And User clicks on the Search button
Then User is able to see the search results
When User clicks on the Contents icon to open menu
And User toggles on the Grands Prix dropdown
And Clicks on the Future Grands Prix option
Then User is taken to Future Grand Prix source
And User scrolls down to Revenue and Profits source

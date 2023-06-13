Feature: Testing Wikipedia Negative Login Functionality

Scenario Outline: This will test all the incorrect usernames and incorrect passwords

Given User opens the browser
And Naviagtes to "https://www.wikipedia.org/"
And User selects English as the desired choice of language 
When User clicks on the Log In button on the webpage and taken to the Log In page
When User enters incorret "<Username>" and incorrect "<Password>"
Then Clicks on the Log In button on the Log In page
And The user is expected to get an error message

#Adding more Username and Password to test will trigger captcha
#If captcha gets enabled then please delete cookies
Examples:
|			 Username		 |				Password				|
|	  	QA.Test002 	 |		 WiKi@QATest001 		|
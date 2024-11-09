Feature: Login functionality of leaftaps application

#Background keyword is to have common steps in the feature file i.e to avoid duplication can use common lines in background , but it is applicable only to that particular feature file so it is 
#the disadvantage of using background keyword so to rectify this disadvantage we are using cucumber hooks. 

Scenario: Login with valid credentials

When Enter the username as 'DemoCSR'
And Enter the password as crmsfa
And Click on the login button
Then It should navigated to the next page


Scenario: Login with invalid credentials


When Enter the username as 'Demo'
And Enter the password as crmsfa
And Click on the login button
Then It should throw the error message





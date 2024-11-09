Feature: CreadLead functionality of leaftaps application

Scenario Outline: CreateLead with multiple set of data


When Enter the username as 'DemoCSR'
And Enter the password as 'crmsfa'
And Click on the login button
Then It should navigate to the next page
When Click on the Crmsfa link
And Click on the leads link
And Click on the Createleads link
And Enter the companyname as <companyname>
And Enter the firstname as <firstname>
And Enter the lastname as <lastname>
And Click on the CreateLeadButton
Then Lead should be created

Examples:
|companyname|firstname|lastname|
|Testleaf|Vineeth|Rajendran|
|Qeagle|Hari|R|
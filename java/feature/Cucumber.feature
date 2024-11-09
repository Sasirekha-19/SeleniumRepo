Feature: Create Account functionality in salesforce application

Scenario: Create Account with valid name
Given Launch the browser
And Load the url
When Enter the username as dilip@testleaf.com
And Enter the password as leaf@2024
And Click login button
And Click on toggle menu button
And Click View All
And Click Sales from App Launcher
And Click on Accounts tab
And Click on New button 
And Enter name in the Account name field
And Select Ownership as Public
And Click save
Then Account should be created with the given name

Feature: Edit Account functionality in salesforce application

Scenario: Edit Account with valid details
Given Launch the browser
And Load the url
When Enter the username as dilip@testleaf.com
And Enter the password as leaf@2024
And Click login button
And Click the App Launcher Icon
And Click View All
And Click Accounts
And Search for the account using unique account name
And Click the dropdown icon next to the account and select Edit
And Set Type to Technology Partner
And Set Industry to Healthcare
And Enter the Billing Address as 'No.2,Business park, Chennai'
And Enter the Shipping Address as 'No.2,Business park, Chennai'
And Set Customer Priority to Low
And Set Customer Priority to Low
And Set SLA to Silver 
And Set Active to NO
And Enter a unique number in the Phone field '8888888888'
And Set Upsell Opportunity to No 
And Click Save
Then Account should be displayed with the given phone number

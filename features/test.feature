Feature: signup feature


Scenario: user enters the details
Given the signup page is opened
When user enters subhashini as username
And user enters subhashini as first name
And user enters sivamurugan as last name
And user enters Subha1998 as password
And user enters Subha1998 as confirm password
And user select female as gender
And user enters subhabtech191@gmail.com as email
And user enters 9566569030 as phone number
And user select 04/023/1998 as DOB
And user enters tirupur,tamilnadu as address
And user select what is your pet name as security question
And user enters rocy as answer for security question
Then user will Finds a testmeapp homepage
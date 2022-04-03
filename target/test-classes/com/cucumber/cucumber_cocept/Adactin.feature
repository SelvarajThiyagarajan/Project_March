Feature: Hotel Booking Application

@abc
Scenario: Login page

Given user Launch The Adactin Url  
When user Enter The Username In Username Field
And  user Enter The Password In Password Field
Then user Click The Login Button And It Navigates To Search Hotel Page

Scenario: Search Hotel

When user Select The Hotel Location
And user Select The Hotel
And user Select The Room Type 
And user Select The Number Of Rooms
And user Enter The Check In Date In Check In Field
And user Enter The Check Out Date In  Check Out Field
And user Select The Adults Per Room 
And user Select The Children Per Room
Then user Click The Search Button And It Navigates To Select Hotel Page

Scenario: Select Hotel

When user Slecet The Hotel
Then user Click The Continue Button And It Navigates To The Book A Hotel Page

Scenario: Book A Hotel

When user Enter The First Name In First Name Field
And user Enter The Last Name In Last Name Field
And user Enter The Address in Address Field
And user Enter The Credit Card No In Credit Card Field
And user Select The Credit Card Type
And user Select The Credit Card Exp Month
And user Select The Credit Card Exp Year
And user Enter The CVV Number In CVV Field
Then user Click The Book Now Button





 





 
      
      
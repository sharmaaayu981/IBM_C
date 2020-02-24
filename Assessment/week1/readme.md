## Problem 1  
Build an application with the following features:  
	- User wants to get login and provides email-id and password via console.  
	- User data will be delegated to Business layer for validation.  
		- email-id and password must not be null or empty.  
		- email-id must be valid email id.  
		- Password must have at least 8 characters.  
		- If above scenarios are not fulfilled, throw custom exception with proper message otherwise continue.  
	- After validation is done, user data will be delegated to dao layer for authentication.  
		- Already 5 users are stored (use array as your database here)  
		- If email-id is not found, throw exception with message "Invalid email-id".  
		- If email-id found but password is not correct, throw exception with message "Invalid password"  
		- If email-id and password are correct, return user.  
	- In all scenarios, User must see all the info in his screen.   

Class User -> name, email-id, password, age  



## Problem 2  
 class Department  
	- String name  
	
 class Employee  
	- String name  
	- Int age
	- String gender;
	- Long salary
	- Address address
	- Date date_of_join
	
 class Address  
	- String city;
	- String state;
	- String country;
	
Department wants to distribute bonus to employees.  
	1. IT and Security departments will distribute 2% and 3% bonus respectively to each employee.
	2. If employee is not from India, no further bonus will be distributed.
	3. If employee is male and experience is more than 5 years, bonus will be 10% of the salary
	4. If employee is female and experience is more than 5 years, bonus will be 12% of the salary
	5. If employee's experience is not more than 5 years, bonus will be 5% of the salary

Department  
	- IT  
		- Employees
			• Ram, 31, Male, 12,00,000, [Delhi, Delhi, India], 2013
			• Mark, 25, Male, 8,00,000, [Tokyo, Tokyo, Japan], 2015
	- Security
		- Employees
			• Mike, 28, Male, 7,00,000, [Pune, Maharashtra, India], 2017
			• Miley, 31, Female, 13,00,000, [Bangalore, Karnataka, India], 2014
	- HR
		- Employees
			• Carl, 27, Male, 11,00,000, [Kanpur, UP, India], 2018
			• Eva, 35, Female, 9,00,000, [Bangalore, Karnataka, India], 2011
			
			
